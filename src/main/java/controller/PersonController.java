package controller;

import java.util.List;

import model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.IPersonService;

@Controller
@RequestMapping("/personController")
public class PersonController {
	
	private IPersonService personService;

	public IPersonService getPersonService() {
		return personService;
	}
	
	@Autowired
	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping("showPerson")
	public String showPersons(Model model){
		List<Person> persons = personService.loadPersons();
		model.addAttribute("persons", persons);
		return "showperson";
	}
	
	@RequestMapping("showNews")
	public String showNews(Model model){
		model.addAttribute("list", "chaos");
		return "NewFile";
	}
	

}
