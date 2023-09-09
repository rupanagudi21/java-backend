package com.example.tcs.demo.repository;

import com.example.tcs.demo.model.CandidateDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CandidateRepository extends JpaRepository<CandidateDetails,Integer> {
    CandidateDetails findByEmail(String email);
}
