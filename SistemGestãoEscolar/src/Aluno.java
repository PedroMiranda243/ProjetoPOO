public class Aluno {
    private String nome;
    private String curso;

    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }

    private double n1,n2;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public double calcularMedia(){
        return (n1+n2)/2; 
    }

    public void apresenta(){
        System.out.println("Nome: "+ nome +"\n");
        System.out.println("Curso: "+ curso +"\n");
    }
}
