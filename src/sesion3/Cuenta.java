package sesion3;

public class Cuenta {
	private double saldo;
	
	public Cuenta(int i) {
		saldo=i;
	}

	public void ingresar(double i) {
		saldo+=i;
		
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void retirar(double i) {
	
		saldo-=i;
	}

}
