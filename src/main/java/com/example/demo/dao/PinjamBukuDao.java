package com.example.demo.dao;

import com.example.demo.entity.Buku;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

public interface PinjamBukuDao extends CrudRepository<Buku, Integer> {

	public Iterable<Buku> getByPenulis(String penulis);
	
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	public Iterable<Buku> findByTahunTerbitLessThan(Integer tahun);
        
        @Query(value = "SELECT b FROM Buku b")
        public Iterable<Buku> ambilSemuaBuku();
        
        @Query(value = "SELECT b FROM Buku b WHERE b.bukuId = ?1")
        public Buku ambilBukuDariId(Integer id);
}
