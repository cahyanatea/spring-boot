package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PinjamBukuDao;
import com.example.demo.entity.Buku;

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
}
