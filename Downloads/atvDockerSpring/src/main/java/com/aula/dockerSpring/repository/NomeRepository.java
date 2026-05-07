    package com.aula.dockerSpring.repository;

    //Bibliotecas
    import com.aula.dockerSpring.entities.NomeEntity;
    import jakarta.transaction.Transactional;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import java.util.List;

    //Classe repository
    @Repository
    public interface NomeRepository extends JpaRepository<NomeEntity, Long> {

        //Lista que ira receber os nomes achados pelo sistema
        List<NomeEntity> findByNome(String nome);

        //Parâmetro que exclui um nome do banco de dados
        @Transactional
        void deleteByNome(String nome);
    }
