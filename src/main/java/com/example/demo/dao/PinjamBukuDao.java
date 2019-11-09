package com.example.demo.dao;

import com.example.demo.entity.Buku;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PinjamBukuDao extends CrudRepository<Buku, Integer> {

	public Iterable<Buku> getByPenulis(String penulis);
	
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	public Iterable<Buku> findByTahunTerbitLessThan(Integer tahun);
        
        @Query(value = "SELECT * FROM buku", nativeQuery = true)
        public Iterable<Buku> ambilSemuaBuku();
        
        @Query(value = "SELECT * FROM buku WHERE buku_id = ?1", nativeQuery = true)
        public Buku ambilBukuDariId(Integer id);
        
        @Query("SELECT b FROM Buku b")
        public List<Buku> getAllBuku(Pageable pageable);
        
        @Query("SELECT b FROM Buku b WHERE b.judul like %:judul%")
        public List<Buku> cariBuku(@Param("judul") String judul);
}
