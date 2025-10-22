package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	String mNumero; 
    String nTitular; 
    Double saldo;
    List <Movimiento> mMovimientos;
    private static final double limite_descubierto=-500.0;
    
	public Cuenta(String mNumero, String nTitular, double saldoInicial) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		saldo=saldoInicial;
		mMovimientos=new ArrayList<>();
	}

public void ingresar(double x) {
	Movimiento m = new Movimiento(x,"Ingreso",Signo.H);
    mMovimientos.add(m);
    saldo += x;
}
public void retirar(double x) throws FondosInsuficientesException{
	if(saldo-x<limite_descubierto) {
		throw new FondosInsuficientesException("Fondos insuficietes (saldo: "+saldo+"€ en la cuenta "+mNumero+" para el reintegro de "+x+"€");
	}
	Movimiento m = new Movimiento(x,"Retirada",Signo.D);
    mMovimientos.add(m);
    saldo -= x;
    
}

public Double getSaldo() {
	return saldo;
}

public void setSaldo(Double saldo) {
	this.saldo = saldo;
}
}
