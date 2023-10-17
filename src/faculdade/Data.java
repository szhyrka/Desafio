package faculdade;
public class Data{
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        validarData();
        
        
    }
    
    public boolean verificaAnoBissexto(){
        boolean retorno = false;
        retorno = (this.ano % 4 == 0) && (this.ano % 100 != 0 || this.ano % 400 == 0);
    
        return retorno;
    }
      
    private void validarData() {
        boolean anoBissexto = this.verificaAnoBissexto();
        int[] diasPorMes = {31, anoBissexto ? 29 : 28, 31, 30, 31, 30, 31 ,31 ,30 ,31, 30 ,31};
    
    
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasPorMes[mes - 1]){
            System.out.println("[NOK] Data informada está invalida. Alterando para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
    
}
    
    
