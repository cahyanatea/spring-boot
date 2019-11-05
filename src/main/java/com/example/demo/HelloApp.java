package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Buku;
import com.example.demo.service.PinjamBukuService;

@SpringBootApplication
public class HelloApp implements CommandLineRunner {
	
	@Autowired
	private PinjamBukuService pinjamBukuService;
	
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(HelloApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Buku buku = new Buku();
		buku.setJudul("Pemrograman Java");
		buku.setPenerbit("Asep C");
		buku.setPenulis("Pt. Delima");
		buku.setTahunTerbit(2010);
		
		pinjamBukuService.pinjamBuku(buku);
		
		System.out.println("DataSource : " + dataSource);
	}
}
