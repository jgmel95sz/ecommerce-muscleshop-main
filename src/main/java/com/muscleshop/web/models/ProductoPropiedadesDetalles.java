package com.muscleshop.web.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "producto_propiedades_detalles")
public class ProductoPropiedadesDetalles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;

	private String sku;
	private String imagen;
	private Integer stock;
	private Double precio;

	@Column(name = "precio_reducido")
	private Double precioReducido;

	@Column(name = "precio_team")
	private Double precioTeam;

	@Column(name = "precio_team_vip")
	private Double precioTeamVip;

	@Column(name = "precio_familiar")
	private Double precioFamiliar;

	@OneToMany
	@JoinColumn(name = "producto_propiedad_detalle_id")
	@JsonIgnore
	private List<PropiedadDetalleImagen> propiedadesDetallesImagenes;

	@ManyToOne
	@JoinColumn(name = "producto_forma_id")
	private ProductoForma productoForma;

	@ManyToOne
	@JoinColumn(name="estado_id")
	private Estado estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrecioReducido() {
		return precioReducido;
	}

	public void setPrecioReducido(Double precioReducido) {
		this.precioReducido = precioReducido;
	}

	public Double getPrecioTeam() {
		return precioTeam;
	}

	public void setPrecioTeam(Double precioTeam) {
		this.precioTeam = precioTeam;
	}

	public Double getPrecioTeamVip() {
		return precioTeamVip;
	}

	public void setPrecioTeamVip(Double precioTeamVip) {
		this.precioTeamVip = precioTeamVip;
	}

	public Double getPrecioFamiliar() {
		return precioFamiliar;
	}

	public void setPrecioFamiliar(Double precioFamiliar) {
		this.precioFamiliar = precioFamiliar;
	}

	public List<PropiedadDetalleImagen> getPropiedadesDetallesImagenes() {
		return propiedadesDetallesImagenes;
	}

	public void setPropiedadesDetallesImagenes(List<PropiedadDetalleImagen> propiedadesDetallesImagenes) {
		this.propiedadesDetallesImagenes = propiedadesDetallesImagenes;
	}

	public ProductoForma getProductoForma() {
		return productoForma;
	}

	public void setProductoForma(ProductoForma productoForma) {
		this.productoForma = productoForma;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
