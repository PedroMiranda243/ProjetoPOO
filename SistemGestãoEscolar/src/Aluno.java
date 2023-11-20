public class Aluno {
    private String nome;
    private String curso;
    private double[]notas = new double[4];
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCuso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcularMedia(){
        //método polimórfico para calcular a média das notas
        //aonde mais iria calcular que não seja no registro?
    }
}
