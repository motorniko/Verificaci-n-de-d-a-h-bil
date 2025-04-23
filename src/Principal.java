import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana: ");
        String diaSem = scanner.nextLine();

        diaHabil(diaSem);
    }

    public static void diaHabil(String diaSem) {
        if (diaSem.equalsIgnoreCase("sábado") ||
                diaSem.equalsIgnoreCase("sabado") ||
                diaSem.equalsIgnoreCase("domingo")) {
            System.out.println("El día " + diaSem + " no es hábil.");
        } else if (diaSem.equalsIgnoreCase("lunes") ||
                diaSem.equalsIgnoreCase("martes") ||
                diaSem.equalsIgnoreCase("miércoles") ||
                diaSem.equalsIgnoreCase("miercoles") ||
                diaSem.equalsIgnoreCase("jueves") ||
                diaSem.equalsIgnoreCase("viernes")) {
            System.out.println("El día " + diaSem + " es hábil.");
        } else {
            System.out.println("Por favor, ingrese un día válido.");
        }
    }
}

