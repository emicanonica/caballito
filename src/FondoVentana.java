import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class FondoVentana extends JLabel {

private Image imagen;
 
     public FondoVentana() {
       this.setLayout(null); 
       this.setToolTipText("Ventana Principal");

  
  try {
       imagen=ImageIO.read(getClass().getResource("/imagenes/wallpaper6.png"));
  }
 catch (IOException e) {
   e.printStackTrace();
  }

  }
 
 public void paintComponent(Graphics g){
  
     super.paintComponent(g);
     g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
 }

}