package jp.velvet.yoshio.controller;

import java.util.List;

import jp.velvet.yoshio.entity.MemberForm;
import jp.velvet.yoshio.mybatis.Member;
import jp.velvet.yoshio.service.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// コントローラとして定義
@Controller
@RequestMapping(method = { RequestMethod.GET,
		RequestMethod.POST })
public class SampleController {

	// インジェクションする
	@Autowired
	private SampleService sampleService;

	// GETかPOSTメソッドでurlが/のリクエストを受け取る
	@RequestMapping(value = "/")
	public ModelAndView request() {
		List<Member> members = sampleService.selectAll();
		return new ModelAndView("index", "members", members);
	}

	// GETかPOSTメソッドでurlが/saveのリクエストを受け取る
	@RequestMapping(value = "/save")
	public ModelAndView save(MemberForm memberForm) {
		List<Member> members = memberForm.getMembers();
		sampleService.save(members);
		members = sampleService.selectAll();
		return new ModelAndView("index", "members", members);
	}

}