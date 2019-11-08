package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Buku;
import com.example.demo.service.PinjamBukuService;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

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
	
	@PutMapping(value = "/buku")
	public Buku updateBuku(@RequestBody Buku buku) {
		return pinjamBukuService.updateBuku(buku);
	}
	
	@GetMapping(value = "/")
	public Iterable<Buku> getBuku() {
		return pinjamBukuService.getBuku();
	}
	
	@GetMapping(value= "/buku/penulis/{penulis}")
	public Iterable<Buku> getByPenulis(@PathVariable(name = "penulis") String penulis) {
		return pinjamBukuService.getByPenulis(penulis);
	}
	
	@GetMapping(value = "/buku/tahun/{tahun}")
	public Iterable<Buku> getSebelumTahun(@PathVariable(name = "tahun") Integer tahun) {
		return pinjamBukuService.findByTahunTerbitLessThan(tahun);
	}
        
        // @Query demo
        @GetMapping(value = "/named")
        public Iterable<Buku> ambilSemuaBuku() {
            return pinjamBukuService.ambilSemuaBuku();
        }
        
        @GetMapping(value = "/named/{id}")
        public Buku ambilBukuDariId(@PathVariable(name = "id") Integer id) {
            return pinjamBukuService.ambilBukuDariId(id);
        }
        
        @GetMapping(value = "/page/{page}")
        public List<Buku> getAllBuku(@PathVariable(name = "page") Integer page) {
            return pinjamBukuService.getAllBuku(PageRequest.of(page, 2, Sort.Direction.ASC, "judul"));
        }
}
