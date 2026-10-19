package sesion3;

public class Cuenta {
	private static final double limiteSaldo=-500.0;
	private double saldo;
	private final String numero;
	private final String titular;
	
	public Cuenta(String numero, String titular, double saldo ) {
		this.numero=numero;
		this.saldo=saldo;
		this.titular=titular;
	}

	public void ingresar(double cantidad) {
		if(cantidad<=0) {
			return;
		}
		saldo+=cantidad;
		
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
		}
	}

}
