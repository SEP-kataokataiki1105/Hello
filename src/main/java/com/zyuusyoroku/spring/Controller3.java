package com.zyuusyoroku.spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller3 {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/",params = "sakuzyoc", method = RequestMethod.POST)
	public String sakuzyo(@ModelAttribute FormModel1 fm, Model model) {
		List<Map<String, Object>>  list6 = jdbcTemplate.queryForList("select * from "
				+ "tbaddress_table where id="+fm.getId00()+"");
		        model.addAttribute("LIST3", list6);
		        model.addAttribute("SAKUZYO", fm);

		return "Sakucheck";

}
	@RequestMapping(value = "/",params = "sakuzyo", method = RequestMethod.POST)
	public String sakuzyo1(@ModelAttribute FormModel1 fm, Model model) {
	jdbcTemplate.update("delete from "
				+ "tbaddress_table where id="+fm.getId0()+"");

		return "Sakusuccess";

}
}
