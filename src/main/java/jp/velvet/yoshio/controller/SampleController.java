package jp.velvet.yoshio.controller;

import java.util.List;

import jp.velvet.yoshio.entity.MemberForm;
import jp.velvet.yoshio.logic.SampleService;
import jp.velvet.yoshio.mybatis.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@RequestMapping(value = "/", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView request() {
		List<Member> members = sampleService.selectAll();
		return new ModelAndView("index", "members", members);
	}

	@RequestMapping(value = "/save", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView save(@ModelAttribute("memberForm") MemberForm memberForm) {
		List<Member> members = memberForm.getMembers();
		sampleService.save(members);
		members = sampleService.selectAll();
		return new ModelAndView("index", "members", members);
	}

}
