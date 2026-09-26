import java.util.Scanner;

public class principal {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
    //A scanner vem da biblioteca aberta do java, faz o mesmo que a calculo que fizemos

Calculo ca = new Calculos();

system.out.println ("Escolha uma opção entre 1 e 4")
 int escolha = scanner.nextInf();

system.out.println ("Digite o primeiro número")
int n1 = scanner.nextInf();
ca.setNum1(n1);

system.out.println ("Digite o segundo número")
int n2 = scanner.nextInf();
ca.setNum1(n2);


 //Laço case - escolha então
 //laço mais "facil" e um dos mais usados na progamação
 switch (escolha) {

case 1: System.out.println ("Você escolheu somar:" + ca.soma (ca.getNum1(),ca.getNum2()))
    break;

case 2: System.out.println ("Você escolheu dividir:" + ca.divisao(ca.getNum1(),ca.getNum2()))
    break;
   
case 3: System.out.println ("Você escolheu subtrair:" + ca.subtrair(ca.getNum1(),ca.getNum2()))
    break;

case 4: System.out.println ("Você escolheu multiplicar:" + ca.multiplcacao(ca.getNum1(),ca.getNum2()))
    break;


    default: System.out.println ("Nenhuma opção foi selecionada")

        break;
 }
}
}