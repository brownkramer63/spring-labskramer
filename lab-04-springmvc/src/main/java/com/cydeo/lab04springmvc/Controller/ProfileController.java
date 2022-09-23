package com.cydeo.lab04springmvc.Controller;

import com.cydeo.lab04springmvc.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String retrieveProfile(Model model){
        Profile newprofile= new Profile();
        //we need to assign all values to the profile object
        newprofile.setName("Kramer");
        newprofile.setEmail("brownkramer63@gmail.com");
        newprofile.setUserName("brownkramer63");
        newprofile.setSurname("brown");
        newprofile.setPhoneNumber("2177413554");
        newprofile.setCreatedDate(LocalDateTime.now());

        model.addAttribute("profile", newprofile );


        return "profile/profile-info";
    }


}
