import java.util.List;

import com.example.ac1.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
