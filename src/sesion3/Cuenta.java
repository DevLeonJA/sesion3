package sesion3;

public class Cuenta {
	private double saldo;
	private String numero;
	private String titular;
	
	public Cuenta(String string, String string2, int i) {
		numero=string;
		saldo=i;
		titular=string2;
	}

	public void ingresar(double i) {
		saldo+=i;
		
	}

	public double getSaldo() {
		
		return saldo;
	}

	public void retirar(double i) {
		if(saldo - i>=-500)
		{
			saldo-=i;
		}
	}

}
