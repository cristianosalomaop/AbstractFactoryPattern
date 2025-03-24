package padroescriacao.abstractfactorycristiano;

public class FabricaManutencaoCompleta implements FabricaAbstrata {

    @Override
    public OrdemServico createOrdemServico() {
        return new OrdemServicoCompleta();
    }

    @Override
    public RelatorioManutencao createRelatorio() {
        return new RelatorioCompleto();
    }
}
