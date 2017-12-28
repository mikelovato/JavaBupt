package homework5;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class _15211301_WeiXiao_EmployeeUI extends JFrame{
    private Vector<_15211301_WeiXiao_3_Employee> employees;

    private double getAverWage()//计算平均工资
    {
        if(0==employees.size()) return 0;

        double sum=0.0;

        for(_15211301_WeiXiao_3_Employee te:employees)
            sum+=te.earning();

        return sum/employees.size();
    }

    private static final int Iw=320;
    private static final int IH=300;
    private static final int FW=600;
    private static final int FH=400;
    private static final int Cw=200;
    private static final int CH=100;

    class BasePlusCommisionteDialog extends JDialog
    {
        public BasePlusCommisionteDialog(JFrame f)
        {
            super(f);
            initUI();
        }

        private void initUI()
        {
            JPanel panel=new JPanel();
            panel.setLayout(new GridLayout(7,2));

            panel.add(new JLabel("First name:"));
            JTextField firstNameField=new JTextField();
            panel.add(firstNameField);

            panel.add(new JLabel("Last name: "));
            JTextField lastNameField = new JTextField();
            panel.add(lastNameField);

            panel.add(new JLabel("Social security num: "));
            JTextField secNumField = new JTextField();
            panel.add(secNumField);

            panel.add(new JLabel("Base salary: "));
            JTextField baseSalaryField = new JTextField();
            panel.add(baseSalaryField);

            panel.add(new JLabel("Gross sales: "));
            JTextField salesField = new JTextField();
            panel.add(salesField);

            panel.add(new JLabel("Commission rate: "));
            JTextField rateField = new JTextField();
            panel.add(rateField);

            // Add "submit" button
            JButton bSubmit= new JButton("submit");
            bSubmit.addActionListener((event) ->
            {
                try
                {
                    // Make sure security number is no empty
                    if (secNumField.getText().equals(""))
                        throw new IllegalArgumentException();

                    employees.add(new _15211301_WeiXiao_3_BasePlusCommisionEmployee(
                            Double.parseDouble(baseSalaryField.getText()),
                            Double.parseDouble(rateField.getText()),
                            Double.parseDouble(salesField.getText()),
                            firstNameField.getText(),
                            lastNameField.getText(),
                            secNumField.getText()
                    ));

                    System.out.println(employees.get(0));
                }
                catch (Exception e)
                {
                    ErrorLog log = new ErrorLog();
                    log.setVisible(true);
                }
                finally
                {
                    this.dispose();
                }
            });
            panel.add(bSubmit);

            // Add "cancel" button
            JButton bCancel = new JButton("Cancel");
            bCancel.addActionListener ((event) ->
            {
                this.dispose();
            });
            panel.add(bCancel);

            // Add panel and resize
            this.add(panel);
            this.pack();

            // Misc
            setTitle ("Create Base Plus Commision Employee");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent ());
            setSize(Iw, IH);
        }
    }

    private class CommisionEmpDialog extends JDialog
    {
        public CommisionEmpDialog(JFrame f)
        {
            super(f);
            initUI();
        }

        private void initUI()
        {
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(6, 2));

            panel.add(new JLabel("First name: "));
            JTextField firstNameField = new JTextField();
            panel.add(firstNameField);

            panel.add(new JLabel("Last name: "));
            JTextField lastNameField = new JTextField();
            panel.add(lastNameField);

            panel.add(new JLabel("Social security num: "));
            JTextField secNumField = new JTextField();
            panel.add(secNumField);

            panel.add(new JLabel("Gross sales: "));
            JTextField salesField = new JTextField();
            panel.add(salesField);

            panel.add(new JLabel("Commission rate: "));
            JTextField rateField = new JTextField();
            panel.add(rateField);

            // Add "submit" button
            JButton bSubmit= new JButton("submit");
            bSubmit.addActionListener((event) ->
            {
                try
                {
                    // Make sure security number is no empty
                    if (secNumField.getText().equals(""))
                        throw new IllegalArgumentException();

                    employees.add(new _15211301_WeiXiao_3_CommisionEmployee(
                            Double.parseDouble(rateField.getText()),
                            Double.parseDouble(salesField.getText()),
                            firstNameField.getText(),
                            lastNameField.getText(),
                            secNumField.getText()
                    ));

                    System.out.println(employees.get(0));
                }
                catch (Exception e)
                {
                    ErrorLog log = new ErrorLog();
                    log.setVisible(true);


                }
                finally
                {
                    this.dispose();
                }
            });
            panel.add(bSubmit);

            // Add "cancel" button
            JButton bCancel = new JButton("Cancel");
            bCancel.addActionListener ((event) ->
            {
                this.dispose();
            });
            panel.add(bCancel);

            // Add panel and resize
            this.add(panel);
            this.pack();

            // Misc
            setTitle ("Create Commision Employee");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent ());
            setSize(Iw, IH);
        }
    }

    class ErrorLog extends JDialog
    {
        public ErrorLog()
        {
            super();
            initUI();
        }

        private void initUI ()
        {
            // Show error info
            this.add(new JLabel("Invalid input! Please try again", JLabel.CENTER));
            this.pack();

            // Misc
            setTitle ("Error!");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent());
            setSize(Cw, CH);
            this.setModal(true);
        }
    }

    class AverEarningDialog extends JDialog
    {
        public AverEarningDialog()
        {
            super();
            initUI();
        }

        private void initUI()
        {
            // Show info
            this.add(new JLabel("Average Earning: " + getAverWage(), JLabel.CENTER));
            this.pack();

            // Misc
            setTitle ("Average Earning");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent());
            setSize(Cw, CH);
        }
    }

    public _15211301_WeiXiao_EmployeeUI()
    {
        employees = new Vector<_15211301_WeiXiao_3_Employee>();
        initUI();
    }

    private void initUI()
    {
        // Show the menu bar
        initMenu();

        // Show the content
        this.add(new JLabel ("Employee Message System", JLabel.CENTER));

        // Misc
        setTitle ("员工信息的录入和查询");
        setSize (FW, FH);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }

    private void initMenu()
    {
        // Create menu 1-1
        JMenuItem mBPCEmp = new JMenuItem("BasePlusCommisionEmployee");
        mBPCEmp.addActionListener((e) ->
        {
            BasePlusCommisionteDialog dialog = new BasePlusCommisionteDialog(this);
            dialog.setVisible(true);
        });

        // Create menu 1-2
        JMenuItem mCEmp = new JMenuItem("CommisionEmployee");
        mCEmp.addActionListener((e) ->
        {
            CommisionEmpDialog dialog = new CommisionEmpDialog(this);
            dialog.setVisible(true);
        });

        // Create menu 2-1
        JMenuItem mAverSearch = new JMenuItem("AverageEarningSearch");
        mAverSearch.addActionListener((e) ->
        {
            ErrorLog log = new ErrorLog();
            log.setVisible(true);

            AverEarningDialog dialog = new AverEarningDialog();
            dialog.setVisible(true);
        });

        // Create menu 1
        JMenu mEmpInfoInput = new JMenu("EmployeeInfoInput");
        mEmpInfoInput.add(mBPCEmp);
        mEmpInfoInput.add(mCEmp);

        // Create menu 2
        JMenu mSearch = new JMenu("Search");
        mSearch.add(mAverSearch);

        // Create and show menu bar
        JMenuBar mMain = new JMenuBar();
        mMain.add(mEmpInfoInput);
        mMain.add(mSearch);
        this.setJMenuBar(mMain);
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            _15211301_WeiXiao_EmployeeUI gui = new _15211301_WeiXiao_EmployeeUI();
            gui.setVisible(true);
        });
    }

}
