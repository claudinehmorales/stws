package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aws.codestar.projecttemplates.Response;

import com.aws.codestar.projecttemplates.util.*;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    
    
    static Name name = new Name("Coder", "Carl", "N");
    static String stringName = name.toString();
    
    private static final String MESSAGE_FORMAT = "Hello, %s";

    @RequestMapping(method = RequestMethod.GET)
    public Response helloWorldGet(@RequestParam(value = "name", defaultValue = "World") String name) {
    	return new Response(String.format(MESSAGE_FORMAT, stringName));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
    	return new Response(String.format(MESSAGE_FORMAT, stringName));
    }
}