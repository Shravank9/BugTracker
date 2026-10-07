package com.Shravan.bugtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PatchMapping;

import com.Shravan.bugtracker.model.Bug;
import com.Shravan.bugtracker.service.BugService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/bug")
public class BugController {

	@Autowired
	BugService bugService;

	// post or keep the data into the table

	@PostMapping("/s")
	public Bug addBugs(@RequestBody Bug bug) {
		return bugService.createBug(bug);

	}

	// @GetMapping → Used to fetch/read data

	@GetMapping()
	public List<Bug> getallBugs() {
		return bugService.getAllBugs();
	}

	// @GetMapping → Used to fetch/read data by id

	@GetMapping("/{id}")
	public Bug getBugById(@PathVariable Long id) {
		return bugService.getBugById(id);
	}

	// @PutMapping → Used to update existing data

	@PutMapping("/{id}")
	public Bug updatebugs(@PathVariable Long id, @RequestBody Bug bug) {
		return bugService.updateBug(id, bug);
	}

	// @DeleteMapping → Used to delete data

	@DeleteMapping("/{id}")
	public String deleteBugs(@PathVariable Long id) {
		bugService.deleteBug(id);
		return "Sucssefully Bug Of " + id + " is Delted";
	}

	@GetMapping("/title/{title}")
	public Bug getBugByTitle(@PathVariable String title) {
	    return bugService.getBugByName(title);
	}
	
	@PatchMapping("/update/{id}")
	public Bug updatebugspartial(@PathVariable Long id, @RequestBody Bug bug) {
		
		return bugService.updateBugPartial(id, bug);
		
	}

}
