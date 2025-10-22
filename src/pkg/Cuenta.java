package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	String mNumero; 
    String nTitular; 
    private Double saldo;
    List <Movimiento> mMovimientos;
    
    public Cuenta(String mNumero, String nTitular) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.saldo=0.0;
		mMovimientos=new ArrayList<>();
	}

public void ingresar(double x) {this.saldo=100.0;}
public void retirar(double x) {this.saldo=100.0;}

public Double getSaldo() {
	return saldo;
}

public void setSaldo(Double saldo) {
	this.saldo = saldo;
}


}
