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
public class Controller2 {

@Autowired
private JdbcTemplate jdbcTemplate;

@RequestMapping(value = "/",params = "kousaku", method = RequestMethod.POST)
public String home2(@ModelAttribute FormModel1 fm, Model model) {

List<Map<String, Object>>  list5 = jdbcTemplate.queryForList("select * from "
		+ "tbaddress_table where id="+fm.getRadio()+"");
        model.addAttribute("LIST2", list5);
        model.addAttribute("KOUSIN", fm);
return "Kousaku";
}
@RequestMapping(value = "/",params = "kou", method = RequestMethod.POST)
public String kousinn(@ModelAttribute FormModel1 fm, Model model){

	String NAME2 = fm.getSimei2();
	String ZYUUSYO2 = fm.getZyuusyo2();
	String DENNWA2 = fm.getDennwa2();

	if (NAME2.equals("")&&
    		ZYUUSYO2.equals("")&&
    				DENNWA2.equals("")) {

    	return "Koumiss";
        }else{
  	  		if(NAME2 == ""){
  	  		NAME2 = fm.getName000();
	    		}
	    		if(ZYUUSYO2 == ""){
	    			ZYUUSYO2 = fm.getAddress000();
	    		}
	    		if(DENNWA2 == ""){
	    			DENNWA2 = fm.getTel000();
	    		}


 @SuppressWarnings("unused")
List<Map<String, Object>>  list4 = jdbcTemplate.queryForList("select * from tbaddress_table");

jdbcTemplate.update(""
 		+ "update tbaddress_table set"
  	    				+ " name='"+NAME2+"', address='"+ZYUUSYO2+"', tel='"+DENNWA2+"'"
  	    						+ "where id="+fm.getId000()+"");
    model.addAttribute("SAKUZYOC", fm);
    return "Kousuccess";

    }
}
@RequestMapping(value = "/",params = "itirann", method = RequestMethod.POST)
public String itirann(Model model){
	FormModel1 fm1 = new FormModel1();
	model.addAttribute("itiRAN", fm1);
	List<Map<String, Object>>  list = jdbcTemplate.queryForList("select * from tbaddress_table");

    model.addAttribute("LIST", list);
	return "Itiran";
}
}
