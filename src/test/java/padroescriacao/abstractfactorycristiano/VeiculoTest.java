package padroescriacao.abstractfactorycristiano;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveEmitirOrdemServicoSimples() {
        FabricaAbstrata fabrica = new FabricaManutencaoSimples();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Ordem de Serviço para Manutenção Simples emitida", veiculo.emitirOrdemServico());
    }

    @Test
    void deveEmitirOrdemServicoCompleta() {
        FabricaAbstrata fabrica = new FabricaManutencaoCompleta();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Ordem de Serviço para Manutenção Completa emitida", veiculo.emitirOrdemServico());
    }

    @Test
    void deveEmitirOrdemServicoPremium() {
        FabricaAbstrata fabrica = new FabricaManutencaoPremium();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Ordem de Serviço para Manutenção Premium emitida", veiculo.emitirOrdemServico());
    }

    @Test
    void deveEmitirRelatorioSimples() {
        FabricaAbstrata fabrica = new FabricaManutencaoSimples();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Relatório de Manutenção Simples emitido", veiculo.emitirRelatorio());
    }

    @Test
    void deveEmitirRelatorioCompleto() {
        FabricaAbstrata fabrica = new FabricaManutencaoCompleta();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Relatório de Manutenção Completa emitido", veiculo.emitirRelatorio());
    }

    @Test
    void deveEmitirRelatorioPremium() {
        FabricaAbstrata fabrica = new FabricaManutencaoPremium();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Relatório de Manutenção Premium emitido", veiculo.emitirRelatorio());
    }
}
