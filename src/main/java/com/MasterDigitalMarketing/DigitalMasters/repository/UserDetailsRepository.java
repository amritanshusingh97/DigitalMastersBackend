package com.MasterDigitalMarketing.DigitalMasters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MasterDigitalMarketing.DigitalMasters.model.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

    UserDetails findByEmail(String email);
}
