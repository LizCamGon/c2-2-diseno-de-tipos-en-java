package fp.tipo;

import java.time.LocalDate;

public class Beca implements Comparable<Beca> {
	
	private String codigo; 
	private LocalDate fechaComienzo;
	private Double cuantia;
	public Integer duracion;
	private TipoBeca tipo;
	
	public Beca (String codigo, LocalDate fechaComienzo, Double cuantia, TipoBeca tipo) {
		if (duration<1) {
			throw new IllegalArgumentException("La duracion debe ser mayor que cero");
		}
		this.codigo = codigo;
		this.fechaComienzo = fechaComienzo;
		this.cuantia = cuantia;
		this.duracion = duracion;
		this.tipo = tipo;
	
	}
	public Double getCuantiaMensual() {
		return cuantia/12;
	}
    
	public LocalDate getFechaComienzo() {
		return fechaComienzo;
	}

	public void setFechaComienzo(LocalDate fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}

	public Double getCuantia() {
		return cuantia;
	}

	public void setCuantia(Double cuantia) {
		this.cuantia = cuantia;
	}

	public TipoBeca getTipo() {
		return tipo;
	}

	public void setTipo(TipoBeca tipo) {
		this.tipo = tipo;
	}

	public Integer getGetCodigo() {
		return getCodigo;
	}

	public void setGetCodigo(Integer getCodigo) {
		this.getCodigo = getCodigo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return this.codigo;
	}
	public Integer getCodigo;{
		return this.duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return "Beca [codigo=" + codigo + codigo + ""
	}
	
}
