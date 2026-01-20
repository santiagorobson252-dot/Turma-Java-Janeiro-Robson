package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import interfaceGrafica.TelaCadastroDeSupervisor;

public class ControlaTelaPrincipal implements ActionListener {

	JTextField opcao;
	TelaCadastroDeSupervisor criacaoTelaCadastroSupervisor = new TelaCadastroDeSupervisor();
	JFrame frameMenu;

	public ControlaTelaPrincipal(JTextField opcao, JFrame frameMenu) {
		this.opcao = opcao;
		this.frameMenu = frameMenu;
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		System.out.println("Foi digitado" + opcao.getText());
		
		switch (opcao.getText()) {
		
		case "1": {
			criacaoTelaCadastroSupervisor.formularioSupervisor(frameMenu);
			frameMenu.setVisible(false);
			System.out.println("Cadastro do supervisor");
			break;
		}

		case "2": {
			System.out.println("Cadastro de assistente administrativo");
			break;
		}

		}

	}

}
