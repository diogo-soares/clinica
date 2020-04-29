package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bean.Cadastro_Cliente;
import bean.Cadastro_Funcionario;
import dao.Cliente;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ResourceBundle.Control;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Consulta extends JInternalFrame   {
	protected static final String Cadastro_Funcionario = null;
	protected static final List<String> Cadastro_Cliente = null;
	private JTextField txtPesquisaNome;
	private JTextField textField_Nome;
	private JTextField textField_Telefone;
	private JTextField textField_Email;
	private JTextField textField_cpf;
	private JTextField textField_Rua;
	private JTextField textField_Estado;
	private JTextField textField_Bairro;
	private JTextField textField_Cidade;
	private JTextField textField_rg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
              
	/**
	 * Create the frame.
	 */
	public Consulta() {
		setBounds(100, 100, 639, 368);
		getContentPane().setLayout(null);
		
		txtPesquisaNome = new JTextField();
		txtPesquisaNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
				
			}
		});
		txtPesquisaNome.setBounds(140, 33, 344, 20);
		getContentPane().add(txtPesquisaNome);
		txtPesquisaNome.setColumns(10);
		
		JLabel lblC = new JLabel("Consultar Nome Paciente:");
		lblC.setBounds(10, 36, 135, 14);
		getContentPane().add(lblC);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				
				
				bean.Cadastro_Cliente mod = (bean.Cadastro_Cliente) Cadastro_Cliente;
			  
				mod.setPesquisa(txtPesquisaNome.getText());
				Cadastro_Cliente model = buscarCliente(mod);
				
				textField_Nome.setText(model.getNome());
				textField_rg.setText(model.getRg());
				textField_Email.setText(model.getEmail());
				textField_Rua.setText(model.getRua());
				textField_Bairro.setText(model.getBairro());
				textField_Telefone.setText(model.getTell());
				textField_cpf.setText(model.getCpf());
				textField_Estado.setText(model.getEstado());
				textField_Cidade.setText(model.getCidade());
				
				
				
				
				//
			}

			private bean.Cadastro_Cliente buscarCliente(bean.Cadastro_Cliente mod) {
				// TODO Auto-generated method stub
				return mod;
			}
		});
		btnPesquisar.setBounds(494, 32, 102, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 76, 40, 14);
		getContentPane().add(lblNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setBounds(60, 74, 242, 17);
		getContentPane().add(textField_Nome);
		textField_Nome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefone :");
		lblNewLabel.setBounds(10, 193, 59, 14);
		getContentPane().add(lblNewLabel);
		
		textField_Telefone = new JTextField();
		textField_Telefone.setBounds(70, 190, 161, 20);
		getContentPane().add(textField_Telefone);
		textField_Telefone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(10, 101, 40, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(60, 98, 242, 20);
		getContentPane().add(textField_Email);
		textField_Email.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cpf/cnpj :");
		lblNewLabel_2.setBounds(349, 101, 59, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_cpf = new JTextField();
		textField_cpf.setBounds(408, 98, 135, 20);
		getContentPane().add(textField_cpf);
		textField_cpf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Rua/n:");
		lblNewLabel_3.setBounds(10, 126, 40, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_Rua = new JTextField();
		textField_Rua.setBounds(60, 123, 242, 20);
		getContentPane().add(textField_Rua);
		textField_Rua.setColumns(10);
		
		JLabel lblCidade = new JLabel("Estado :");
		lblCidade.setBounds(349, 126, 59, 14);
		getContentPane().add(lblCidade);
		
		textField_Estado = new JTextField();
		textField_Estado.setBounds(408, 123, 135, 20);
		getContentPane().add(textField_Estado);
		textField_Estado.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 154, 46, 14);
		getContentPane().add(lblBairro);
		
		textField_Bairro = new JTextField();
		textField_Bairro.setBounds(60, 151, 242, 20);
		getContentPane().add(textField_Bairro);
		textField_Bairro.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade :");
		lblNewLabel_4.setBounds(349, 154, 59, 14);
		getContentPane().add(lblNewLabel_4);
		
		textField_Cidade = new JTextField();
		textField_Cidade.setBounds(408, 151, 135, 20);
		getContentPane().add(textField_Cidade);
		textField_Cidade.setColumns(10);
		
		JLabel lblRg = new JLabel("rg:");
		lblRg.setBounds(349, 76, 46, 14);
		getContentPane().add(lblRg);
		
		textField_rg = new JTextField();
		textField_rg.setBounds(408, 73, 135, 20);
		getContentPane().add(textField_rg);
		textField_rg.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnVoltar.setBounds(524, 304, 89, 23);
		getContentPane().add(btnVoltar);

	}
}