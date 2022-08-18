public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();

        e1.setTipo(tipo: 1);
        e2.setTipo(tipo: 2);
        e3.setTipo(tipo: 3);

        e1.setSalario(salario: 2000);

        e2.setSalario(salario: 1700);
        e2.setComissao(comissao: 0.2);

        e3.setSalario(1500);
        e3.setBonus(bonus: 400);

        System.out.println(e1.calculaSalario());
        System.out.println(e2.calculaSalario());
        System.out.println(e3.calculaSalario());
    
    }
    
}
