package lgs_comm;

import laout.JTGSCells;

public class GetRowNoAt extends JTGSCells{
	public static void getIndexRow(int row){
		int column = 0;
		for (int i = 0; i < 8; i++) {
			String rcgetCellValue = (String) table.getModel().getValueAt(row, i);
			System.out.println("> "+ rcgetCellValue);
        }
	}
}