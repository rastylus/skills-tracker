package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String skillsList() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Languages</h2>" +
                            "<ol>" +
                                "<li>Java</li>" +
                                "<li>Javascript</li>" +
                                "<li>Python</li>" +
                            "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String nameSelectForm() {
        return   "<html>" +
                    "<body>" +
                        "<form method = 'post' action = '/form'>" +

                            "<label>Name:</label> </br>" +
                            "<input type = 'text' name = 'name'/> <br />" +

                            " <label for='languages'>My Favorite " +
                                "Language:</label> <br />\n" +
                                    "\n" +
                                    "<select name='lang1'' " +
                                    "id='languages'>\n" +
                                    "<option value='Java'>Java</option>\n" +
                                    "<option value='JavaScript'>Javascript" +
                                    "</option>\n" +
                                    "<option value='Python'>Python" +
                                    "</option>\n" +
                                    "</select> <br />" +

                            " <label for='languages'>My Second Favorite " +
                                "Language:</label> <br />\n" +
                                    "\n" +
                                    "<select name='lang2'' " +
                                    "id='languages'>\n" +
                                    "<option value='Java'>Java</option>\n" +
                                    "<option value='JavaScript'>Javascript" +
                                    "</option>\n" +
                                    "<option value='Python'>Python" +
                                    "</option>\n" +
                                    "</select> <br />" +

                            " <label for='languages'>My Third Favorite " +
                                "Language:</label> <br />\n" +
                                    "\n" +
                                    "<select name='lang3'' " +
                                    "id='languages'>\n" +
                                    "<option value='Java'>Java</option>\n" +
                                    "<option value='JavaScript'>Javascript" +
                                    "</option>\n" +
                                    "<option value='Python'>Python" +
                                    "</option>\n" +
                                    "</select> <br />" +

                            "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String formSubmit(@RequestParam String name,
                             @RequestParam String lang1,
                             @RequestParam String lang2,
                             @RequestParam String lang3) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>";
    }

}
