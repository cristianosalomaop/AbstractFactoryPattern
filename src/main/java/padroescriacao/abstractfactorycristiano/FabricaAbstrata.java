package padroescriacao.abstractfactorycristiano;

public interface FabricaAbstrata {
    OrdemServico createOrdemServico();
    RelatorioManutencao createRelatorio();
}
