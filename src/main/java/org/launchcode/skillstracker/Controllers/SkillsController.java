package org.launchcode.skillstracker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String displayHomePage(){
        return
               "<html>" +
                "<body>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2> " +
                 "Here are some programming languages: " +
                "</h2>" +
                "<ul>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "<li>Dialogue</li>" +
                "</ul>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String displayForm(){
       return
               "<html>" +
               "<body>" +
               "<form name = languageForm method = GET>" +
               "<label> Name: </label>" +
               "<Input name = name> </>" +
               "<br/>" +
               "<br/>" +
               "<label>My favorite language is: </label>" +
               "<select name = favorite>" +
               "<option value = Java> Java </option>" +
               "<option value = C++> C++ </option>" +
               "<option value = Dialogue> Dialogue </option>" +
               "<br/>" +
               "</select>" +
               "<br/>" +
               "<label>My second favorite language is: </label>" +
               "<select name =  secondFavorite>" +
               "<option value = Java> Java </option>" +
               "<option value = C++> C++ </option>" +
               "<option value = Dialogue> Dialogue </option>" +
               "<br/>" +
               "</select>" +
               "<br/>" +
               "<label>My third favorite language is: </label>" +
               "<select name = thirdFavorite>" +
               "<option value = Java> Java </option>" +
               "<option value = C++> C++ </option>" +
               "<option value = Dialogue> Dialogue </option>" +
               "</select>" +
               "</form>" +
               "</body>" +
               "</html>" +
               "<button type = submit> Submit </button>";

    }

    //@PostMapping("/form")
    public String submittedForm(@RequestParam String name,
                                @RequestParam String favorite,
                                @RequestParam String secondFavorite,
                                @RequestParam String thirdFavorite
                                ){
        //languageForm
        return
                "<html>" +
                 "<body>" +
                 "<form name = languageForm form action = /form method = POST>" +
                 "<h1> name </h1>" +
                 "<ol>" +
                 "<li>favorite </li>" +
                 "<li>secondFavorite </li>" +
                 "<li>thirdFavorite </li>" +
                 "</ol>" +
                 "</body>" +
                 "</html>";
    }

}


//localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite, and third favorite programming languages on your list.

// Use select elements for each of the rankings.
// use @GetMapping().
// use @PostMapping and @RequestParam
// update the HTML with a h1 stating the user’s name and an ol showing the three programming languages in the order they chose.