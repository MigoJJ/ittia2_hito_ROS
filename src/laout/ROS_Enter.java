package laout;
//https://uw.pressbooks.pub/fcmtextbook/chapter/review-of-systems-ros/
import javax.swing.*;	
import javax.swing.table.TableColumn;
import lgs_comm.GetRowNoAt;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ROS_Enter extends JPanel {
	private static String getCellValue =null;
	protected static JTable table = null;
    
    public ROS_Enter() {
    	JScrollPane scrollPane = new JScrollPane(table);

    	 Object[] roscolumnNames = (Object[]) ROS_JtableDATA.columnNames(); 
        Object[][] rosData = (Object[][]) ROS_JtableDATA.roscrsData();  
//        System.out.println(Arrays.deepToString(rosData));
        table = new JTable(rosData, roscolumnNames);
        table.setFillsViewportHeight(true);
        table.getColumnModel().getColumn(0).setMinWidth(240);
        
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(2400, 600));
        table.setRowHeight(30);
        table.setFont(new Font("Arial", Font. PLAIN, 16));
        add(table.getTableHeader(), BorderLayout.PAGE_START);
        add(table, BorderLayout.CENTER);
        
        TableColumn column = null;
	        for (int i = 0; i < 8; i++) {
	            column = table.getColumnModel().getColumn(i);
	            if (i == 2) {
	                column.setPreferredWidth(100); //third column is bigger
	            } else {
	                column.setPreferredWidth(50);
	            }
	        }
    
table.addMouseListener(new MouseAdapter(){
    public void mousePressed(MouseEvent e){

    	 JTable table = (JTable)e.getSource();
        int row = table.rowAtPoint( e.getPoint() );
        int column = table.columnAtPoint( e.getPoint() );

        if (! table.isRowSelected(row))
	        table.changeSelection(row, column, false, false);
	        table.getModel().getValueAt(row, column);
	        getCellValue = (String) table.getModel().getValueAt(row, column);

	        ROS_AddArrayList.main(getCellValue,row,column);
    }
});

    }

    private static void showFrame() {
        JPanel panel = new ROS_Enter();
        panel.setOpaque(true);
        JFrame frame = new JFrame("JTable Selected Cells");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ROS_Enter::showFrame);
    }
}
