package laout;

import javax.swing.*;	
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.Arrays;

public class JTableGetSelectedCells extends JPanel {
    private JTable table = null;

    public JTableGetSelectedCells() {
        initializePanel();
    }

    private static void showFrame() {
        JPanel panel = new JTableGetSelectedCells();
        panel.setOpaque(true);
        JFrame frame = new JFrame("JTable Selected Cells");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTableGetSelectedCells::showFrame);
    }

    private void initializePanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1500, 500));
        table = new JTable(new PremiereLeagueTableModel());

        table.getColumnModel().getColumn(0).setMinWidth(200);
        table.setFillsViewportHeight(true);
        table.setRowHeight(25);
       
//        table.getCellSelectionEnabled();
            int selectionMode = table.getSelectionModel().getSelectionMode();
            if (selectionMode == ListSelectionModel.SINGLE_SELECTION) {
                int rowIndex = table.getSelectedRow();
                int colIndex = table.getSelectedColumn();
                System.out.printf("Selected [Row,Column] = [%d,%d]\n", rowIndex, colIndex);
                
////            System.out.printf("Selected [Row,Column] = [%d,%d]\n", i, j);
            Object targetcellData = (table.getValueAt(rowIndex,colIndex));
            PickuprosJtableCell.makeArrayList(targetcellData); 
                
                
         } else if (selectionMode == ListSelectionModel.SINGLE_INTERVAL_SELECTION ||
                    selectionMode == ListSelectionModel.MULTIPLE_INTERVAL_SELECTION) {
                int rowIndexStart = table.getSelectedRow();
                int rowIndexEnd = table.getSelectionModel().getMaxSelectionIndex();
                int colIndexStart = table.getSelectedColumn();
                int colIndexEnd = table.getColumnModel().getSelectionModel().getMaxSelectionIndex();
            
         }
    }
    public static class PremiereLeagueTableModel extends AbstractTableModel {
        // TableModel's column names
        String[]  roscolumnNames = (String[]) ReturnrosData.columnNames(); 
        private  String [] columnNames = roscolumnNames;
        // TableModel's data
        Object[][] rosData = (Object[][]) ReturnrosData.roscrsData();  
        private  Object[][] data = rosData;

        public int getRowCount() {
            return data.length;
        }
        public int getColumnCount() {
            return roscolumnNames.length;
        }
        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }
        public Object getValueAt(int rowIndex, int columnIndex) {
            return data[rowIndex][columnIndex];
        }
    }
}
