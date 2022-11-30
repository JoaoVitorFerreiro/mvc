package br.edu.fatecrl.mvc.controllers;

import br.edu.fatecrl.mvc.models.Moto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/motos")
public class MotoAPI {

    private static final List<Moto> motos = new ArrayList<Moto>();

    public MotoAPI() {
        motos.add(new Moto("Z1000","Kawasaki",2022,52000));
        motos.add(new Moto("Mt03","Yamaha",2018,20000));
        motos.add(new Moto("Fz250","Yamaha",2022,16000));
    }

    @GetMapping
    public String getMotos(Model model)
    {
        model.addAttribute("motos", motos);
        return "motos";

    }
}