package carrobuilder;

public class VolksBuilder extends CarroBuilder {
	//Personalizando o carro com informa��es da Volkswagen
	//Dividindo em pequenos passos a constru��o do objeto
	
	@Override
	public void buildPreco() {
		carro.preco = 30000.00;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "1.0 MPI";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoFabricacao = 2013;

	}

	@Override
	public void buildModelo() {
		carro.modelo = "Polo";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Volkswagen";
	}

}
