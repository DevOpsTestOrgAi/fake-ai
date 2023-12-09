package com.aimodelapp.aimodelapp.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v2/suggest-keywords")
public class getSuggestedKeywords {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<String>> getSuggestedKeywords(@RequestParam String category) {

        List<String> suggestedKeywords = getSuggestionsBasedOnKeyword(category);
        return new ResponseEntity<>(suggestedKeywords, HttpStatus.OK);
    }

    private List<String> getSuggestionsBasedOnKeyword(String category) {


            return List.of("laptop",  "ssd");


    }
}