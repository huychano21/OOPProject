
package c500.register.controller;

import c500.register.utils.ExcelWriter;
import c500.register.view.ChartView;
import c500.register.view.OptionView;
import c500.register.view.StatisticsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC
 */
public class StatisticsController {
    private StatisticsView statisticsView;
    private OptionView optionView;
    private ExcelWriter excelWriter = new ExcelWriter();
    private ChartView chartView;
    
    public StatisticsController(StatisticsView statisticsView) {
        this.statisticsView = statisticsView;
        
        statisticsView.addReturnListener(new StatisticsController.ReturnListener());
        statisticsView.addPrintListStudentListener(new StatisticsController.PrintListStudentListener());
        statisticsView.addPrintListSubjectListener(new StatisticsController.PrintListSubjectListener());
    }
    
    public void showStatisticsView() {
       statisticsView.setVisible(true);
    }
    
    class ReturnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            optionView = new OptionView();
            OptionController optionController = new OptionController(optionView);
            optionController.showOptionView();
            statisticsView.setVisible(false);
        }
    }
    
    class PrintListStudentListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            excelWriter.ExcelWriterStudent();
            excelWriter.openFile("Student.xlsx");
        }
    }
    
    class PrintListSubjectListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            excelWriter.ExcelWriterSubject();
            excelWriter.openFile("Subject.xlsx");
        }
    }
}
