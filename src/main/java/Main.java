
import com.atividadejpa.entities.Aluno;
import com.atividadejpa.entities.Orientador;
import com.atividadejpa.services.AlunoServices;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author moaci
 */
public class Main {

    public static void main(String[] args) {

        Orientador professor = new Orientador();
        professor.setNome("Daladier");
        professor.setMatricula("235661");
        professor.setEmail("daladierjr@gmail.com");

//        Aluno aluno = new Aluno();
//        aluno.setNome("Fernanda Brum");
//        aluno.setMatricula("202012010019");
//        aluno.setEmail("fb@gmail.com");
//        aluno.setOrientador(professor);
//        
        AlunoServices alunoServices = new AlunoServices();
//        alunoServices.insertAluno(aluno);

        Aluno aluno2 = alunoServices.getAlunoById(3L);
        System.out.println(aluno2.toString());

    }

}
