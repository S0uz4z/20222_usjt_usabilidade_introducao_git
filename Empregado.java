public class Empregado {
    private String nome;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;


    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public int getTipo(){
        return tipo;
    }

    public double calculaSalario(){
        if (tipo == 1)
            return salario;
        else if (tipo == 2)
            return salario + salario * comissao;
        else if (tipo == 3)
            return salario + bonus;
        else
            return 0;            
    }



    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}