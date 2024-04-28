package com.infosys.infytel.calldetails.repository;

import java.util.List;
//comment added newly added
import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.calldetails.entity.CallDetails;

public interface CallDetailsRepository extends JpaRepository<CallDetails, Long> {

	List<CallDetails> findByCalledBy(long calledBy);
}
