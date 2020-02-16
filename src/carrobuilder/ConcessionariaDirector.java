package carrobuilder;

public class ConcessionariaDirector {
	//Director executa os metodos de 
	// constru��o do carro
	
	protected CarroBuilder montadora;
	
	public ConcessionariaDirector(CarroBuilder montadora) {
		this.montadora = montadora;
	}
	
	public void construirCarro() {
		montadora.buildPreco();
		montadora.buildAnoDeFabricacao();
		montadora.buildDscMotor();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
	
	public CarroProduct getCarro() {
		return montadora.getCarro();
	}	
}
