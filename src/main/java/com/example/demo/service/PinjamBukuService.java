package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PinjamBukuDao;
import com.example.demo.entity.Buku;
import java.util.List;
import org.springframework.data.domain.Pageable;

@Service
public class PinjamBukuService {

	@Autowired
	private PinjamBukuDao pinjamBukuDao;
	
	public Buku pinjamBuku(Buku buku) {
		return pinjamBukuDao.save(buku);
	}

	public Buku getBukuById(Integer id) {
		return pinjamBukuDao.findById(id).get();
	}
	
	public void deleteBuku(Integer idBuku) {
		pinjamBukuDao.deleteById(idBuku);
	}
	
	public Buku updateBuku(Buku buku) {
		return pinjamBukuDao.save(buku);
	}
	
	public Iterable<Buku> getBuku() {
		return pinjamBukuDao.findAll();
	}
	
	public Iterable<Buku> getByPenulis(String penulis) {
		return pinjamBukuDao.getByPenulis(penulis);
	}
	
	public Iterable<Buku> findByTahunTerbitLessThan(Integer tahun) {
		return pinjamBukuDao.findByTahunTerbitLessThan(tahun);
	}
        
        public Iterable<Buku> ambilSemuaBuku() {
            return pinjamBukuDao.ambilSemuaBuku();
        }
        
        public Buku ambilBukuDariId(Integer id) {
            return pinjamBukuDao.ambilBukuDariId(id);
        }
        
        public List<Buku> getAllBuku(Pageable pageable) {
            return pinjamBukuDao.getAllBuku(pageable);
        }
        
        public List<Buku> cariBuku(String judul) {
            return pinjamBukuDao.cariBuku(judul);
        }
        
        public int updateTahun(Integer id, Integer tahun) {
            return pinjamBukuDao.updateTahun(id, tahun);
        }
}
