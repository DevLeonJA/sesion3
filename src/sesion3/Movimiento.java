package sesion3;

public class Movimiento {
	private double d;
	private String string;
	private Signo signo;
	
	public enum Signo {
        D, H
    }
	public Movimiento(double importe, Signo signo, String detalle) {
        this.d = importe;
        this.signo = signo;
        this.string = detalle;
    }
	
	public Double getImporte() {

		return 100.0;
	}
	public Signo getSigno() {
		// TODO Auto-generated method stub
		return Signo.H;
	}
	
	
}
