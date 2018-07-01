package com.codework.bluegreendeployment;


import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MessageController {

    private  String color = null;

    private  String message = null;

    public MessageController(final Environment environment) {
        this.color = environment.getProperty("COLOR") != null ? environment.getProperty("COLOR") : "blue";
        this.message = environment.getProperty("MESSAGE") != null ? environment.getProperty("MESSAGE") : "Pivotal Cloud Foundry Blue Green Deployment Example";

    }

    @RequestMapping("/")
    public String getMapping(final Map<String,Object> model){
        model.put("color",color);
        model.put("message",message);
        return "index";


    }




}
