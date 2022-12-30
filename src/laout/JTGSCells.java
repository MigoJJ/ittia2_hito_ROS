package laout;
//https://docs.oracle.com/javase/tutorial/uiswing/components/table.html
import javax.swing.*;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class JTGSCells extends JPanel {
	private static String getCellValue ="";
	private static JTable table = null;
    
    public JTGSCells() {
    	JScrollPane scrollPane = new JScrollPane(table);
         	
    	 Object[] roscolumnNames = (Object[]) ReturnrosData.columnNames(); 
        Object[][] rosData = (Object[][]) ReturnrosData.roscrsData();  
//        System.out.println(Arrays.deepToString(rosData));
        table = new JTable(rosData, roscolumnNames);
        table.setFillsViewportHeight(true);
        table.getColumnModel().getColumn(0).setMinWidth(200);
        
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1000, 500));
        table.setRowHeight(25);
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
	        
	        
	        
	        
    
table.addMouseListener( new MouseAdapter(){
    public void mousePressed(MouseEvent e){
        JTable table = (JTable)e.getSource();
        int row = table.rowAtPoint( e.getPoint() );
        int column = table.columnAtPoint( e.getPoint() );

        if (! table.isRowSelected(row))
	        table.changeSelection(row, column, false, false);
	        table.getModel().getValueAt(row, column);
	        getCellValue = (String) table.getModel().getValueAt(row, column);
	        PickuprosJtableCell.makeArrayList(getCellValue);
    }
});

    }

    private static void showFrame() {
        JPanel panel = new JTGSCells();
        panel.setOpaque(true);
        JFrame frame = new JFrame("JTable Selected Cells");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTGSCells::showFrame);
    }
}
