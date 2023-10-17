package faculdade;
public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
     
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return -1;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public double gastosComSalario(){
        if (salarioBaseFuncionario < 1){
            return -1;
        }
        else{ 
            double gasto = quantidadeFuncionarios * salarioBaseFuncionario;
            return gasto;
        }
    }
    
    public char tamanhoDaLoja(){
      int quantidadeFuncionarios = getQuantidadeFuncionarios();

      if (quantidadeFuncionarios < 10) {
        return 'P';
      } else if (quantidadeFuncionarios <= 30) {
        return 'M';
      } else {
        return 'G';
      }
    }
    
    public String toString(){
        return "O nome da loja é:" + nome + ", e ela possui" + quantidadeFuncionarios +
        "funcionarios que recebem" + salarioBaseFuncionario + "de salario base";
    }
    
    
    
}