package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Buku;
import com.example.demo.service.PinjamBukuService;

@SpringBootApplication
public class HelloApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(HelloApp.class, args);
		
		PinjamBukuService pinjamBukuService = applicationContext.getBean("pinjamBukuService", PinjamBukuService.class);
		Buku buku = new Buku();
		buku.setJudul("Pemrograman Java");
		buku.setPenerbit("Asep C");
		buku.setPenulis("Pt. Delima");
		buku.setTahunTerbit(2010);
		
		pinjamBukuService.pinjamBuku(buku);
	}
}
