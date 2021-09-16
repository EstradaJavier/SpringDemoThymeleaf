package com.SpringDemoThymeleaf.SpringDemoThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model) {

        model.addAttribute("people", Arrays.asList(
                new Person("Jaiver", 58),
                new Person("Alesha", 42),
                new Person("Bear", 3)
        ));

//  ----------  Here thymeleaf know to get the html file called "people"
//  ----------  that is located in the templates directory.
        return "people";
    }
}
