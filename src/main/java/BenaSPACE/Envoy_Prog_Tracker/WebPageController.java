package BenaSPACE.Envoy_Prog_Tracker;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.io.Resources;
import com.hubspot.jinjava.Jinjava;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

@Controller
@RequestMapping
public class WebPageController {
    static private Jinjava jj = new Jinjava();
    static private ObjectMapper om = new ObjectMapper();

    @ResponseBody
    @GetMapping("/HelloWorld")
    public String helloWorld() throws IOException {
        Map<String, Object> context = Maps.newHashMap();

        context.put("name", "Doofis");

        String template = Resources.toString(Resources.getResource("static/HelloWorld.html"),
                Charset.defaultCharset());

        return jj.render(template, context);
    }

    @ResponseBody
    @Test
    @GetMapping("/test")
    public String test() throws IOException {
        //Fetch api information from URL.
        //Side note, make sure to say, "ID" and not "IDs".
        //I made that mistake, and I effectively threw solutions at a problem that shouldn't have been.
        URL url = new URL(String.format("https://api.guildwars2.com/v2/account/achievements?id=%d&access_token=%s",
                EnvoyArmorI.getId(), APIKeys.AmbiAPI));//API keys are stored separately for testing purposes only.
        System.out.println(url.toString());

        try {
            //For whatever reason, if a player hasn't unlocked an achievement, it throws a 404
            //instead of using its actual in-json property to denote it's not unlocked.
            JsonNode json = om.readTree(url);
            String jsonString = json.toPrettyString();

            EnvoyArmorI EVI = om.readValue(jsonString, EnvoyArmorI.class);

            return EVI.toString();
        }
        catch(FileNotFoundException e) {
            System.out.println("It 404'd");
            EnvoyArmorI EVI = new EnvoyArmorI().withCurrent(0).withDone(false).withUnlocked(false);

            return EVI.toString();
        }
    }
}
