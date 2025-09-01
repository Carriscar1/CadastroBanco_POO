import javax.swing.*;

public class JanelaBanco extends JFrame {
    public JanelaBanco() {

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel jlAgencia = new JLabel("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        JTextField tfAgencia = new JTextField();
        tfAgencia.setBounds(130, 10, 80, 20);

        JLabel jlConta = new JLabel("Número da Conta:");
        jlConta.setBounds(220, 10, 105, 18);
        JTextField tfConta = new JTextField();
        tfConta.setBounds(340, 10, 80, 20);

        JLabel jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 100, 20);
        JTextField tfNome = new JTextField();
        tfNome.setBounds(80, 50, 300, 20);

        JLabel jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 80, 100, 20);
        JTextField tfEndereco = new JTextField();
        tfEndereco.setBounds(80, 80, 300, 20);

        JLabel jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 110, 100, 20);
        JTextField tfTelefone = new JTextField();
        tfTelefone.setBounds(80, 110, 300, 20);

        JLabel jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 140, 100, 20);
        JTextField tfCpf = new JTextField();
        tfCpf.setBounds(80, 140, 300, 20);


        JRadioButton rbCorrente = new JRadioButton("Conta Corrente", true);
        rbCorrente.setBounds(80, 170, 150, 20);
        JRadioButton rbPoupanca = new JRadioButton("Conta Poupança");
        rbPoupanca.setBounds(230, 170, 150, 20);

        ButtonGroup grupoConta = new ButtonGroup();
        grupoConta.add(rbCorrente);
        grupoConta.add(rbPoupanca);


        JButton btConsultar = new JButton("Consultar");
        btConsultar.setBounds(50, 210, 100, 25);    
        btConsultar.setMnemonic('S');

        JButton btAtualizar = new JButton("Atualizar");
        btAtualizar.setBounds(160, 210, 100, 25);
        btAtualizar.setMnemonic('A');

        JButton btFechar = new JButton("Fechar");
        btFechar.setBounds(270, 210, 100, 25);
        btAtualizar.setMnemonic('F');

        btFechar.addActionListener(e -> System.exit(0));

        add(jlAgencia); add(tfAgencia);
        add(jlConta); add(tfConta);
        add(jlNome); add(tfNome);
        add(jlEndereco); add(tfEndereco);
        add(jlTelefone); add(tfTelefone);
        add(jlCpf); add(tfCpf);
        add(rbCorrente); add(rbPoupanca);
        add(btConsultar); add(btAtualizar); add(btFechar);

        setVisible(true);
        btAtualizar.setEnabled(false);
    }

    public static void main(String[] args) {
        new JanelaBanco();
    }
}
