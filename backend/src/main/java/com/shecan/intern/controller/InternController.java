package com.shecan.intern.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shecan.intern.entity.Intern;

@RestController
@RequestMapping("/api/intern")
@CrossOrigin(origins = "*")
public class InternController {

	@GetMapping
	public Intern getIntern() {
		return new Intern("Anjali", "anjali2025", 1200);
	}

	@GetMapping("/leaderboard")
	public List<Intern> getLeaderboard(){
		return List.of(
				new Intern("Anjali", "anjali2025", 1200),
				new Intern("Rajashree", "rajashree2025", 1524),
				new Intern("Arpita", "arpita2025", 1120),
				new Intern("Shubhashree", "shubhashree2025", 3200));
	}
}
