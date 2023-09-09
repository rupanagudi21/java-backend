package com.example.tcs.demo.Controller1;


import com.example.tcs.demo.model.CandidateDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v2")
public class CandidateController1 {
    @PostMapping("/register")
    public String signup(@RequestBody CandidateDetails candidatedetails){
        System.out.println(candidatedetails.getEmail());
        System.out.println(candidatedetails.getName());
        System.out.println(candidatedetails.getPhoneNumber());
        System.out.println(candidatedetails.getAge());
        System.out.println(candidatedetails.getPassword());
        return "Homepage";

    }



}
