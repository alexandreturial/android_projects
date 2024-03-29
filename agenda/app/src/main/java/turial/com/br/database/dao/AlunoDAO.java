package turial.com.br.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import turial.com.br.model.Aluno;

@Dao
public interface AlunoDAO {
    @Insert
    Long salva(Aluno aluno);


    @Query("SELECT * FROM aluno")
    List<Aluno> getAlunos();

    @Delete
    void remove(Aluno aluno);

    @Update
    void edita(Aluno aluno);
}
