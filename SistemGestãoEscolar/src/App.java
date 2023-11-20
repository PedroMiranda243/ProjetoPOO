import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        boolean menu = true;
        int opc = 0;
        

        String texto = """
                Qual ação dejesa realizar?

                1-Matricular novos alunos
                2-Consultar alunos matriculados
                3-Verificar média do aluno
                4-Sair
                """;

System.out.println("Bem-vindo(a) ao sistema de gestão escolar");
        while (menu) {
            System.out.println(texto);
            opc=ler.nextInt();
            if (opc == 1) {
                //TODO matricular novos alunos 
            }
            if (opc==2) {
                //TODO consultar alunos matrículados
            }
            if (opc== 3) {
                //TODO verificar média do aluno 
            }
            if(opc==4){
                System.out.println("Saindo do sisitema.");
                menu=false;
            }
        }
    }
}
