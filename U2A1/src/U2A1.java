import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class U2A1 extends JFrame {

    private JPanel contentPane;
    private DB database;
    private JLabel connectionStatusLabel;
    private JTable table;
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    U2A1 frame = new U2A1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public U2A1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 900);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JLabel lblConnect = new JLabel("Connect");
        GridBagConstraints gbc_lblConnect = new GridBagConstraints();
        gbc_lblConnect.anchor = GridBagConstraints.EAST;
        gbc_lblConnect.insets = new Insets(0, 0, 5, 5);
        gbc_lblConnect.gridx = 0;
        gbc_lblConnect.gridy = 0;
        contentPane.add(lblConnect, gbc_lblConnect);

        JButton btnConnect = new JButton("Connect to DB");
        GridBagConstraints gbc_btnConnect = new GridBagConstraints();
        gbc_btnConnect.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnConnect.gridwidth = 2;
        gbc_btnConnect.insets = new Insets(0, 0, 5, 5);
        gbc_btnConnect.gridx = 1;
        gbc_btnConnect.gridy = 0;
        contentPane.add(btnConnect, gbc_btnConnect);

        connectionStatusLabel = new JLabel("Not Connected");
        GridBagConstraints gbc_connectionStatusLabel = new GridBagConstraints();
        gbc_connectionStatusLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_connectionStatusLabel.insets = new Insets(0, 0, 5, 0);
        gbc_connectionStatusLabel.gridx = 4;
        gbc_connectionStatusLabel.gridy = 0;
        contentPane.add(connectionStatusLabel, gbc_connectionStatusLabel);

        JLabel lblCustomerId = new JLabel("Customer ID");
        GridBagConstraints gbc_lblCustomerId = new GridBagConstraints();
        gbc_lblCustomerId.anchor = GridBagConstraints.EAST;
        gbc_lblCustomerId.insets = new Insets(0, 0,5, 5);
        gbc_lblCustomerId.gridx = 0;
        gbc_lblCustomerId.gridy = 1;
        contentPane.add(lblCustomerId, gbc_lblCustomerId);
        JTextField txtCustomerId = new JTextField();
        GridBagConstraints gbc_txtCustomerId = new GridBagConstraints();
        gbc_txtCustomerId.insets = new Insets(0, 0, 5, 5);
        gbc_txtCustomerId.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtCustomerId.gridx = 1;
        gbc_txtCustomerId.gridy = 1;
        contentPane.add(txtCustomerId, gbc_txtCustomerId);
        txtCustomerId.setColumns(5);

        JButton btnGetCustomerName = new JButton("Get Customer Name");
        GridBagConstraints gbc_btnGetCustomerName = new GridBagConstraints();
        gbc_btnGetCustomerName.insets = new Insets(0, 0, 5, 5);
        gbc_btnGetCustomerName.gridx = 2;
        gbc_btnGetCustomerName.gridy = 1;
        contentPane.add(btnGetCustomerName, gbc_btnGetCustomerName);

        JLabel lblCustomerName = new JLabel("Customer Name");
        GridBagConstraints gbc_lblCustomerName = new GridBagConstraints();
        gbc_lblCustomerName.anchor = GridBagConstraints.EAST;
        gbc_lblCustomerName.insets = new Insets(0, 0, 5, 5);
        gbc_lblCustomerName.gridx = 0;
        gbc_lblCustomerName.gridy = 2;
        contentPane.add(lblCustomerName, gbc_lblCustomerName);

        JLabel lblCustomerNameResult = new JLabel("");
        GridBagConstraints gbc_lblCustomerNameResult = new GridBagConstraints();
        gbc_lblCustomerNameResult.insets = new Insets(0, 0, 5, 5);
        gbc_lblCustomerNameResult.gridx = 1;
        gbc_lblCustomerNameResult.gridy = 2;
        contentPane.add(lblCustomerNameResult, gbc_lblCustomerNameResult);

        JLabel lblCount = new JLabel("Count");
        GridBagConstraints gbc_lblCount = new GridBagConstraints();
        gbc_lblCount.anchor = GridBagConstraints.EAST;
        gbc_lblCount.insets = new Insets(0, 0, 5, 5);
        gbc_lblCount.gridx = 0;
        gbc_lblCount.gridy = 3;
        contentPane.add(lblCount, gbc_lblCount);

        JButton btnCount = new JButton("Customer Count");
        GridBagConstraints gbc_btnCount = new GridBagConstraints();
        gbc_btnCount.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnCount.gridwidth = 2;
        gbc_btnCount.insets = new Insets(0, 0, 5, 5);
        gbc_btnCount.gridx = 1;
        gbc_btnCount.gridy = 3;
        contentPane.add(btnCount, gbc_btnCount);

        JLabel lblNames = new JLabel("Names");
        GridBagConstraints gbc_lblNames = new GridBagConstraints();
        gbc_lblNames.anchor = GridBagConstraints.EAST;
        gbc_lblNames.insets = new Insets(0, 0, 5, 5);
        gbc_lblNames.gridx = 0;
        gbc_lblNames.gridy = 4;
        contentPane.add(lblNames, gbc_lblNames);

        JButton btnNames = new JButton("Get Company Names");
        GridBagConstraints gbc_btnNames = new GridBagConstraints();
        gbc_btnNames.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnNames.gridwidth = 2;
        gbc_btnNames.insets = new Insets(0, 0, 5, 5);
        gbc_btnNames.gridx = 1;
        gbc_btnNames.gridy = 4;
        contentPane.add(btnNames, gbc_btnNames);

        JScrollPane scrollPane = new JScrollPane();
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridwidth = 5;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 0;
        gbc_scrollPane.gridy = 5;
        contentPane.add(scrollPane, gbc_scrollPane);

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        scrollPane.setViewportView(table);

        JButton btnGetCustomerLastNames = new JButton("Get Customer Last Names");
        GridBagConstraints gbc_btnGetCustomerLastNames = new GridBagConstraints();
        gbc_btnGetCustomerLastNames.insets = new Insets(0, 0, 0, 5);
        gbc_btnGetCustomerLastNames.gridx = 3;
        gbc_btnGetCustomerLastNames.gridy = 3;
        contentPane.add(btnGetCustomerLastNames, gbc_btnGetCustomerLastNames);

        btnConnect.addActionListener(e -> {
            try {
                String dbURL = "jdbc:sqlserver://LAPTOP-SFGHK0FI\\SQLEXPRESS;"
                        + "database=Northwind;"
                        + "user=sa;"
                        + "password=123456;"
                        + "encrypt=false;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

                database = new DB(dbURL);
                connectionStatusLabel.setText("Connection successful");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        btnCount.addActionListener(e -> {
            try {
                String returnedValue = database.getCustomerCount();
                tableModel.setRowCount(0);
                tableModel.setColumnCount(1);
                tableModel.setColumnIdentifiers(new Object[]{"Customer Count"});
                tableModel.addRow(new Object[]{returnedValue});
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        btnNames.addActionListener(e -> {
            try {
                String[] returnedValue = database.getCompanyNames();
                tableModel.setRowCount(0);
                tableModel.setColumnCount(1);
                tableModel.setColumnIdentifiers(new Object[]{"Company Names"});

                for (String companyName : returnedValue) {
                    tableModel.addRow(new Object[]{companyName});
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        btnGetCustomerName.addActionListener(e -> {
            try {
                String customerId = txtCustomerId.getText();
                String customerName = database.getCustomerNameById(customerId);

                if (customerName != null) {
                    lblCustomerNameResult.setText(customerName);
                } else {
                    lblCustomerNameResult.setText("No customer found");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        });

        btnGetCustomerLastNames.addActionListener(e -> {
            try {
                String[] returnedValue = database.getCustomerLastNames();
                tableModel.setRowCount(0);
                tableModel.setColumnCount(1);
                tableModel.setColumnIdentifiers(new Object[]{"Customer Last Names"});

                for (String customerLastName : returnedValue) {
                    tableModel.addRow(new Object[]{customerLastName});
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });


    } // end U2A1 constructor
}

