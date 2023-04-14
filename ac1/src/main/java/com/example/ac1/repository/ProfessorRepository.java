import java.util.List;

import com.example.ac1.model.Agendamento;
import com.example.ac1.model.Professor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    @Query("SELECT p FROM Professor p INNER JOIN Especializacao esp on p.id = esp.professor_id INNER JOIN Curso c on p.curso_id = esp.curso_id where c.id = :cursoid")
	List<Professor> findProfessoresByCurso(@Param("cursoid") Long id);

    @Query("select p from Professor p where p.RG = :rg and p.CPF = :cpf")
    List<Professor> AutenticarProfessor(@Param("rg") String RG, @Param("cpf") String CPF);
}
