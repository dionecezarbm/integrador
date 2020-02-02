package com.example.howmuch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.howmuch.entities.Troubleshoot;

public interface TroubleshootRepository extends JpaRepository<Troubleshoot, Long> {

}
