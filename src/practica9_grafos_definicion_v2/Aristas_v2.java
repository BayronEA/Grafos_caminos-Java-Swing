/* UNIVERSIDAD DE PAMPLONA
    Ingeniería de Sistemas - Matemáticas discretas: Grafos
    M.Sc. Luis Armando Portilla Granados
    Actualizado octubre de 2022: ArrayList
*/

package practica9_grafos_definicion_v2;

//import java.awt.BasicStroke; // 2d para el grosor de la línea
//import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Mariana
 */
public class Aristas_v2 {
    private Nodos_v2 n1, n2;
    private String nombreA;

    public Aristas_v2(Nodos_v2 n1, Nodos_v2 n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.nombreA = n1.getNombreN() + n2.getNombreN();
    }

    public void pintarArista (Graphics g){ //(Graphics2D g)
        Graphics2D graphics = (Graphics2D) g;
        // http://swing-facil.blogspot.com/2011/12/renderinghints-renderizados-y.html
//        graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY); //REBDERIZADO
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //SUAVISADO
//        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR); //INTERPOLACIÓN
        
        graphics.setColor(Color.GRAY);
        
        graphics.setStroke(new BasicStroke(2)); // Graphics2D grosor de línea
        graphics.drawLine(this.getN1().getX(), this.getN1().getY(), this.getN2().getX(), this.getN2().getY());        
    }
    public void repintarArista (Graphics g){ //(Graphics2D g)
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //SUAVISADO
        g.setColor(Color.blue);
        //g.setStroke(new BasicStroke(2)); // Graphics2D grosor de línea
        g.drawLine(this.getN1().getX(), this.getN1().getY(), this.getN2().getX(), this.getN2().getY());        
    }
    /**
     * @return the n1
     */
    public Nodos_v2 getN1() {
        return n1;
    }
    /**
     * @return the n2
     */
    public Nodos_v2 getN2() {
        return n2;
    }
    /**
     * @return the nombreA
     */
    public String getNombreA() {
        return nombreA;
    }
    
}
