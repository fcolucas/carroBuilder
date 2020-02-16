package carrobuilder;

public class Client {
	//Client lida somente com Director
	
	public static void main(String[] args) {
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
		
		concessionaria.construirCarro();
		CarroProduct carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
	            + "\nAno: " + carro.anoFabricacao + "\nMotor: "
	            + carro.dscMotor + "\nValor: " + carro.preco);
		System.out.println();
		
		concessionaria = new ConcessionariaDirector(new VolksBuilder());
		concessionaria.construirCarro();
		carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
	            + "\nAno: " + carro.anoFabricacao + "\nMotor: "
	            + carro.dscMotor + "\nValor: " + carro.preco);
	}
}
