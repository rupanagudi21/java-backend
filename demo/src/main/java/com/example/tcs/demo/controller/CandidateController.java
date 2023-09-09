package com.example.tcs.demo.controller;

import com.example.tcs.demo.model.CandidateDetails;
import com.example.tcs.demo.model.CandidateLogin;
import com.example.tcs.demo.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CandidateController {
    @Autowired CandidateRepository repository;
    @PostMapping("/signin")
    @CrossOrigin(origins = "http://localhost:3000")
    public String signin(@RequestBody CandidateLogin candidatelogin){
        CandidateDetails candidatedetails=repository.findByEmail(candidatelogin.getEmail());
           if(candidatedetails!=null){
               String DBPassword= candidatedetails.getPassword();
               String userPassword= candidatelogin.getPassword();
               if(DBPassword.equals(userPassword)){
                   return "LoginSucess";
               }
               else{
                   return "IncorrectPassword";
               }
           }
           else {
               return "email does not exist";
           }
    }
    @PostMapping("/signup")
    @CrossOrigin(origins = "http://localhost:3000")
    public String signup(@RequestBody CandidateDetails candidateDetails){
        System.out.println(candidateDetails.getEmail());
        System.out.println(candidateDetails.getName());
        System.out.println(candidateDetails.getPhoneNumber());
        System.out.println(candidateDetails.getTechnology());
        System.out.println(candidateDetails.getAge());
        System.out.println(candidateDetails.getPassword());
        repository.save(candidateDetails);
        return "Registration Successfully";
    }


}
