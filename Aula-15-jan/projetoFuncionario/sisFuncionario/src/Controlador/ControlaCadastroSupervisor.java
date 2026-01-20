package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ControlaCadastroSupervisor implements ActionListener {

	JTextField nome;
	JTextField cpf;
	JTextField email;
	JFrame frameTelaPrincipal;

	public ControlaCadastroSupervisor(JTextField nome, JTextField cpf, JTextField email, JFrame frameTelaPrincipal) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.frameTelaPrincipal = frameTelaPrincipal;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("iniciar cadastro");
		System.out.println(nome.getText());
		System.out.println(cpf.getText());
		System.out.println(email.getText());

	}

}
