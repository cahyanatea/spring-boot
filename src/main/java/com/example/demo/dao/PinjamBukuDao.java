package com.example.demo.dao;

import com.example.demo.entity.Buku;

import org.springframework.data.repository.CrudRepository;

public interface PinjamBukuDao extends CrudRepository<Buku, Integer> {

	public Iterable<Buku> getByPenulis(String penulis);
	
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	public Iterable<Buku> findByTahunTerbitLessThan(Integer tahun);
}
