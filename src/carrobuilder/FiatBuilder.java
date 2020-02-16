package carrobuilder;

public class FiatBuilder extends CarroBuilder {
	//Personalizando o carro com informações da Fiat
	//Dividindo em pequenos passos a construção do objeto
	
	@Override
	public void buildPreco() {
		carro.preco = 25000.00;
	}
	
	@Override
	public void buildDscMotor() {
		carro.dscMotor = "Fire Flex 1.0";
	}
	
	@Override
	public void buildAnoDeFabricacao() {
		carro.anoFabricacao = 2011;
	}
	
	@Override
	public void buildModelo() {
		carro.modelo = "Palio";
	}
	
	@Override
	public void buildMontadora() {
		carro.montadora = "Fiat";
	}
}
