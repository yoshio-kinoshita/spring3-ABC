package jp.velvet.yoshio.controller;

import java.util.List;

import jp.velvet.yoshio.logic.IndexService;
import jp.velvet.yoshio.mybatis.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;

	@RequestMapping(value = "/", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String request(Model model) {
		List<Member> members = indexService.exec();
		model.addAttribute("members", members);
		return "index";
	}

}
