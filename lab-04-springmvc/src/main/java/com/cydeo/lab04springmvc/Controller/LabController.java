package com.cydeo.lab04springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {

    @RequestMapping("/lab")
    public String getListOfLab(Model model){
    model.addAttribute("firstLab", "lab-00-coupling");
    model.addAttribute("secondLab", "lab-01-IOC");
    model.addAttribute("thirdLab", "lab-03-SpringBoot");
    model.addAttribute("fourthLab", "lab-04-SpringMVC");
    model.addAttribute("fifthLab", "lab-05-SpringThymeLeaf");

        return "lab/lab-list";
    }
}
