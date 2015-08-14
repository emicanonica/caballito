
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class Movimiento extends JLabel implements ActionListener, MouseListener {
	
	static JFrame form = new JFrame();
	
	Timer tiempo = new Timer(20,this);
	
	int x = 0, y = 500, velX = 0;
	
	int ancho = 50, alto = 40;
	
	public Movimiento(){
		
		tiempo.start();
		addMouseListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void init(){}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(x, y, ancho, alto);

		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if (x < 0){
			velX = 0;
			x = 0;
		}
		
		if (x > (form.getWidth() - ancho)){
			velX = 0;
			x = form.getWidth() - ancho;
		}
		
		x = x + velX;
		repaint();
		
	}

	public static void main(String[] arg){
		
		Movimiento cuadrado_verde = new Movimiento();
		FondoVentana fondo = new FondoVentana();
		
		form.setSize(850,700);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		form.getContentPane().add(fondo);
		form.getContentPane().add(cuadrado_verde);
		cuadrado_verde.setLocation(new Point(1,1));
		fondo.setLocation(new Point(1,2));
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		velX = 0;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		int b = e.getButton();
		
		if(b == MouseEvent.BUTTON1){
			velX = 10;
		}
		if (b == MouseEvent.BUTTON3){
			velX = -10;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}



