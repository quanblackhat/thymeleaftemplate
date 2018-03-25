package com.quangtk.DemoThymleaf.controller;


import com.quangtk.DemoThymleaf.Constant;
import com.quangtk.DemoThymleaf.form.PersonForm;
import com.quangtk.DemoThymleaf.model.Person;
import com.quangtk.DemoThymleaf.model.Profile;
import com.quangtk.DemoThymleaf.model.ProfileForm;
import com.quangtk.DemoThymleaf.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class MainController {

	private static List<Person> persons = new ArrayList<>();
    private User user = new User(1, "Ngoc Trinh", 12, 2, 34, 45);
    private Profile profile = new Profile(1, "Quang", "Tran", "Junior Developer",
            "0234326564", "01205926286", "12/11/1992", "myEmail@gmail.com", "Vietnam");

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @GetMapping({"/", "/index"})
	public String index(Model model) {
        ArrayList<String> months = new ArrayList<>(
                Arrays.asList("JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL","AUG", "SEP", "OCT", "NOV", "DEC"));
        Map<String, Integer> earningsMap = new HashMap<>();
        months.forEach(month -> {
            double randNumber = Math.random();
            double temp = randNumber * 100;
            int randomInt = (int) temp + 1;
            earningsMap.put(month, randomInt);
        });

        model.addAttribute("user", user);
        model.addAttribute("earningsMap", earningsMap);
		return Constant.TEMPLATE_INDEX;
	}

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("profile", profile);
        return "profile";
    }

    @GetMapping("/registration")
    private String registration(Model model) {
        ProfileForm profileForm = new ProfileForm();
        model.addAttribute("profileForm", profileForm);
        return "registration";
    }

    @PostMapping("/addProfile")
    public String addProfile(Model model, @ModelAttribute("profileForm") ProfileForm profileForm) {
        profile.setFirstName(profileForm.getFirstName());
        profile.setLastName(profileForm.getLastName());
        profile.setCountry(profileForm.getCountry());
        profile.setEmail(profile.getEmail());
        profile.setDob("Unknown");
        profile.setMobilePhone("Unknown");
        profile.setOccupation("Unknown");
        profile.setPhone("Unknown");
        model.addAttribute("profile", profile);
        return "redirect:/profile";
    }

    @GetMapping("/gallery")
    private String gallery(Model model) {
        return "gallery";
    }

    @GetMapping("/todo-list")
    private String todoList(Model model) {
        return "todoList";
    }

    @GetMapping("/inbox")
    private String inbox(Model model) {
        return "inbox";
    }
}