public class CursoLiteratura extends Aluno{
private int obrasLidas;

public int getObrasLidas() {
    return obrasLidas;
}

public void setObrasLidas(int obrasLidas) {
    this.obrasLidas = obrasLidas;
}

@Override
public double calcularMedia() {
    System.out.println("Minha média em literatura é: "+super.calcularMedia());
    return super.calcularMedia();
}

@Override
public void apresenta() {
    // TODO Auto-generated method stub
    super.apresenta();
    System.out.println("Obras lidas: "+ obrasLidas+ "\n");
}

}
