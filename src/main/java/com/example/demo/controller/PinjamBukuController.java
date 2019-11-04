package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Buku;
import com.example.demo.service.PinjamBukuService;

@RestController
@RequestMapping(value = "/api")
public class PinjamBukuController {

	@Autowired
	private PinjamBukuService pinjamBukuService;
	
	@PostMapping(value = "/create")
	public Buku pinjamBuku(@RequestBody Buku buku) {
		return pinjamBukuService.pinjamBuku(buku);
	}
	
	@GetMapping(value = "/buku/{id}")
	public Buku getBukuById(@PathVariable("id") Integer id) {
		return pinjamBukuService.getBukuById(id);
	}
	
	@DeleteMapping(value = "/buku/{idBuku}")
	public void deleteBuku(@PathVariable(name = "idBuku") Integer idBuku) {
		pinjamBukuService.deleteBuku(idBuku);
	}
}
