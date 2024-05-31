/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class modeltabeldata extends AbstractTableModel{
    List<data> dp;
    public modeltabeldata(List<data>dp){
        this.dp = dp;
    }
    
    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Name";
            case 1:
                return "Path";
            case 2:
                return "Writing";
            case 3:
                return "Coding";
            case 4:
                return "Interview";
            case 5:
                return "Score";
            case 6:
                return "Status";
            default:
                return null;
        }
    }
    
     @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dp.get(row). getName();
            case 1:
                return dp.get(row).getPath();
            case 2:
                return dp.get(row).getWriting();
            case 3:
                return dp.get(row).getCoding();
            case 4:
                return dp.get(row).getInterview();
            case 5:
                return dp.get(row).getScore();
            case 6:
                return dp.get(row).getStatus();
            default:
                return null;
        }
    }
    
}
