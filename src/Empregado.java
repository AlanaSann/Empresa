import java.util.ArrayList;
import java.util.List;

public class Empregado extends Pessoa{
  List<Empregado> listEmpregados;
  Pessoa chefe;

  public Empregado( Pessoa chefe,String nome) {
    super(nome);
    this.listEmpregados = new ArrayList<Empregado>();
    this.chefe = chefe;
  }
  public void inserirEmpregado(Empregado empregado){
    listEmpregados.add(empregado);
  }

  public void getListaEmpregadosAssociados(){}

  public void getListarMeusEmpregados(){}

  public void getListarMeuChefe(){} 


}
