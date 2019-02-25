/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chart;
import javax.swing.JPanel;
import org.jfree.ui.ApplicationFrame;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author HP
 */
public class PieChart extends ApplicationFrame {
    
    public PieChart( String title ) {
      super(title); 
      //setContentPane(createDemoPanel());
   }
    
    public JFreeChart createChart(String str,PieDataset dataset) {
      JFreeChart chart = ChartFactory.createPieChart(      
         str,   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);
      return chart;
   }
    
   public PieDataset createDataset(double hCount,double lCount,double kCount,double eCount) {
      DefaultPieDataset dataset = new DefaultPieDataset();
      dataset.setValue("Heart" , hCount);  
      dataset.setValue("Liver" , lCount);   
      dataset.setValue("Kidney" , kCount);    
      dataset.setValue("Eyes" , eCount);  
      return dataset;         
  }
   
   public PieDataset createDiseaseDataset(double diabetic,double hTension,double smoke, double drink, double asthama,double epilepsy, double heartdisease, double stroke, double std,double hepatitis, double HIV){
      DefaultPieDataset dataset = new DefaultPieDataset();
      dataset.setValue("Diabetic", diabetic);
      dataset.setValue("HyperTension", hTension);
      dataset.setValue("Smoking", smoke);
      dataset.setValue("Drinking", drink);
      dataset.setValue("Asthama", asthama);
      dataset.setValue("Epilepsy", epilepsy);
      dataset.setValue("HeartDisease", heartdisease);
      dataset.setValue("Stroke", stroke);
      dataset.setValue("STD", std);
      dataset.setValue("Hepatitis", hepatitis);
      dataset.setValue("HIV", HIV);
      return dataset; 
   }
//  public JPanel createDemoPanel() {
//      JFreeChart chart = createChart(createDataset());  
//      return new ChartPanel(chart); 
//   }
}
