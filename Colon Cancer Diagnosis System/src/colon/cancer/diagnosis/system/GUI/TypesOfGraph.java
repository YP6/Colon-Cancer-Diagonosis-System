
package colon.cancer.diagnosis.system.GUI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;


public class TypesOfGraph extends JPanel{
    
     public TypesOfGraph(double Accuracy ,String name1 , String name2 , String Title)
    {
        PieDataset DataSet = CreateDataSet(Accuracy , name1 , name2);
        JFreeChart chart = CreateChart(DataSet , Title);
        ChartPanel chartpanel = new ChartPanel(chart); 
        chartpanel.setPreferredSize(new Dimension(500,300));
        add(chartpanel);
    }
     
    
    private PieDataset CreateDataSet(double Accuracy , String name1 , String name2)
    {
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue(name1, Accuracy);
        result.setValue(name2, 100 - Accuracy);
        return result;
    }
    private JFreeChart CreateChart(PieDataset Dataset , String ChartTitle)
    {
        JFreeChart chart = ChartFactory.createPieChart3D(ChartTitle, Dataset, true, true , false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        //plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        
        
       
        return chart;
    }
    
    public void BarGraph(int normalNum , int abNormalNum)
    {
         DefaultCategoryDataset barGraph = new DefaultCategoryDataset();
         barGraph.setValue(normalNum, "", "Normal");
         barGraph.setValue(abNormalNum, "", "Abnormal");
         JFreeChart barchart = ChartFactory.createBarChart("Condtions", "Normal and AbNormal", "Number", barGraph, PlotOrientation.VERTICAL, true, true, true);
         CategoryPlot plot = barchart.getCategoryPlot();
         plot.setRangeGridlinePaint(Color.BLACK);
         ChartPanel barpanel = new ChartPanel(barchart);
         barpanel.setPreferredSize(new Dimension(500,300));
         add(barpanel);
        
    }
}
