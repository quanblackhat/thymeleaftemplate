package com.quangtk.DemoThymleaf.controller;


import com.quangtk.DemoThymleaf.Constant;
import com.quangtk.DemoThymleaf.form.PersonForm;
import com.quangtk.DemoThymleaf.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

	private static List<Person> persons = new ArrayList<>();

	static {
		persons.add(new Person("Bill", "Gates"));
		persons.add(new Person("Steve", "Jobs"));
		persons.add(new Person("Nam", "Jo"));
		persons.add(new Person("Steve", "Ills"));
		persons.add(new Person("Lovren", "Jobs"));
	}

	@Value("${welcome.message}")
	private String message;

	@Value("${error.message}")
	private String errorMessage;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", message);
		return Constant.TEMPLATE_INDEX;
	}

	@GetMapping("/personList")
	public String personList(Model model) {

		model.addAttribute("persons", persons);
		return Constant.TEMPLATE_PERSON_LIST;
	}

	@GetMapping("/addPerson")
	public String showAddPersonPage(Model model) {
		PersonForm personForm = new PersonForm();
		model.addAttribute("personForm", personForm);
		return Constant.TEMPLATE_ADD_PERSON;
	}

	@PostMapping("/addPerson")
	public String savePerson(Model model, @ModelAttribute("personForm") PersonForm personForm) {
		String firstName = personForm.getFirstName();
		String lastName = personForm.getLastName();
		if (firstName != null && firstName.length() > 0
				&& lastName != null && lastName.length() > 0) {
			Person newPerson = new Person(firstName, lastName);
			persons.add(newPerson);
			return "redirect:/personList";
		}
		model.addAttribute("errorMessage", errorMessage);
		return Constant.TEMPLATE_ADD_PERSON;
	}

	@GetMapping("/about")
	public String about(Model model){
		return "about";
	}
}