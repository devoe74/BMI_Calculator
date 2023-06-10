
import javax.swing.*;

public class Window extends JFrame {

    public Window (){
        this.setResizable(false);
        this.setSize(900, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Box volume & area");
        this.setLayout(null);

        MainPanel mainPanel = new MainPanel();
        mainPanel.setBounds(0,0,1000,500);
        mainPanel.setVisible(true);
        this.add(mainPanel);

    }


    public void showWindow(){
        this.setVisible(true);
    }

}
