/**
 * Copyright 2008 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * This file is part of MARY TTS.
 *
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

/*
 * DrawHistogram.java
 *
 * Created on 23 July, 2008, 3:42 PM
 */

package marytts.tools.analysis;

import gov.noaa.pmel.sgt.dm.SGTData;
import gov.noaa.pmel.sgt.dm.SGTMetaData;
import gov.noaa.pmel.sgt.dm.SimpleLine;
import gov.noaa.pmel.sgt.swing.JPlotLayout;

import java.text.DecimalFormat;

import marytts.util.math.Histogram;

/**
 *
 * @author  sathish
 */
public class DrawHistogram extends javax.swing.JFrame {
    
    public JPlotLayout layout_;
    public Histogram histData;
    
    /** Creates new form DarwHistogram */
    public DrawHistogram(double[] data){
        initComponents();
        this.setHistogramData(data, 25);
        this.drawFirstHistogram(25);
    }
    
    public DrawHistogram(double[] data, int nbins){
        initComponents();
        this.setHistogramData(data, nbins);
        this.drawFirstHistogram(nbins);
    }
   
    
    private void drawFirstHistogram(int nbins){
        try{
            DecimalFormat df = new DecimalFormat(" ##0.0000;-##0.0000");
            layout_ = new JPlotLayout(false, false, false,
                                  "Trajectory data",
                                  null,
                                  false);
            layout_ = this.plotHistogram(layout_);
            this.getHistogram().resize(histogram.size());
            bandwidth.setValue(nbins);
            histogram.add(this.getHistogram());
            histogram.updateUI();
            jLabel4.setText(""+df.format(histData.mean()));
            jLabel6.setText(""+df.format(histData.variance()));
            jLabel8.setText(""+df.format(histData.stdDev()));
            System.out.println("Mean: "+histData.mean());
            System.out.println("Variance: "+histData.variance());
            System.out.println("Max: "+histData.max());
            System.out.println("Min: "+histData.min());
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        histogram = new javax.swing.JPanel();
        controls = new javax.swing.JPanel();
        bandwidth = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.layout.GroupLayout histogramLayout = new org.jdesktop.layout.GroupLayout(histogram);
        histogram.setLayout(histogramLayout);
        histogramLayout.setHorizontalGroup(
            histogramLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 646, Short.MAX_VALUE)
        );
        histogramLayout.setVerticalGroup(
            histogramLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 451, Short.MAX_VALUE)
        );

        bandwidth.setMaximum(200);
        bandwidth.setMinimum(5);
        bandwidth.setValue(25);
        bandwidth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changeBandWidth(evt);
            }
        });

        jLabel1.setText("No. of Bins  :");

        jLabel2.setText("25");

        jLabel3.setText("Mean   :");

        jLabel4.setText("0");

        jLabel5.setText("Variance   :");

        jLabel6.setText("0");

        jLabel7.setText("Std. Dev.   :");

        jLabel8.setText("0");

        org.jdesktop.layout.GroupLayout controlsLayout = new org.jdesktop.layout.GroupLayout(controls);
        controls.setLayout(controlsLayout);
        controlsLayout.setHorizontalGroup(
            controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(controlsLayout.createSequentialGroup()
                .add(12, 12, 12)
                .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel7)
                    .add(controlsLayout.createSequentialGroup()
                        .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(controlsLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(bandwidth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 278, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(controlsLayout.createSequentialGroup()
                                .add(96, 96, 96)
                                .add(jLabel1)
                                .add(14, 14, 14)
                                .add(jLabel2)))
                        .add(114, 114, 114)
                        .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel3)
                            .add(jLabel5))))
                .add(18, 18, 18)
                .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(jLabel6)
                    .add(jLabel8))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        controlsLayout.setVerticalGroup(
            controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(controlsLayout.createSequentialGroup()
                .add(31, 31, 31)
                .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(controlsLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(jLabel4)))
                    .add(controlsLayout.createSequentialGroup()
                        .add(bandwidth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(jLabel1)
                            .add(jLabel5)
                            .add(jLabel6))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(controlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jLabel8))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, controls, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(histogram, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(histogram, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(controls, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeBandWidth(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changeBandWidth
// TODO add your handling code here:
     try{
        int bwSlide = bandwidth.getValue();
        this.jLabel2.setText(Integer.toString(bwSlide));
        this.rePlotHistogram(bwSlide);
        this.getHistogram().resize(histogram.size());
        histogram.add(this.getHistogram());
        histogram.updateUI();
     }
     catch(Exception e){
        System.err.println("Exception: "+e);
        e.printStackTrace();
     } 
        
    }//GEN-LAST:event_changeBandWidth
    
    
      
 public void setHistogramData(double[] data, int nbins){
     this.histData = new Histogram(data, nbins);
 }
 
        
  public JPlotLayout plotHistogram(JPlotLayout layout){
        
        //layout = this.plotHistogram(layout_);
        /*
         * Batch changes to layout.
         */
        layout.setBatch(true);
        layout.setTitles("Hitogram Analysis",
                "",
                "");
        layout.setTitleHeightP(0.2, 0.2);
        //pack();
        SimpleLine sdata = new SimpleLine(histData.getSampleArray(), 
                histData.getHistArray()," Float " + "Hist1");
        SGTMetaData meta = new SGTMetaData("Values",
                "data",
                false,
                false);
        sdata.setXMetaData(meta);
        meta = new SGTMetaData("Histogram",
                "no. of occurrences",
                false,
                false);
        sdata.setYMetaData(meta);
        SGTData data = sdata;
        layout.addData(data);
        layout.setBatch(false);  
        return layout;
    }
    
    public void rePlotHistogram(int bandwidth){
        this.clearHistogram();
        histData.changeSettings(bandwidth);
        layout_ = this.plotHistogram(layout_);
    }
    
    public void clearHistogram(){
        layout_.clear();
    }
    
    public JPlotLayout getHistogram(){
        
        return layout_;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider bandwidth;
    private javax.swing.JPanel controls;
    private javax.swing.JPanel histogram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
    
}
