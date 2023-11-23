public class CursoMatematica extends Aluno{
    private double coeficienteDificuldade;

    public double getCoeficienteDificuldade() {
        return coeficienteDificuldade;
    }

    public void setCoeficienteDificuldade(double coeficienteDificuldade) {
        this.coeficienteDificuldade = coeficienteDificuldade;
    }

    @Override
    public double calcularMedia() {
        System.out.println("Minha média em matemática é: "+super.calcularMedia()); 
        return super.calcularMedia();
    }

    @Override
    public void apresenta() {
        // TODO Auto-generated method stub
        super.apresenta();
        System.out.println("Coeficiente de dificuldade: "+coeficienteDificuldade+"\n");
    }


    
}
