package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
// @NamedQuery demo
@DynamicUpdate
@NamedQueries(value = {
    @NamedQuery(name = "Buku.ambilSemuaBuku", query = "SELECT b FROM Buku b"),
    @NamedQuery(name = "Buku.ambilBukuDariId", query = "SELECT b FROM Buku b WHERE b.bukuId = ?1")
})
@Table(name = "buku")
public class Buku {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buku_id")
	private Integer bukuId;
	
	@Column(name = "judul", nullable = false)
	private String judul;
	
	@Column(name = "penulis")
	private String penulis;
	
	@Column(name = "penerbit")
	private String penerbit;
	
	@Column(name = "tahun_terbit")
	private Integer tahunTerbit;

	public Integer getBukuId() {
		return bukuId;
	}

	public void setBukuId(Integer bukuId) {
		this.bukuId = bukuId;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getPenulis() {
		return penulis;
	}

	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

	public String getPenerbit() {
		return penerbit;
	}

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}

	public Integer getTahunTerbit() {
		return tahunTerbit;
	}

	public void setTahunTerbit(Integer tahunTerbit) {
		this.tahunTerbit = tahunTerbit;
	}
	
}
