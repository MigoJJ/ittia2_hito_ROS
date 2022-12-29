package laout;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class JCheckBoxJTableTest extends JFrame {
   private JTable table;
   private DefaultTableModel model;
   public JCheckBoxJTableTest() {
      Random rnd = new Random();
      model = new DefaultTableModel(new Object[]{"Check Box1","Check Box2", "Check Box3"}, 1) {
         @Override
         public Class getColumnClass(int columnIndex) {
            return Boolean.class;
         }
      };
      for (int index = 0; index < 20; index++) {
         model.addRow(new Object[]{rnd.nextBoolean()});
      }
      table = new JTable(model);
      add(new JScrollPane(table));
      setTitle("JCheckBoxJTable Test");
      setSize(600, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new JCheckBoxJTableTest();
   }
}