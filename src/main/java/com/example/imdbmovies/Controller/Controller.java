package com.example.imdbmovies.Controller;
import com.example.imdbmovies.Model.*;
import com.example.imdbmovies.View.View;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcome()
    {
        return "This application will provide information about movies";
    }

    @GetMapping("/chooseFunction")
    public String chooseFunction(@RequestParam String option) throws FileNotFoundException {
        Model model = new Model();
        View view = new View();

        model.storeFile();
        switch(option)
        {
            case "random-ten":
                return view.getTenSortbyPopularity();
            case "random-movie":
                return view.getRandom();
            case "get-first":
                return view.getFirst();
            case "award-count":
                return view.howManyWonAnAward();
            default:
                return "Wrong input";
        }
    }
}
