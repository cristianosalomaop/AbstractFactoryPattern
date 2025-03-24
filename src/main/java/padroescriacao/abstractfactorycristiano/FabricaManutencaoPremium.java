package padroescriacao.abstractfactorycristiano;

public class FabricaManutencaoPremium implements FabricaAbstrata {

    @Override
    public OrdemServico createOrdemServico() {
        return new OrdemServicoPremium();
    }

    @Override
    public RelatorioManutencao createRelatorio() {
        return new RelatorioPremium();
    }
}
