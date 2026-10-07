package com.Shravan.bugtracker.service;

import java.util.List;

import com.Shravan.bugtracker.model.Bug;

public interface BugService {

	Bug createBug(Bug bug);

	List<Bug> getAllBugs();

	Bug getBugById(Long id);

	Bug updateBug(Long id, Bug bug);

	Bug getBugByName(String name);

	Bug updateBugPartial(Long id, Bug bug);

	void deleteBug(Long id);

}