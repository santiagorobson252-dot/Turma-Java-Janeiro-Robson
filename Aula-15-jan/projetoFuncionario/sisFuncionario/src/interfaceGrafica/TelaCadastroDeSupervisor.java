package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControlaCadastroSupervisor;

public class TelaCadastroDeSupervisor {
	public void formularioSupervisor(JFrame frameMenu) {
		
		String nomeDoSupervisor = "Digite o nome do Supervisor";
		String cpf = "Digite o cpf do Supervisor";
		String email = "Digite o email do Supervisor";

		JFrame frameCadastroSupervisor = new JFrame();
		frameCadastroSupervisor.setSize(300, 250);

		JPanel panelSupervisor = new JPanel();

		JLabel labelNome = new JLabel(nomeDoSupervisor);
		panelSupervisor.add(labelNome);
		JTextField textNome = new JTextField(10);
		panelSupervisor.add(textNome);

		JLabel labelCpf = new JLabel(cpf);
		panelSupervisor.add(labelCpf);
		JTextField textCpf = new JTextField(10);
		panelSupervisor.add(textCpf);

		JLabel labelEmail = new JLabel(email);
		panelSupervisor.add(labelEmail);
		JTextField textEmail = new JTextField(10);
		panelSupervisor.add(textEmail);	

		JButton botaoCadastrarSupervisor = new JButton("cadastrar");
		panelSupervisor.add(botaoCadastrarSupervisor);

		JButton botaoMenuInicial = new JButton("menu Inicial");
		panelSupervisor.add(botaoMenuInicial);

		frameCadastroSupervisor.add(panelSupervisor);
		frameCadastroSupervisor.setLocationRelativeTo(frameCadastroSupervisor);
		frameCadastroSupervisor.setVisible(true);		
	}
}
