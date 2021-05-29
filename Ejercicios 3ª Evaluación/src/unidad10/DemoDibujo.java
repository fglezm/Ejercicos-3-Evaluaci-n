package unidad10;

import javax.swing.*;

public class DemoDibujo extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> new DemoDibujo().setVisible(true));

	}

	public DemoDibujo() {

		super("Demo Dibujo");

		setContentPane(new Lienzo(900, 700));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();

		setLocationRelativeTo(null);
	}

}
