package ppStrategy;

public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Perigo menor avistado");
		System.out.println("Movendo-se agressivamente");
		
	}

}
