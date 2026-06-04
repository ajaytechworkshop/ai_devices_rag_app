package org.atw.javalabs.devices.rag.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevicesApi {

    @GetMapping
    public String welcome(){
        return "⚙WELCOME TO THE WORLD OF BARE METALS, LETS EMBED AND HAVE FUN ⚡";
    }
}
