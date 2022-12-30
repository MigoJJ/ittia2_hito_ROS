package laout;
//https://docs.oracle.com/javase/tutorial/uiswing/components/table.html
import javax.swing.*;			
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.Arrays;

public class JTGSCells extends JPanel {
    private static JTable table = null;
    public JTGSCells() {
        Object[] roscolumnNames = (Object[]) ReturnrosData.columnNames(); 
        Object[][] rosData = (Object[][]) ReturnrosData.roscrsData();  
//        System.out.println(Arrays.deepToString(rosData));

        table = new JTable(rosData, roscolumnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        
    	 setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1500, 500));
        add(table.getTableHeader(), BorderLayout.PAGE_START);
        add(table, BorderLayout.CENTER);
        
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
    
    private void initializePanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1000, 500));


        
       
      
       
//        table.getColumnModel().getColumn(0).setMinWidth(200);
//        
//        table.getSelectionModel().addListSelectionListener(
//                new RowColumnListSelectionListener());
//        table.setFillsViewportHeight(true);
//        table.setRowHeight(25);
//        
//        JScrollPane pane = new JScrollPane(table);
//        JPanel control = new JPanel(new FlowLayout());
    }
}
    
    
    
//    static class ROS_data_pickupcell extends AbstractTableModel {
//        // TableModel's column names
//        String[] roscolumnNames = (String[]) ReturnrosData.columnNames(); 
//        private final String [] columnNames = roscolumnNames;
//        // TableModel's data
//        Object[][] rosData = (Object[][]) ReturnrosData.roscrsData();  
//        private final Object[][] data = rosData;
//
//        public int getRowCount() {
//            return data.length;
//        }
//        public int getColumnCount() {
//            return roscolumnNames.length;
//        }
//        @Override
//        public String getColumnName(int column) {
//            return columnNames[column];
//        }
//        public Object getValueAt(int rowIndex, int columnIndex) {
//            return data[rowIndex][columnIndex];
//        }
//    }
//
//    private class RowColumnListSelectionListener implements ListSelectionListener {
//        public void valueChanged(ListSelectionEvent e) {
//
//            }
//        }}
// 