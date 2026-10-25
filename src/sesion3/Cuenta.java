package sesion3;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private static final double limiteSaldo=-500.0;
	private double saldo;
	private final String numero;
	private final String titular;
	private List<Movimiento> movimiento;
	
	public Cuenta(String numero, String titular, double saldo ) {
		this.numero=numero;
		this.saldo=saldo;
		this.titular=titular;
		this.movimiento = new ArrayList<>();
	}

	public void ingresar(double cantidad) {
		if(cantidad<=0) {
			return;
		}
		saldo+=cantidad;
		this.movimiento.add(new Movimiento(cantidad, Movimiento.Signo.H, "Ingreso"));
		
	}

	public double getSaldo() {
		
		return saldo;
	}

	public void retirar(double cantidad) {
		if(cantidad<=0) {
			return;
		}
		
		if(saldo - cantidad>=limiteSaldo)
		{
			saldo-=cantidad;
			this.movimiento.add(new Movimiento(cantidad, Movimiento.Signo.D, "Reintegro"));
		}
	}

	public List<Movimiento> getMovimientos() {
		
		return movimiento ;
	}

}
