package carrobuilder;

public abstract class CarroBuilder {
	//Classe de construção do carro
	
	protected CarroProduct carro;
	
	//O carro que será construído
	public CarroBuilder() {
		carro = new CarroProduct();
	}
	
	//Passos para construção
	public abstract void buildPreco();
	
	public abstract void buildDscMotor();
	
	public abstract void buildAnoDeFabricacao();
	
	public abstract void buildModelo();
	
	public abstract void buildMontadora();
	
	//Devolvendo o carro construído
	public CarroProduct getCarro() {
		return carro;
	}
}
