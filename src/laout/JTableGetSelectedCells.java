package laout;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.Arrays;


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

        JFrame frame = new JFrame("JTable Selected Cells Demo");
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
        setPreferredSize(new Dimension(500, 500));

        table = new JTable(new PremiereLeagueTableModel());
        table.getColumnModel().getColumn(0).setMinWidth(200);
        table.getSelectionModel().addListSelectionListener(
                new RowColumnListSelectionListener());

        table.setFillsViewportHeight(true);
        JScrollPane pane = new JScrollPane(table);

        JPanel control = new JPanel(new FlowLayout());
        final JCheckBox cb1 = new JCheckBox("Row Selection");
        final JCheckBox cb2 = new JCheckBox("Columns Selection");
        final JCheckBox cb3 = new JCheckBox("Cells Selection");

        // Change row selection allowed state
        cb1.addActionListener(e -> {
            table.setRowSelectionAllowed(cb1.isSelected());
            table.setColumnSelectionAllowed(!cb1.isSelected());

            cb2.setSelected(!cb1.isSelected());
        });

        // Change column selection allowed state
        cb2.addActionListener(e -> {
            table.setColumnSelectionAllowed(cb2.isSelected());
            table.setRowSelectionAllowed(!cb2.isSelected());
            cb1.setSelected(!cb2.isSelected());
        });

        // Enable cell selection
        cb3.addActionListener(e -> {
            table.setCellSelectionEnabled(cb3.isSelected());
            table.setRowSelectionAllowed(cb3.isSelected());
            table.setColumnSelectionAllowed(cb3.isSelected());
        });

        control.add(cb1);
        control.add(cb2);
        control.add(cb3);

        add(pane, BorderLayout.CENTER);
        add(control, BorderLayout.SOUTH);
    }

    static class PremiereLeagueTableModel extends AbstractTableModel {
        // TableModel's column names
        private final String[] columnNames = {
                "CLUB", "MP", "W", "D", "L", "GF", "GA", "GD", "PTS"
        };

        // TableModel's data
        private final Object[][] data = {
                {"Chelsea", 8, 6, 1, 1, 16, 3, 13, 19},
                {"Liverpool", 8, 5, 3, 0, 22, 6, 16, 18},
                {"Manchester City", 8, 5, 2, 1, 16, 3, 13, 17},
                {"Brighton", 8, 4, 3, 1, 8, 5, 3, 15},
                {"Tottenham", 8, 5, 0, 3, 9, 12, -3, 15}
        };

        public int getRowCount() {
            return data.length;
        }

        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            return data[rowIndex][columnIndex];
        }
    }

    private class RowColumnListSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            if (table.getRowSelectionAllowed() &&
                    !table.getColumnSelectionAllowed()) {
                int[] rows = table.getSelectedRows();
                System.out.println("Selected Rows: " + Arrays.toString(rows));
            }
            if (table.getColumnSelectionAllowed() &&
                    !table.getRowSelectionAllowed()) {
                int[] cols = table.getSelectedColumns();
                System.out.println("Selected Columns: " + Arrays.toString(cols));
            } else if (table.getCellSelectionEnabled()) {
                int selectionMode = table.getSelectionModel().getSelectionMode();
                System.out.println("selectionMode = " + selectionMode);
                if (selectionMode == ListSelectionModel.SINGLE_SELECTION) {
                    int rowIndex = table.getSelectedRow();
                    int colIndex = table.getSelectedColumn();
                    System.out.printf("Selected [Row,Column] = [%d,%d]\n", rowIndex, colIndex);
                } else if (selectionMode == ListSelectionModel.SINGLE_INTERVAL_SELECTION ||
                        selectionMode == ListSelectionModel.MULTIPLE_INTERVAL_SELECTION) {
                    int rowIndexStart = table.getSelectedRow();
                    int rowIndexEnd = table.getSelectionModel().getMaxSelectionIndex();
                    int colIndexStart = table.getSelectedColumn();
                    int colIndexEnd = table.getColumnModel().getSelectionModel().getMaxSelectionIndex();

                    for (int i = rowIndexStart; i <= rowIndexEnd; i++) {
                        for (int j = colIndexStart; j <= colIndexEnd; j++) {
                            if (table.isCellSelected(i, j)) {
                                System.out.printf("Selected [Row,Column] = [%d,%d]\n", i, j);
                            }
                        }
                    }
                }
            }
        }
    }
}