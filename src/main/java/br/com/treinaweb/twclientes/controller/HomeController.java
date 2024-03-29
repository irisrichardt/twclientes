package br.com.treinaweb.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/mensagem")
    public ModelAndView mensagem() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Mensagem vinda do servidor!");

        return modelAndView;
    }

    @GetMapping("/saudacao/{nome}")
    public ModelAndView saudacao(@PathVariable String nome) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);

        return modelAndView;
    }

    // cumprimento?nome=Ana
    @GetMapping("/cumprimento")
    public ModelAndView cumprimento(@RequestParam(required = false, defaultValue = "Iris") String nome) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("cumprimento");
        modelAndView.addObject("nome", nome);

        return modelAndView;
    }

}
