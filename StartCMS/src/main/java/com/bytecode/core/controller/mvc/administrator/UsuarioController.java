package com.bytecode.core.controller.mvc.administrator;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin/usuario")
public class UsuarioController {
    @Autowired
    private HttpServletRequest httpServletRequest;

    @GetMapping
    public ModelAndView getHome(Model model) {
        model.addAttribute("httpServletRequest", httpServletRequest);
        return new ModelAndView("administrator/usuario");
    }
}
