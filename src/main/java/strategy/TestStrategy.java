package strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agresivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setStrategy(agresivo);

        robo.mover();
        robo.mover();
    }
}
