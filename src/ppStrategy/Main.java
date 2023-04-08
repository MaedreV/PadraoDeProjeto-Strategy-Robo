package ppStrategy;

public class Main {

	public static void main(String[] args) {
		
		Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento Científico = new ComportamentoCiência();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);
        
        robo.mover();
        robo.mover();
        robo.setComportamento(Científico);
        robo.mover();
        robo.pesquisar();
       
	}

}
