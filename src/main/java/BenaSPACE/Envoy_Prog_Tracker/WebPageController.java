package BenaSPACE.Envoy_Prog_Tracker;

import com.google.common.io.Resources;
import com.hubspot.jinjava.Jinjava;
import com.hubspot.jinjava.JinjavaConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

@Controller
@RequestMapping
public class WebPageController {
    static private Jinjava jj = new Jinjava();


    @ResponseBody
    @GetMapping("/HelloWorld")
    public String helloWorld() throws IOException {
        Map<String, Object> context = Maps.newHashMap();
        context.put("name", "Doofis");

        String template = Resources.toString(Resources.getResource("static/HelloWorld.html"), Charset.defaultCharset());

        return jj.render(template, context);
    }
}
