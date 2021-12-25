package com.example.demoGit;

@RestController
public class DemoController {

    @RequestMapping
    public String name() {
        return "Meku Anteneh";
    }
}
