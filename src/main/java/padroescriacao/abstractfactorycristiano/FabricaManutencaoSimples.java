package padroescriacao.abstractfactorycristiano;

public class FabricaManutencaoSimples implements FabricaAbstrata {

    @Override
    public OrdemServico createOrdemServico() {
        return new OrdemServicoSimples();
    }

    @Override
    public RelatorioManutencao createRelatorio() {
        return new RelatorioSimples();
    }
}
