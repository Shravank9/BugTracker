package com.Shravan.bugtracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shravan.bugtracker.model.Bug;
import com.Shravan.bugtracker.repository.BugRepository;

@Service

public class BugServiceImpl implements BugService {

	@Autowired
	BugRepository bugRepository;

	@Override
	public Bug createBug(Bug bug) {
		return bugRepository.save(bug);
	}

	@Override
	public List<Bug> getAllBugs() {
		return bugRepository.findAll();
	}

	@Override
	public Bug getBugById(Long id) {
		return bugRepository.findById(id).orElse(null);
	}

	@Override
	public Bug updateBug(Long id, Bug bug) {

		Bug datagetfromdb = bugRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Bug not found"));
		datagetfromdb.setDescription(bug.getDescription());
		datagetfromdb.setDueDate(bug.getDueDate());
		datagetfromdb.setId(bug.getId());
		datagetfromdb.setModule(bug.getModule());
		datagetfromdb.setPriority(bug.getPriority());
		datagetfromdb.setSeverity(bug.getSeverity());
		datagetfromdb.setStatus(bug.getStatus());
		datagetfromdb.setTitle(bug.getTitle());
		datagetfromdb.setReportedDate(bug.getReportedDate());

		return bugRepository.save(datagetfromdb);
	}

	@Override
	public Bug getBugByName(String name) {
		return bugRepository.findByTitle(name);
	}

	@Override
	public void deleteBug(Long id) {
		bugRepository.deleteById(id);

	}

	@Override
	public Bug updateBugPartial(Long id, Bug bug) {

		Bug datagetfromdb = bugRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Bug not found"));
		
		
		if (bug.getDescription() != null) {
			datagetfromdb.setDescription(bug.getDescription());

		}

		if (bug.getDueDate() != null) {
			datagetfromdb.setDueDate(bug.getDueDate());
		}

		if (bug.getModule() != null) {
			datagetfromdb.setModule(bug.getModule());
		}

		if (bug.getPriority() != null) {
			datagetfromdb.setPriority(bug.getPriority());
		}

		if (bug.getSeverity() != null) {
			datagetfromdb.setSeverity(bug.getSeverity());
		}

		if (bug.getStatus() != null) {
			datagetfromdb.setStatus(bug.getStatus());
		}

		if (bug.getTitle() != null) {
			datagetfromdb.setTitle(bug.getTitle());
		}

		if (bug.getReportedDate() != null) {
			datagetfromdb.setReportedDate(bug.getReportedDate());
		}

		return bugRepository.save(datagetfromdb);
	}

}
