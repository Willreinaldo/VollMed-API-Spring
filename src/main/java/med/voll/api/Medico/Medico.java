package med.voll.api.Medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import med.voll.api.Endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medico")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;
}
