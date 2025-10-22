package pkg;

enum Signo {
	D, H
}

public class Movimiento {

	private Double importe;
	private String detalle;
	private Signo signo;

	public Movimiento(Double importe, String detalle, Signo signo) {
		super();
		this.importe = importe;
		this.detalle = detalle;
		this.signo = signo;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Signo getSigno() {
		return signo;
	}

	public void setSigno(Signo signo) {
		this.signo = signo;
	}
}
