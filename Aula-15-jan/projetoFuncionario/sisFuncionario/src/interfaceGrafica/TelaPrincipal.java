package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControlaTelaPrincipal;

public class TelaPrincipal {

	public void menuPrincipal() {
		System.out.println("Inicio do metodo menuPrincipal");

		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(300, 300);

		JPanel panelMenuPrincipal = new JPanel();

		JLabel labelOpcao1 = new JLabel("1 - PARA ASSISTENTE ADMINISTRATIVO");
		panelMenuPrincipal.add(labelOpcao1);

		JLabel labelOpcao2 = new JLabel("2 - SUPERVISOR AUXILIAR");
		panelMenuPrincipal.add(labelOpcao2);

		JTextField textoOpcao = new JTextField(10);
		panelMenuPrincipal.add(textoOpcao);

		JButton botaoEnviar = new JButton("Enviar");
		panelMenuPrincipal.add(botaoEnviar);

		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setLocationRelativeTo(frameMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		ControlaTelaPrincipal controladorTelaPrincipal = new ControlaTelaPrincipal(textoOpcao, frameMenuPrincipal);
		botaoEnviar.addActionListener(controladorTelaPrincipal);

	}

}
