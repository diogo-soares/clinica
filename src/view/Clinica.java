package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.Funcionario;

import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Clinica extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clinica frame = new Clinica();
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
	public Clinica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktop = new JDesktopPane();
		contentPane.add(desktop, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 851, 53);
		desktop.add(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		mnCadastros.setIcon(new ImageIcon("C:\\Users\\thiag\\Downloads\\registration.png"));
		menuBar.add(mnCadastros);
		
		JMenuItem mntmCliente = new JMenuItem("Pacientes");
		mntmCliente.setIcon(new ImageIcon("C:\\Users\\diogo\\Desktop\\Photo\\Cliente.jpeg"));
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pacientes p = new Pacientes();
				p.setVisible(true);
				desktop.add(p);
			}
		});
		
		
		mnCadastros.add(mntmCliente);
		
		JSeparator separator_1 = new JSeparator();
		mnCadastros.add(separator_1);
		
		
		JMenuItem mntmFornecedor = new JMenuItem("Funcionarios");
		mntmFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Funcionarios f = new Funcionarios();
				f.setVisible(true);
				desktop.add(f);
				
				
				
			}
		});
		mntmFornecedor.setIcon(new ImageIcon("C:\\Users\\diogo\\Desktop\\Photo\\Funcionario.jpeg"));
		mnCadastros.add(mntmFornecedor);
		
		JSeparator separator_2 = new JSeparator();
		mnCadastros.add(separator_2);
		
		JMenu mnAgenda = new JMenu("Agenda");
		mnAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agendamento a = new Agendamento();
				a.setVisible(true);
				desktop.add(a);
			}
		});
		mnAgenda.setIcon(new ImageIcon("C:\\Users\\thiag\\Downloads\\notebook.png"));
		menuBar.add(mnAgenda);
		
		JMenuItem mntmAgendamento = new JMenuItem("Agendamento");
		mntmAgendamento.setIcon(new ImageIcon(Clinica.class.getResource("/img/WhatsApp Image 2019-05-27 at 16.30.47.jpeg")));
		mntmAgendamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				Agendamento a = new Agendamento();
				a.setVisible(true);
				desktop.add(a);
				
				
				//
				
			}
		});
		mnAgenda.add(mntmAgendamento);
	}
}