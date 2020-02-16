package carrobuilder;

public abstract class CarroBuilder {
	//Classe de constru��o do carro
	
	protected CarroProduct carro;
	
	//O carro que ser� constru�do
	public CarroBuilder() {
		carro = new CarroProduct();
	}
	
	//Passos para constru��o
	public abstract void buildPreco();
	
	public abstract void buildDscMotor();
	
	public abstract void buildAnoDeFabricacao();
	
	public abstract void buildModelo();
	
	public abstract void buildMontadora();
	
	//Devolvendo o carro constru�do
	public CarroProduct getCarro() {
		return carro;
	}
}
