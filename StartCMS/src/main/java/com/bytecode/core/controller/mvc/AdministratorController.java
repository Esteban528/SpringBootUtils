package com.bytecode.core.controller.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdministratorController {
    @Autowired
    private HttpServletRequest httpServletRequest;
    @GetMapping("/")
    @ModelAttribute
    public ModelAndView getHome(Model model) {
        model.addAttribute("httpServletRequest", httpServletRequest);
        return new ModelAndView("administrator/admin");
    }
}
