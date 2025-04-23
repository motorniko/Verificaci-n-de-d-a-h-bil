import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String diaSem = scanner.nextLine();

        diaHabil(diaSem);
    }
    public static void diaHabil (String diaSem){
        if (diaSem.equalsIgnoreCase("sabado") || diaSem.equalsIgnoreCase("domingo")){
            System.out.println("el dia " + diaSem +" no es habil");
        }
        else if (diaSem.equalsIgnoreCase("lunes")
                 || diaSem.equalsIgnoreCase("martes")
                 || diaSem.equalsIgnoreCase("miercoles")
                 || diaSem.equalsIgnoreCase("jueves")
                 || diaSem.equalsIgnoreCase("viernes")){
            System.out.println("El dia "+diaSem+" es habil");
        }
        else {
            System.out.println("Ingrese un dia valido");
        }
    }
}
