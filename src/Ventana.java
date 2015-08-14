import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private FondoVentana fondo;

        public Ventana(){
  
           this.setLayout(null);
           this.setTitle("ventana");
           this.setBounds(40,40,600,400);
           //this.setUndecorated(true);
           this.setLocationRelativeTo(null);
           fondo = new FondoVentana();
           //this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
           this.add(fondo);
      }
}