package unidad10;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Lienzo extends JPanel implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;

	Stroke stroke = new BasicStroke(5);

	BufferedImage imagen;

	int x0;
	int y0;
	int x1;
	int y1;

	public Lienzo(int ancho, int alto) {

		setPreferredSize(new Dimension(ancho, alto));
		addMouseListener(this);
		addMouseMotionListener(this);
		imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		Graphics2D g2d = (Graphics2D) g;

		g2d.setStroke(stroke);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(x0, y0, x1, y1);
		x0 = x1;
		y0 = y1;

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

		if ((e.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) != 0) {
			x1 = e.getX();
			y1 = e.getY();
			repaint();
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getButton() == MouseEvent.BUTTON1) {

			x0 = e.getX();
			y0 = e.getY();

		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
