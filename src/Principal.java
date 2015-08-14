import javax.swing.JFrame;

public class Principal {
 
    public static void main(String[] args) {
    	
  
    	Ventana v = new Ventana();
    	Movimiento mover = new Movimiento();
    	mover.setVisible(true);
    	v.add(mover);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
        v.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

}