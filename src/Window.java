
import javax.swing.*;

public class Window extends JFrame {

    private MainPanel mainPanel;
    public Window (){
        this.setResizable(false);
        this.setSize(900, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Box volume & area");
        this.setLayout(null);

        this.mainPanel = new MainPanel();
        this.mainPanel.setBounds(0,0,1000,500);
        this.mainPanel.setVisible(true);
        this.add(this.mainPanel);

    }


    public void showWindow(){
        this.setVisible(true);
    }

}
