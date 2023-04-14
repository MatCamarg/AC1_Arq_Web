import java.util.Date;
import java.util.List;

import com.example.ac1.model.Agendamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    @Query("select a from Agendamento a inner join Professor p on a.professor_id = p.agendamento_id where p.id = :profid and a.DataInicial = :dini and a.DataFinal = :dfim and a.Cidade != :cid and a.UF != :uf ")
    List<Agendamento> findAgendamentoByProfessor(@Param("profid") Long id,
                                                 @Param("dini") Date DataInicial, 
                                                 @Param("dfim") Date DataFinal, 
                                                 @Param("cid") String Cidade, 
                                                 @Param("uf")String UF);

    @Query("update Agendamento a SET a.Resumo = :resumo where a.id = :idAgendamento")
    List<Agendamento> UpdateResumo(@Param("resumo") String resumo, @Param("idAgendamento") Long id);
}
