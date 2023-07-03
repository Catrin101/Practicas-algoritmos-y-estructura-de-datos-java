package ventanilla;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ventanilla {
    
    static Queue<Cliente> fila;
    static Queue<Cliente> fila2;
    static boolean ocupada;
    static int atendidos;
    static int arribos;
    static Cliente cliente_arribando;
    static Cliente cliente_atendiendo;

    public static void main(String[] args) {
        fila = new LinkedList<>();
        fila2 = new LinkedList<>();
        ocupada = false;
        atendidos = 0;
        arribos = 0;

        Random r = new Random();

        int salida = -1;
        int llegada = r.nextInt(2) + 3;// representa la llegada en 3 o 4 minutos
        cliente_arribando = new Cliente(r.nextInt(60000) + 1, llegada);
        
        int con=0;
        for (int minuto = 0; minuto < 600; minuto++) {
            System.out.println("Hora: "+ reloj(minuto));
            if(con==3){//Cliente anciano
                if (llegada == minuto) {
                    arribos++;
                    System.out.println("Llega el cliente(anciano): " + cliente_arribando);
                    if (!ocupada) {
                        ocupada = true; //Se ha ocupado la ventanilla
                        salida = minuto + r.nextInt(9) + 4;// tiempo de atencion de 2 a 5 minutos
                        cliente_atendiendo = cliente_arribando;
                    } else {
                        System.out.println("Ventanilla ocupada el cliente(anciano) se forma...");
                        fila2.offer(cliente_arribando);
                    }
                    llegada = minuto + r.nextInt(2) + 3;
                    cliente_arribando = new Cliente(r.nextInt(60000) + 1, llegada);
                    System.out.println("El siguiente cliente estara llegando a las: " + reloj(llegada));
                }
                if (salida == minuto) {
                    ocupada = false; //Se ha desocupado la ventanilla
                    atendidos++;
                    if (!fila2.isEmpty()) {
                        cliente_atendiendo = fila2.poll();
                        ocupada = true; //Se ha ocupado la ventanilla
                        salida = minuto + r.nextInt(9) + 4;// tiempo de atencion de 2 a 5 minutos
                    }
                }
                con=0;
            }else{// Cliente normal
                if (llegada == minuto) {
                    arribos++;
                    System.out.println("Llega el cliente: " + cliente_arribando);
                    if (!ocupada) {
                        ocupada = true; //Se ha ocupado la ventanilla
                        salida = minuto + r.nextInt(4) + 2;// tiempo de atencion de 2 a 5 minutos
                        cliente_atendiendo = cliente_arribando;
                    } else {
                        System.out.println("Ventanilla ocupada el cliente se forma...");
                        fila.offer(cliente_arribando);
                    }
                    llegada = minuto + r.nextInt(2) + 3;
                    cliente_arribando = new Cliente(r.nextInt(60000) + 1, llegada);
                    System.out.println("El siguiente cliente estara llegando a las: " + reloj(llegada));
                }
                if (salida == minuto) {
                    ocupada = false; //Se ha desocupado la ventanilla
                    atendidos++;
                    if (!fila.isEmpty()) {
                        cliente_atendiendo = fila.poll();
                        ocupada = true; //Se ha ocupado la ventanilla
                        salida = minuto + r.nextInt(4) + 2;// tiempo de atencion de 2 a 5 minutos
                    }
                }
                con++;
            }
        }
        System.out.println("Estadisticas");
        System.out.println("Numero de clientes atendidos: " + atendidos);
        
        if (!fila.isEmpty()) {
            int min = fila.peek().getLlegada();
            System.out.println("Hora de llegada del primer cliente no atendido: " + reloj(min));
            System.out.println("Clientes que quedaron sin atender: " + fila.size());
        }else{
            System.out.println("Ningun cliente se quedo en fila, todos fueron atendidos...");
        }
    }

    static String reloj(int min) {
        return (8 + (min / 60)) + ":" + ((min % 60 <= 9) ? "0" : "") + (min % 60);
    }
}
