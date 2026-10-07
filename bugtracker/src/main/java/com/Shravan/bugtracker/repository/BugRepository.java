package com.Shravan.bugtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shravan.bugtracker.model.Bug;

public interface BugRepository extends JpaRepository<Bug, Long>{
	
	public abstract Bug findByTitle(String title);

}
