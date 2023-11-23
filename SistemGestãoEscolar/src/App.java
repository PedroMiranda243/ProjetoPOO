import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Aluno a = new Aluno();
        CursoLiteratura l = new CursoLiteratura();
        CursoMatematica m = new CursoMatematica();
        boolean menu = true;
        int opc = 0;

        String texto = """
                Qual ação dejesa realizar?

                1-Consultar alunos matriculados
                2-Verificar média do aluno
                3-Sair
                """;

        // Seção matemática
        m.setNome("Pedro");
        m.setCurso("Matemática");
        m.setN1(9);
        m.setN2(7);
        m.setCoeficienteDificuldade(6);

        // Seção literatura
        l.setNome("Camile");
        l.setCurso("Literatura");
        l.setN1(6);
        l.setN2(5);
        l.setObrasLidas(6);

        System.out.println("Bem-vindo(a) ao sistema de gestão escolar");
        while (menu) {
            System.out.println(texto);
            opc = ler.nextInt();
            if (opc == 1) {
                // TODO consultar alunos matrículados
                apresentar(m);
                apresentar(l);

            }
            if (opc == 2) {

                calcula(m);
                calcula(l);

            }
            if (opc == 3) {
                System.out.println("Saindo do sisitema.");
                menu = false;
            }
        }
    }

    public static void apresentar(Aluno x) {
        x.apresenta();
    }

    public static double calcula(Aluno x) {
        return x.calcularMedia();
    }

}
