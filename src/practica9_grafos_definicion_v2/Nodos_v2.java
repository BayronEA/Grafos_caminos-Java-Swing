/* UNIVERSIDAD DE PAMPLONA
    Ingeniería de Sistemas - Matemáticas discretas: Grafos
    M.Sc. Luis Armando Portilla Granados
    Actualizado octubre de 2022: ArrayList
*/

package practica9_grafos_definicion_v2;

//import java.awt.BasicStroke; // 2d para el grosor de la línea
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.RenderingHints;

/**
 *
 * @author Mariana
 */
public class Nodos_v2 {
    private int x;
    private int y;
    private String nombreN;
    static final int d = 20;  // diámetro para el óvalo

    public Nodos_v2(int x, int y, int i) {
        this.x = x;
        this.y = y;
        this.nombreN = Character.toString((char)(65+i)); //+" "+ Integer.toString(x) + "," + Integer.toString(y);
        
    }
    public void pintarNodo (Graphics g){
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // alta definición
//        graphics.setColor(Color.PINK); // asigna colores de la paleta básica
        Color COLOR_NODO = new Color(0, 196, 255);
        graphics.setColor(COLOR_NODO); // asigna colores personalizados
        graphics.fillOval(this.getX() - getD()/2, this.getY() - getD()/2, getD(), getD()); // relleno del círculo
        
//        graphics.setColor(Color.RED);
//        graphics.drawOval(this.getX() - getD()/2, this.getY() - getD()/2, getD(), getD()); // *** contorno del círculo
        //drawOval(int x, int y, int width, int height)
        //La esquina superior izquierda esta en (x,y), y se especifica la anchura (width) y la altura (height)
        //Si la anchura y la altura son iguales, se dibuja la circunferencia.
        graphics.setColor(Color.DARK_GRAY);
        graphics.drawString(this.getNombreN(), this.getX() - getD()/2, this.getY() - getD()/2); // *** nombre del vértice
        //drawString(String str, int x, int y)
        //Dibuja la string str, empieza en el punto (x,y). x define la posición de la izquierda de la String. y define la altura para la línea base 
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the nombre
     */
    public String getNombreN() {
        return nombreN;
    }

    /**
     * @return the d
     */
    public static int getD() {
        return d;
    }
    
}
