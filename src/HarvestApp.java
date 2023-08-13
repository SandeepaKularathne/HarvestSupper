import javax.swing.JFrame;

public class HarvestApp{

    public static void main(String[] args) {

        //main class
        EmployeeUi empMgr = new EmployeeUi();
        empMgr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        empMgr.setVisible(true);

    }
    
}