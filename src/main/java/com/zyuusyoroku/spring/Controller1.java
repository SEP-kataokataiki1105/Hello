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
public class Controller1 {

@Autowired
private JdbcTemplate jdbcTemplate;

@RequestMapping(value = "/", method = RequestMethod.GET)
public String home(Model model) {
	FormModel1 fm = new FormModel1();
	model.addAttribute("formmodel", fm);

return "Registration";
}
@RequestMapping(value = "/",params = "touroku", method = RequestMethod.POST)
public String touroku(@ModelAttribute FormModel1 fm1, Model model){

	String NAME = fm1.getSimei();
	String ZYUUSYO = fm1.getZyuusyo();
	String DENNWA = fm1.getDennwa();
    if (NAME.equals("") || NAME == null ||
    		ZYUUSYO.equals("") ||ZYUUSYO == null||
    				DENNWA.equals("")||DENNWA == null) {
    	return "Regmiss";
        }else{
 @SuppressWarnings("unused")
List<Map<String, Object>>  list2 = jdbcTemplate.queryForList("select max(id) from tbaddress_table");

jdbcTemplate.update(""
 		+ "insert into tbaddress_table (id, name, address, tel) "
	  		+ "select case when max(id) is null then 1 "
	  		+ "else max(id) + 1 end, '"+NAME+"', '"+ZYUUSYO+"', '"+DENNWA+"' "
	  				+ "from tbaddress_table");

    return "Regsuccess";

    }
}
@RequestMapping(value = "/",params = "itiran", method = RequestMethod.POST)
public String itiran(Model model){
	FormModel1 fm1 = new FormModel1();
	model.addAttribute("itiRAN", fm1);
	List<Map<String, Object>>  list = jdbcTemplate.queryForList("select * from tbaddress_table");

    model.addAttribute("LIST", list);

	model.addAttribute("kouSAKU", fm1);
	return "Itiran";
}
}

