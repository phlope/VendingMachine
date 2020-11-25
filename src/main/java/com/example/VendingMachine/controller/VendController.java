package com.example.VendingMachine.controller;

import com.example.VendingMachine.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VendController {

    @RequestMapping("/vend")
    public String machine(@RequestParam(name = "name", required = false, defaultValue ="janky") String name, Model model)
    {
        model.addAttribute("name", name);
        return "vend";
    }

    @GetMapping("/purchase")
    public String purchaseForm(Model model) {
        model.addAttribute("item", new Item());
        return "purchase";
    }

    @PostMapping("/purchase")
    public String purchaseSubmit(@ModelAttribute Item item, Model model) {
        model.addAttribute("item", item);
        return "result";
    }
}