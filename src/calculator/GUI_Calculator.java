/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import GiaoDien.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author vn
 */
public class GUI_Calculator extends JFrame {

    String operate = "";
    String operator = "";
    boolean isPressed = false;

    private JMenuBar menuBar = new JMenuBar();
    private JLabel lblCasio = new JLabel();
    private JTextField txtResult = new JTextField();
    private JPanel JpnOn_Off = new JPanel();
    private JRadioButton rdOn = new JRadioButton("ON");
    private JRadioButton rdOff = new JRadioButton("OFF");
    private JButton btn1trenx = new JButton("1/x");
    private JButton btnCanBacHai = new JButton("√x");
    private JButton btnLuyThua = new JButton("^");
    private JButton btnPhanTram = new JButton("%");
    private JButton btnDEL = new JButton("DEL");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    private JButton btnPlus = new JButton("+");
    private JButton btnSubtract = new JButton("-");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btnMul = new JButton("*");
    private JButton btnDiv = new JButton("/");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btnBinhPhuong = new JButton("x^2");
    private JButton btnLapPhuong = new JButton("x^3");
    private JButton btn0 = new JButton("0");
    private JButton btnDOT = new JButton(".");
    private JButton btnChange = new JButton("±");
    private JButton btnClear = new JButton("C");
    private JButton btnEquals = new JButton("=");
    private JButton btnSin = new JButton("Sin");
    private JButton btnSinh = new JButton("Sinh");
    private JButton btnGiaiThua = new JButton("!");
    private JButton btnCos = new JButton("Cos");
    private JButton btnCosh = new JButton("Cosh");
    private JButton btnRound = new JButton("R");
    private JButton btnTan = new JButton("Tan");
    private JButton btnTanh = new JButton("Tanh");
    private JButton btnLnx = new JButton("Lnx");
    private JButton btnPi = new JButton("π");
    private JButton btnExp = new JButton("e");
    private JButton btnlogx = new JButton("log");
    private JButton btnBin = new JButton("Bin");
    private JButton btnHex = new JButton("Hex");
    private JButton btnOctal = new JButton("Octal");
    JPanel JPanelMain = new JPanel();
    private JPanel Jpn4 = new JPanel();

    public GUI_Calculator() {
        initCalculator();
        setLocationRelativeTo(null);
    }

    private void initCalculator() {
        setTitle("Basic Calculator");
        ImageIcon image = new ImageIcon("C:\\Users\\vn\\Documents\\NetBeansProjects\\BasicCalculator\\src\\calculator\\iconCalculator.png");
        setIconImage(image.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(346, 482);
        setResizable(false);
        setVisible(true);
        Container container = getContentPane();
//        JPanelMain.setLayout(new BoxLayout(JPanelMain, BoxLayout.Y_AXIS));
        JPanelMain.setLayout(null);

        JMenu fileMenu = new JMenu("File");
        JMenuItem standardItem = new JMenuItem("Standard");
        JMenuItem scienceItem = new JMenuItem("Science");
        JMenuItem  QLSV = new JMenuItem("QLSV");
        JMenu editMenu = new JMenu("Edit");
        JMenu aboutMenu = new JMenu("About");
        JMenuItem aboutItem = new JMenuItem("About");
        menuBar.add(fileMenu);
        fileMenu.add(standardItem);
        fileMenu.add(scienceItem);
        fileMenu.add(QLSV);
        fileMenu.addSeparator();
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);
        aboutMenu.add(aboutItem);
        setJMenuBar(menuBar);
        /*ActionPerformed MenuIte,*/
        standardItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                standardItemActionPerformed(e);
            }
        });
        scienceItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                scienceItemActionPerformed(e);
            }
        });
        QLSV.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                QLSVActionPerformed(e);
            }
        });
        aboutItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                aboutItemActionPerformed(e);
            }
        });
        lblCasio.setBounds(13, 0, 100, 60);
        lblCasio.setText("CASIO");
        lblCasio.setFont(new Font("Tahoma", 1, 16));
        JPanelMain.add(lblCasio);

//        JPanel Jpn2 = new JPanel();
//        Jpn2.setBounds(0, 50, 340, 40);
        txtResult.setBounds(12, 50, 306, 42);
        txtResult.setBorder(BorderFactory.createLineBorder(Color.black));
        txtResult.setFont(new Font("Tahoma", 1, 18));
        txtResult.setForeground(Color.black);
//        txtResult.setPreferredSize(new Dimension(306, 40));
        txtResult.setHorizontalAlignment(JTextField.RIGHT);

        rdOn.setSelected(true);
        JpnOn_Off.setBounds(230, 10, 100, 36);
        JpnOn_Off.setLayout(new BoxLayout(JpnOn_Off, BoxLayout.X_AXIS));
        JpnOn_Off.add(rdOn);
        JpnOn_Off.add(rdOff);
        JPanelMain.add(JpnOn_Off);
        rdOn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                rdOn.setSelected(true);
                rdOff.setSelected(false);
                txtResult.setBackground(Color.white);
                txtResult.setText(null);
                JOptionPane.showMessageDialog(rootPane, "Hello, my friend :)", "ONLINE", 1);
            }
        });
        rdOff.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                rdOn.setSelected(false);
                rdOff.setSelected(true);
              txtResult.setBackground(Color.black);
              JOptionPane.showMessageDialog(rootPane, "Please wake me up :(", "OFFLINE", 0);
            }
        });
        JPanelMain.add(txtResult);

        JPanel Jpn3 = new JPanel();
        Jpn3.setBounds(13, 120, 306, 290);
        Jpn3.setLayout(new GridLayout(5, 5, 5, 5));
        btn1trenx.setPreferredSize(new Dimension(54, 54));
        btn1trenx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn1trenxActionPerformed(e);
            }
        });
        btnCanBacHai.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCanBacHaiActionPerformed(e);
            }
        });
        btnPhanTram.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnPhanTramActionPerformed(e);
            }
        });
        btnDEL.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnDELActionPerformed(e);
            }
        });
        btn0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btn9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btnDOT.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumbersActionPerformed(e);
            }
        });
        btnPlus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnSignActionPerformed(e);
            }
        });
        btnSubtract.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnSignActionPerformed(e);
            }
        });
        btnMul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnSignActionPerformed(e);
            }
        });
        btnDiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnSignActionPerformed(e);
            }
        });
        btnLuyThua.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnSignActionPerformed(e);
            }
        });
        btnBinhPhuong.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnBinhPhuongActionPerformed(e);
            }
        });
        btnLapPhuong.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnLapPhuongActionPerformed(e);
            }
        });
        btnChange.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnChangeActionPerformed(e);
            }
        });
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnClearActionPerformed(e);
            }
        });
        btnEquals.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnEqualsActionPerformed(e);
            }
        });

        Jpn3.add(btn1trenx);
        Jpn3.add(btnCanBacHai);
        Jpn3.add(btnLuyThua);
        Jpn3.add(btnPhanTram);
        Jpn3.add(btnDEL);
        Jpn3.add(btn7);
        Jpn3.add(btn8);
        Jpn3.add(btn9);
        Jpn3.add(btnPlus);
        Jpn3.add(btnSubtract);
        Jpn3.add(btn4);
        Jpn3.add(btn5);
        Jpn3.add(btn6);
        Jpn3.add(btnMul);
        Jpn3.add(btnDiv);
        Jpn3.add(btn1);
        Jpn3.add(btn2);
        Jpn3.add(btn3);
        Jpn3.add(btnBinhPhuong);
        Jpn3.add(btnLapPhuong);
        Jpn3.add(btn0);
        Jpn3.add(btnDOT);
        Jpn3.add(btnChange);
        Jpn3.add(btnClear);
        Jpn3.add(btnEquals);
        JPanelMain.add(Jpn3);

        Jpn4.setBounds(323, 120, 190, 290);
        Jpn4.setLayout(new GridLayout(5, 3, 5, 5));
        btnSin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnSinActionPerformed(e);
            }
        });
        btnSinh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnSinhActionPerformed(e);
            }
        });
        btnGiaiThua.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnGiaiThuaActionPerformed(e);
            }
        });
        btnCos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCosActionPerformed(e);
            }
        });
        btnCosh.setFont(new Font("Tahoma", 1, 9));
        btnCosh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCoshActionPerformed(e);
            }
        });
        btnRound.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnRoundActionPerformed(e);
            }
        });
        btnTan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnTanActionPerformed(e);
            }
        });
        btnTanh.setFont(new Font("Tahoma", 1, 9));
        btnTanh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnTanhActionPerformed(e);
            }
        });
        btnLnx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnLnxActionPerformed(e);
            }
        });
        btnBin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnBinActionPerformed(e);
            }
        });
        btnHex.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnHexActionPerformed(e);
            }
        });
        btnOctal.setFont(new Font("Tahoma", 1, 9));
        btnOctal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnOctalActionPerformed(e);
            }
        });
        Jpn4.add(btnSin);
        Jpn4.add(btnSinh);
        Jpn4.add(btnGiaiThua);
        Jpn4.add(btnCos);
        Jpn4.add(btnCosh);
        Jpn4.add(btnRound);
        Jpn4.add(btnTan);
        Jpn4.add(btnTanh);
        Jpn4.add(btnLnx);
        Jpn4.add(btnPi);
        Jpn4.add(btnExp);
        Jpn4.add(btnlogx);
        Jpn4.add(btnBin);
        Jpn4.add(btnHex);
        Jpn4.add(btnOctal);

        container.add(JPanelMain);

    }

    public void standardItemActionPerformed(ActionEvent e) {
        this.setSize(346, 482);
        JpnOn_Off.setBounds(230, 10, 100, 36);
        txtResult.setSize(306, 42);
        JPanelMain.remove(Jpn4);
        this.setLocationRelativeTo(null);
    }

    public void scienceItemActionPerformed(ActionEvent e) {
        this.setSize(542, 482);
        JpnOn_Off.setBounds(430, 10, 100, 36);
        txtResult.setSize(501, 42);
        JPanelMain.add(Jpn4);
        this.setLocationRelativeTo(null);
    }
    
    public  void QLSVActionPerformed(ActionEvent e){
        this.hide();
        new GUI().setVisible(true);
    }
    public void aboutItemActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "A program of the basic Calculator is written by Do Cao Long");
    }

    public void btn1trenxActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = 1 / value;
        txtResult.setText(String.valueOf(value));
    }

    public void btnCanBacHaiActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.sqrt(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnPhanTramActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = value / 100;
        txtResult.setText(String.valueOf(value));
    }

    public void btnDELActionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("DEL")) {
            if (txtResult.getText().length() > 0) {
                String s = txtResult.getText();
                txtResult.setText(s.substring(0, s.length() - 1));
            }
        }
    }

    public void btnNumbersActionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
    }

    public void btnSignActionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        operator = cmd;
        operate = txtResult.getText();
        txtResult.setText(txtResult.getText() + cmd);
    }

    public void btnBinhPhuongActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.pow(value, 2);
        txtResult.setText(String.valueOf(value));
    }

    public void btnLapPhuongActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.pow(value, 3);
        txtResult.setText(String.valueOf(value));
    }

    public void btnChangeActionPerformed(ActionEvent e) {
        if (txtResult.getText().equals("")) {
            return;
        }
        double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = value * (-1);
        txtResult.setText(String.valueOf(value));
    }

    public void btnClearActionPerformed(ActionEvent e) {
        txtResult.setText(null);
        isPressed = false;
        operate = "";
        operator = "";
    }

    public void btnEqualsActionPerformed(ActionEvent e) {
        if (txtResult.getText().equals("") || operate.equals("")) {
            return;
        }
        String sub = txtResult.getText();
        double numberOne = 0.0;
        double numberTwo = 0.0;
        double answer = 0;
        switch (operator) {
            case "+":
                String[] splitPlus = sub.split("\\+");
                for (String item : splitPlus) {
                    numberOne = Double.parseDouble(splitPlus[0]);
                    numberTwo = Double.parseDouble(splitPlus[1]);
                }
                answer = numberOne + numberTwo;
                break;
            case "-":
                String[] splitSubtract = sub.split("\\-");
                for (String item : splitSubtract) {
                    numberOne = Double.parseDouble(splitSubtract[0]);
                    numberTwo = Double.parseDouble(splitSubtract[1]);
                }
                answer = numberOne - numberTwo;
                break;
            case "*":
                String[] splitMul = sub.split("\\*");
                for (String item : splitMul) {
                    numberOne = Double.parseDouble(splitMul[0]);
                    numberTwo = Double.parseDouble(splitMul[1]);
                }
                answer = numberOne * numberTwo;
                break;
            case "/":
                String[] splitDivide = sub.split("/");
                for (String item : splitDivide) {
                    numberOne = Double.parseDouble(splitDivide[0]);
                    numberTwo = Double.parseDouble(splitDivide[1]);
                }
                answer = numberOne / numberTwo;
                break;
            case "^":
                String[] splitMu = sub.split("\\^");
                for (String item : splitMu) {
                    numberOne = Double.parseDouble(splitMu[0]);
                    numberTwo = Double.parseDouble(splitMu[1]);
                }
                answer = Math.pow(numberOne, numberTwo);
                break;
            default:
                break;
        }
        isPressed = true;
        txtResult.setText("" + answer);
        operate = String.valueOf(answer);
    }

    public void btnSinActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.sin(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnSinhActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.sinh(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnGiaiThuaActionPerformed(ActionEvent e) {
        long value = Long.parseLong(String.valueOf(txtResult.getText()));
        if (value <= 0) {
            txtResult.setText("input > 0");
            isPressed = false;
        }
        long s = 1;
        for (long i = 1; i <= value; i++) {
            s *= i;
        }
        txtResult.setText("" + String.valueOf(s));
    }

    public void btnCosActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.cos(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnCoshActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.cosh(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnRoundActionPerformed(ActionEvent e) {
        double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = (long) Math.round(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnTanActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.tan(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnTanhActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.tan(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnLnxActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.log10(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnlogxActionPerformed(ActionEvent e) {
        Double value = Double.parseDouble(String.valueOf(txtResult.getText()));
        value = Math.log(value);
        txtResult.setText(String.valueOf(value));
    }

    public void btnBinActionPerformed(ActionEvent e) {
        int a = Integer.parseInt(txtResult.getText());
        txtResult.setText(Integer.toString(a, 2));
    }

    public void btnHexActionPerformed(ActionEvent e) {
        int a = Integer.parseInt(txtResult.getText());
        txtResult.setText(Integer.toString(a, 16));
    }

    public void btnOctalActionPerformed(ActionEvent e) {
        int a = Integer.parseInt(txtResult.getText());
        txtResult.setText(Integer.toString(a, 8));
    }

    private Image getIconImage(ImageIcon image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
