package BenaSPACE.Envoy_Prog_Tracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

@Controller
@RequestMapping
public class WebPageController {

    @Test
    @GetMapping("/HelloWorld")
    public String helloWorld() throws FileNotFoundException {
        return "HelloWorld.html";
    }
}
