package med.voll.api.Medico;

import med.voll.api.Endereco.DadosEndereco;
import med.voll.api.Medico.Especialidade;

public record DadosCadastroMedico(String nome, String email, Especialidade especialidade, DadosEndereco endereco) {

}
