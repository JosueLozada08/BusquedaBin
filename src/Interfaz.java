import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JTabbedPane tabbedPane1;
    private javax.swing.JPanel JPanel;
    private JButton empezarButton;
    private JTextArea textArea1;
    private Buscar search = new Buscar();
    private int target = 300;



    public Interfaz() {
        empezarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nums1[] = Buscar.generaArreglo(100, 0,  10000);
                System.out.println(nums1);
                int nums2[] = Buscar.generaArreglo(1000000, 0,  1000000000);
                int nums3[] = Buscar.generaArreglo(1000000000, 0,  10000000);


                long tiempoInicial = System.nanoTime();
                search.Lineal(nums1, target);
                long tiempoFinal = System.nanoTime();
                long tiempoTotal= tiempoFinal - tiempoInicial;
                textArea1.append("Busqueda lineal con un arreglo de 10000 = " + tiempoTotal +"\n");
                textArea1.append("Tiempo Inicial:" + tiempoInicial+ "\n");
                textArea1.append("Tiempo Final:" + tiempoFinal+ "\n");
                //System.out.println("Busqueda lineal con un arreglo de 10000 = " + tiempoTotal +"\n") ;


                long tiempoInicial2 = System.nanoTime();
                search.Lineal(nums1, target);
                long tiempoFinal2 = System.nanoTime();
                long tiempoTotal2= tiempoFinal - tiempoInicial;
                textArea1.append("Busqueda lineal con un arreglo de 1000000000 = " + tiempoTotal2 +"\n");
                textArea1.append("Tiempo Inicial:" + tiempoInicial2+ "\n");
                textArea1.append("Tiempo Final:" + tiempoFinal2+ "\n");
                //System.out.println("Busqueda lineal con un arreglo de 1000000000 = " + tiempoTotal2 +"\n") ;


                long tiempoInicial3 = System.nanoTime();
                search.Lineal(nums1, target);
                long tiempoFinal3 = System.nanoTime();
                long tiempoTotal3= tiempoFinal - tiempoInicial;
                textArea1.append("Busqueda lineal con un arreglo de 10000000 = " + tiempoTotal3 +"\n");
                textArea1.append("Tiempo Inicial:" + tiempoInicial3+ "\n");
                textArea1.append("Tiempo Final:" + tiempoFinal3+ "\n");
                //System.out.println("Busqueda lineal con un arreglo de 10000000 = " + tiempoTotal3 +"\n") ;



            }
        });
    }

    public JPanel getMainPanel(){
        return JPanel;
    }

}
