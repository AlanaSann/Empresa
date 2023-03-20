import java.util.ArrayList;
import java.util.List;

public class Chefe extends Pessoa{
  List<Empregado> listaEmpregados;

  public Chefe(String nome) {
    super(nome);
    this.listaEmpregados = new ArrayList<Empregado>();
  }

  public void inserirEmpregado(Empregado empregado){
    listaEmpregados.add(empregado);
  }
  
  @Override
  public void getListaEmpregadosAssociados() {
    
    throw new UnsupportedOperationException("Unimplemented method 'getListaEmpregadosAssociados'");
  }

  @Override
  public void getListarMeusEmpregados() {

    throw new UnsupportedOperationException("Unimplemented method 'getListarMeusEmpregados'");
  }

}
