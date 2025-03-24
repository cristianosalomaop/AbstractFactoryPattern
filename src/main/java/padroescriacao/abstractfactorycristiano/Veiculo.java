package padroescriacao.abstractfactorycristiano;

public class Veiculo {

    private OrdemServico ordemServico;
    private RelatorioManutencao relatorio;

    public Veiculo(FabricaAbstrata fabrica) {
        this.ordemServico = fabrica.createOrdemServico();
        this.relatorio = fabrica.createRelatorio();
    }

    public String emitirOrdemServico() {
        return this.ordemServico.emitir();
    }

    public String emitirRelatorio() {
        return this.relatorio.emitir();
    }
}
