package view;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JTextField;




import bean.Cadastro_Cliente;

import connectionfactory.Conexao;
import dao.Cliente;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Agendamento extends JInternalFrame {
	private JTextField txtnome;
	private JTextField txthora;
	private JTextField txtdata;
	private JTextField txtprocedimento;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacientes frame = new Pacientes();
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
	
	
	
	
	 
	public Agendamento() {
		setClosable(true);
		
		setBounds(100, 100, 632, 597);
		getContentPane().setLayout(null);
        
		JLabel lblCadastroDePacientes = new JLabel("Agendamento de Pacientes:");
		lblCadastroDePacientes.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblCadastroDePacientes.setBounds(10, 22, 243, 22);
		getContentPane().add(lblCadastroDePacientes);
		
		JLabel lblTelefone = new JLabel("Nome:");
		lblTelefone.setBounds(79, 115, 48, 14);
		getContentPane().add(lblTelefone);
		
		txtnome = new JTextField();
		txtnome.setBounds(127, 112, 126, 20);
		getContentPane().add(txtnome);
		txtnome.setColumns(10);
		
		JLabel lblCpfcnpj = new JLabel("Hora:");
		lblCpfcnpj.setBounds(86, 140, 48, 14);
		getContentPane().add(lblCpfcnpj);
		
		txthora = new JTextField();
		txthora.setBounds(127, 140, 198, 20);
		getContentPane().add(txthora);
		txthora.setColumns(10);
		
		JLabel lblRg = new JLabel("Data:");
		lblRg.setBounds(86, 168, 48, 14);
		getContentPane().add(lblRg);
		
		txtdata = new JTextField();
		txtdata.setBounds(127, 165, 126, 20);
		getContentPane().add(txtdata);
		txtdata.setColumns(10);
		
		JLabel lblRuan = new JLabel("Procedimento:");
		lblRuan.setBounds(39, 196, 78, 14);
		getContentPane().add(lblRuan);
		
		txtprocedimento = new JTextField();
		txtprocedimento.setBounds(127, 193, 233, 20);
		getContentPane().add(txtprocedimento);
		txtprocedimento.setColumns(10);
		
		table = new JTable();
    	table.setModel(new DefaultTableModel(
    		new Object[][]{},
    		//TITULOS DAS SUAS COLUNAS
    		new String []{"REGISTRO","NOME","HORA","DATA","PROCEDIMENTO"})     
	
    		{
    			public boolean isCellEditable(int r, int c)
    			{
    				return false;
    			}
    		} );
    	
    	//ALINHAMENTO DO TEXTO	
    	DefaultTableCellRenderer center = new DefaultTableCellRenderer();
    	center.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	//DEFINE O TAMANHO DA LARGURA DA CULUNA
    	table.getColumnModel().getColumn(0).setPreferredWidth(50);
    	//NÃO PERMITE REDIMENCIONAMENTO
    	table.getColumnModel().getColumn(0).setResizable(false);
    	//CENTRALIZA O TEXTO
    	table.getColumnModel().getColumn(0).setCellRenderer(center);
    	
    	table.getColumnModel().getColumn(1).setPreferredWidth(250);
    	table.getColumnModel().getColumn(1).setResizable(false);
    	table.getColumnModel().getColumn(1).setCellRenderer(center);
    	table.getColumnModel().getColumn(2).setPreferredWidth(70);
    	table.getColumnModel().getColumn(2).setResizable(false);
    	table.getColumnModel().getColumn(2).setCellRenderer(center);
    	table.getColumnModel().getColumn(3).setPreferredWidth(150);
    	table.getColumnModel().getColumn(3).setResizable(false);
    	table.getColumnModel().getColumn(3).setCellRenderer(center);
    	table.getColumnModel().getColumn(4).setPreferredWidth(50);
    	table.getColumnModel().getColumn(4).setResizable(false);
    	table.getColumnModel().getColumn(4).setCellRenderer(center);
    	
    	//DEFINE A FONTE
    	table.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
    	//NÃO PERMITE A REORDENAÇÃO DAS COLUNAS
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    	table.setSelectionMode(0);
    	
    	JScrollPane Scroll = new JScrollPane();
    	Scroll.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			
    			if(table.getSelectedRow() != -1) {
    				txtnome.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
    				txthora.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
    				txtdata.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
    				txtprocedimento.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
    		
    				
    			}
    			
    		}
    	});
    	Scroll.setViewportView(table);
    	Scroll.setBounds(10,365,600,200);
    	getContentPane().add(Scroll);
    	
    	
		
		JButton btnNovo = new JButton("NOVO");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnome.setText(null);
				txtdata.setText(null);
				txthora.setText(null);
				txtprocedimento.setText(null);

			}
		});
		btnNovo.setBounds(39, 329, 109, 23);
		getContentPane().add(btnNovo);
		
		JButton btnSalvar_1 = new JButton("SALVAR");
		btnSalvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Cliente c_cliente = new Cadastro_Cliente();
				// populei o objeto aluno
				c_cliente.setNome(txtnome.getText());
				c_cliente.setRg(txtdata.getText());
				c_cliente.setCpf(txthora.getText());
				c_cliente.setRua(txtprocedimento.getText());
				
				
				
				
				
				try {
					// chamar a classe Cliente
					Cliente cliente = new Cliente();
					cliente.salvar(c_cliente);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso");
					
					
					
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a.getMessage());
				}

				// ====================
				
				
				
				
				
				DefaultTableModel Dtm = (DefaultTableModel) table.getModel();
		    	Object [] dados = {txtnome.getText(),txtdata.getText(),txthora.getText(),txtprocedimento.getText()};
		    	Dtm.addRow(dados);
		    	
		    	
		    	
			}
		});
			

		btnSalvar_1.setBounds(181, 329, 109, 23);
		getContentPane().add(btnSalvar_1);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Cliente c_cliente = new Cadastro_Cliente();
				// populei o objeto aluno
				c_cliente.setNome(txtnome.getText());
				c_cliente.setRg(txtdata.getText());
				c_cliente.setCpf(txthora.getText());
				c_cliente.setRua(txtprocedimento.getText());
			
				
				
				
				
				try {
					// chamar a classe Cliente
					Cliente cliente = new Cliente();
					cliente.atualizar(c_cliente);
					JOptionPane.showMessageDialog(null, "Alterado com sucesso");
					
					
					
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a.getMessage());
				}
				
				
				

				
				if(table.getSelectedRow() != -1 ) {
					
					table.setValueAt(txtnome.getText(), table.getSelectedRow(), 0);
					table.setValueAt(txtdata.getText(), table.getSelectedRow(), 1);
					table.setValueAt(txthora.getText(), table.getSelectedRow(), 2);
					table.setValueAt(txtprocedimento.getText(), table.getSelectedRow(), 5);
					
				}
			}
		});
		btnAlterar.setBounds(325, 329, 109, 23);
		getContentPane().add(btnAlterar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() != -1) {
					
					DefaultTableModel dtm = (DefaultTableModel) table.getModel();
					dtm.removeRow(table.getSelectedRow());
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um campo para excluir.");
				}
			}
		});
		btnExcluir.setBounds(468, 329, 103, 23);
		getContentPane().add(btnExcluir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\thiag\\OneDrive\\Imagens\\Saved Pictures\\fundo.png"));
		label.setBounds(0, -50, 635, 621);
		getContentPane().add(label);
		
		

	}
}