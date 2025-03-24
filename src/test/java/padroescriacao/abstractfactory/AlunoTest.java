package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveEmitirHistoricoGraduacao() {
        FabricaAbstrata fabrica = new FabricaGraduacao();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Histórico de Graduação", aluno.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoPosGraduacao() {
        FabricaAbstrata fabrica = new FabricaPosGraduacao();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Histórico de Pós Graduação", aluno.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoEM() {
        FabricaAbstrata fabrica = new FabricaEM();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Histórico do Ensino Médio", aluno.emitirHistorico());
    }


    @Test
    void deveEmitirDiplomaGraduacao() {
        FabricaAbstrata fabrica = new FabricaGraduacao();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Diploma de Graduação", aluno.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaPosGraduacao() {
        FabricaAbstrata fabrica = new FabricaPosGraduacao();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Diploma de Pós Graduação", aluno.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaEM() {
        FabricaAbstrata fabrica = new FabricaEM();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Diploma do Ensino Médio", aluno.emitirDiploma());
    }
}