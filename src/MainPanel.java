import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Hashtable;
import java.util.Objects;

public class MainPanel extends JPanel {

    private User user;
    private Font font1;
    private Font font2;
    private JLabel heightLabelNumber;
    private TextField firstNameData;
    private TextField lastNameData;
    private TextField ageData;
    private TextField weightDate;
    private JComboBox<String> genderChoices;
    private JComboBox<String> bodyFrameChoice;
    private JSlider heightSlider;
    private JButton calculate;
    private JButton save;
    private JPanel personalData;
    private JPanel personal_H_W_Bf;
    private JPanel results;

    public MainPanel(){
        this.setLayout(null);

        this.calculate = new JButton();
        this.calculate.setVisible(false);

        this.font1 = new Font("Ariel", Font.PLAIN, 20);
        this.font2 = new Font("Ariel", Font.PLAIN, 18);

        this.user = new User();

        this.personalData = new JPanel();
        this.add(getPersonalData());

        this.personal_H_W_Bf = new JPanel();
        this.add(getPersonal_H_W_Bf());

        this.results = new JPanel();
        this.add(getResults());
    }


    public JPanel getPersonalData(){
        this.personalData.setLayout(null);
        this.personalData.setBounds(30,15,170,330);

        this.personalData.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("personalData"),
                    BorderFactory.createEmptyBorder(0, 0, 0, 0)));

        this.genderChoices = null;
        final String[] genderComboTexts = { "Male", "Female" };

        JLabel firstNameLabel = new JLabel("first name");
        firstNameLabel.setFont(font1);
        JLabel lastNameLabel = new JLabel("last name");
        lastNameLabel.setFont(font1);
        JLabel genderLabel = new JLabel("gender");
        genderLabel.setFont(font1);
        JLabel ageLabel = new JLabel("age");
        ageLabel.setFont(font1);

        this.firstNameData = new TextField();
        firstNameData.setFont(font2);
        this.lastNameData  = new TextField();
        lastNameData.setFont(font2);
        this.ageData = new TextField();
        ageData.setFont(font2);

        firstNameLabel.setBounds(15,25,100,20);
        firstNameData.setBounds(15,45,140,28);
        this.personalData.add(firstNameData);
        this.personalData.add(firstNameLabel);

        lastNameLabel.setBounds(15,95,100,20);
        lastNameData.setBounds(15,115,140,28);
        this.personalData.add(lastNameData);
        this.personalData.add(lastNameLabel);

        ageLabel.setBounds(15,160,100,27);
        ageData.setBounds(15,187,140,28);
        this.personalData.add(ageData);
        this.personalData.add(ageLabel);


        genderLabel.setBounds(15,230,100,27);
        genderChoices = new JComboBox<>(genderComboTexts);
        genderChoices.setFont(font2);
        genderChoices.setBounds(15,260,140,25);
        this.personalData.add(genderLabel);
        this.personalData.add(genderChoices);


        return this.personalData;
    }

    public JPanel getPersonal_H_W_Bf() {
        this.personal_H_W_Bf.setLayout(null);
        this.personal_H_W_Bf.setBounds(250,15,320,330);

        this.personal_H_W_Bf.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("personal_H_W_Bf"),
                BorderFactory.createEmptyBorder(0, 0, 0, 0)));

        this.bodyFrameChoice = null;
        final String[] bodyFrameComboText = { "Small", "Medium" , "Large" };


        JLabel bodyFrameLabel = new JLabel("body frame");
        bodyFrameLabel.setFont(font1);
        JLabel weightLabel = new JLabel("weight");
        weightLabel.setFont(font1);
        JLabel headHeightLabel = new JLabel("height scale");
        headHeightLabel.setFont(font2);
        JLabel heightLabel = new JLabel("height:");
        heightLabel.setFont(font1);
        this.heightLabelNumber = new JLabel("165");
        this.heightLabelNumber.setFont(font2);

        this.weightDate = new TextField();
        weightDate.setFont(font2);


        bodyFrameLabel.setBounds(15,25,100,25);
        bodyFrameChoice = new JComboBox<>(bodyFrameComboText);
        bodyFrameChoice.setFont(font2);
        bodyFrameChoice.setBounds(15,50,140,28);
        this.personal_H_W_Bf.add(bodyFrameLabel);
        this.personal_H_W_Bf.add(bodyFrameChoice);

        weightLabel.setBounds(15,165,100,25);
        weightDate.setBounds(15,192,140,28);
        this.personal_H_W_Bf.add(weightLabel);
        this.personal_H_W_Bf.add(weightDate);


        headHeightLabel.setBounds(200,25,130,28);
        heightLabel.setBounds(15,230,60,28);
        heightLabelNumber.setBounds(80,230,50,28);
        this.heightSlider = new JSlider(JSlider.VERTICAL, 130, 200, 165);
        this.heightSlider.setBounds(200,50,50,270);
        this.heightSlider.setMinorTickSpacing(1);
        this.heightSlider.setMajorTickSpacing(5);
        this.heightSlider.setPaintTicks(true);

        Hashtable<Integer, JLabel> labels = new Hashtable<>();
            labels.put(130, new JLabel("130"));
            labels.put(140, new JLabel("140"));
            labels.put(150, new JLabel("150"));
            labels.put(160, new JLabel("160"));
            labels.put(170, new JLabel("170"));
            labels.put(180, new JLabel("180"));
            labels.put(190, new JLabel("190"));
            labels.put(200, new JLabel("200"));

        this.heightSlider.setLabelTable(labels);
        this.heightSlider.setPaintLabels(true);

        this.heightSlider.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                heightLabelNumber.setText("" + heightSlider.getValue());
            }
        });
        this.personal_H_W_Bf.add(heightSlider);
        this.personal_H_W_Bf.add(heightLabel);
        this.personal_H_W_Bf.add(heightLabelNumber);
        this.personal_H_W_Bf.add(headHeightLabel);

        this.save = new JButton();
        this.save.setBackground(Color.CYAN);
        this.save.setBounds(15,260,100,50);
        this.save.setText("save");
        this.save.setFont(font1);

        this.save.addActionListener((e -> {
            this.calculate.setVisible(true);

            this.user.setHeight(Integer.parseInt(this.heightLabelNumber.getText()));

            if (this.firstNameData.getText().equals("")){
                JOptionPane.showMessageDialog(this, "invalid first name");
                this.calculate.setVisible(false);
            }else {
                this.user.setFirstName(this.firstNameData.getText());
            }

            if (this.lastNameData.getText().equals("")){
                JOptionPane.showMessageDialog(this, "invalid last name");
                this.calculate.setVisible(false);
            }else {
                this.user.setLastName(this.lastNameData.getText());
            }


            try {
                this.user.setAge(Double.parseDouble(this.ageData.getText()));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(this, "invalid age!");
                this.calculate.setVisible(false);
            }

            this.user.setGender(Objects.requireNonNull(this.genderChoices.getSelectedItem()).toString());
            this.user.setBodyFrame(Objects.requireNonNull(this.bodyFrameChoice.getSelectedItem()).toString());

            try {
                this.user.setActualWeight(Double.parseDouble(this.weightDate.getText()));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(this, "invalid weight!");
                this.calculate.setVisible(false);
            }
        }));
        this.personal_H_W_Bf.add(save);


        return this.personal_H_W_Bf;
    }

    public JPanel getResults(){
        this.results.setLayout(null);
        this.results.setBounds(620 , 15 , 200 , 330);
        this.results.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("results"),
                BorderFactory.createEmptyBorder(0, 0, 0, 0)));

        JLabel BMILabel = new JLabel("BMI score:");
        BMILabel.setFont(font1);
        JLabel weightStatusLabel = new JLabel("weight status:");
        weightStatusLabel.setFont(font1);
        JLabel idealWeightLabel = new JLabel("ideal weight:");
        idealWeightLabel.setFont(font1);

        JLabel BMIDataLabel = new JLabel("null");
        BMIDataLabel.setFont(font2);
        JLabel weightStatusDataLabel = new JLabel("null");
        weightStatusDataLabel.setFont(font2);
        JLabel idealWeightDataLabel = new JLabel("null");
        idealWeightDataLabel.setFont(font2);


        BMILabel.setBounds(15,25,150,25);
        BMIDataLabel.setBounds(15,50,100,20);

        weightStatusLabel.setBounds(15,100,150,25);
        weightStatusDataLabel.setBounds(15,125,100,20);

        idealWeightLabel.setBounds(15,170,150,25);
        idealWeightDataLabel.setBounds(15,195,100,20);



        this.calculate.setBounds(15,260,170,50);
        this.calculate.setBackground(Color.CYAN);
        this.calculate.setText("calculate BMI");
        this.calculate.setFont(font1);

        this.calculate.addActionListener((e -> {
            BMIDataLabel.setText(String.valueOf(this.user.getBMIScore()));
            weightStatusDataLabel.setText(this.user.getWeightStatus());
            idealWeightDataLabel.setText(String.valueOf(this.user.getIdealWeight()));

        }));


        this.results.add(calculate);
        this.results.add(BMILabel);
        this.results.add(BMIDataLabel);
        this.results.add(weightStatusLabel);
        this.results.add(weightStatusDataLabel);
        this.results.add(idealWeightLabel);
        this.results.add(idealWeightDataLabel);


        return this.results;
    }

}