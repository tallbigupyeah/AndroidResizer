/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package androidresizer;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.text.DefaultCaret;
import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;

/**
 *
 * @author planys
 */
public class AResizerFrame extends javax.swing.JFrame {
private File originalDirectory;
private File ldpiDirectory;
private File mdpiDirectory;
private File tvdpiDirectory;
private File hdpiDirectory;
private File xhdpiDirectory;
private File xxhdpiDirectory;
private File[] fileList;
private File[] imageList;
private String ext;
        /**
     * Creates new form NewJFrame
     */
    public AResizerFrame() {
        initComponents();
        try{
            java.net.URL url = ClassLoader.getSystemResource("androidresizer/ARIconSmall.png");
Toolkit kit = Toolkit.getDefaultToolkit();
Image img = kit.createImage(url);
this.setIconImage(img);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        OutputTxtArea.append("\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jOptionPane1 = new javax.swing.JOptionPane();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        ChooseLabel = new javax.swing.JLabel();
        FileField = new javax.swing.JTextField();
        BrowseButton = new javax.swing.JButton();
        GenerateButton = new javax.swing.JButton();
        chkLDPI = new javax.swing.JCheckBox();
        chkMDPI = new javax.swing.JCheckBox();
        chkTVDPI = new javax.swing.JCheckBox();
        chkHDPI = new javax.swing.JCheckBox();
        chkXHDPI = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputTxtArea = new javax.swing.JTextArea();
        GenerateProgressBar = new javax.swing.JProgressBar();
        jSeparator2 = new javax.swing.JSeparator();
        PrefixText = new javax.swing.JTextField();
        PrefixCheckbox = new javax.swing.JCheckBox();
        CopyXXHDPIChk = new javax.swing.JCheckBox();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Android Resizer - 1.2.1");
        setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        setResizable(false);

        TitleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Android Resizer");

        ChooseLabel.setText("Choose XXHDPI folder");

        FileField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FileField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileFieldActionPerformed(evt);
            }
        });

        BrowseButton.setText("Browse...");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        GenerateButton.setText("Generate");
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });

        chkLDPI.setSelected(true);
        chkLDPI.setText("LDPI");
        chkLDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLDPIActionPerformed(evt);
            }
        });

        chkMDPI.setSelected(true);
        chkMDPI.setText("MDPI");

        chkTVDPI.setText("TVDPI");
        chkTVDPI.setToolTipText("Disabled as the TVDPI scaling is buggy");
        chkTVDPI.setEnabled(false);

        chkHDPI.setSelected(true);
        chkHDPI.setText("HDPI");

        chkXHDPI.setSelected(true);
        chkXHDPI.setText("XHDPI");

        OutputTxtArea.setEditable(false);
        OutputTxtArea.setColumns(20);
        OutputTxtArea.setRows(5);
        OutputTxtArea.setText("Android Resizer\nv1.2.1\nCreated by Craig Currie\nArtwork by Jan Putzan");
        jScrollPane1.setViewportView(OutputTxtArea);

        GenerateProgressBar.setToolTipText("");

        PrefixText.setText("drawable-");
        PrefixText.setToolTipText("This will determine what folders the downscaled images will create or be moved into. (Default is drawable-)");
        PrefixText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PrefixText.setEnabled(false);
        PrefixText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrefixTextActionPerformed(evt);
            }
        });

        PrefixCheckbox.setText("Change default prefix?");
        PrefixCheckbox.setToolTipText("This will determine what folders the downscaled images will create or be moved into. (Default is drawable-)");
        PrefixCheckbox.setActionCommand("PrefixCheck");
        PrefixCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrefixCheckboxActionPerformed(evt);
            }
        });

        CopyXXHDPIChk.setText("Copy XXHDPI with prefix?");
        CopyXXHDPIChk.setToolTipText("Select this to copy the source folder with the custom prefix");
        CopyXXHDPIChk.setActionCommand("PrefixCheck");
        CopyXXHDPIChk.setEnabled(false);
        CopyXXHDPIChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyXXHDPIChkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GenerateProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FileField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CopyXXHDPIChk)
                                    .addComponent(PrefixCheckbox)
                                    .addComponent(PrefixText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(BrowseButton))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ChooseLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkTVDPI)
                                            .addComponent(chkLDPI))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkMDPI)
                                            .addComponent(chkHDPI)))
                                    .addComponent(chkXHDPI)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(GenerateButton)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChooseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrowseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrefixCheckbox)
                .addGap(4, 4, 4)
                .addComponent(CopyXXHDPIChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrefixText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkLDPI)
                    .addComponent(chkMDPI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTVDPI)
                    .addComponent(chkHDPI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkXHDPI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenerateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenerateProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
//    new FolderChooser().setVisible(true);  
        
JFileChooser chooser = new JFileChooser();
chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
chooser.showOpenDialog(null);
//chooser.
originalDirectory = chooser.getSelectedFile();
String directoryName = originalDirectory.getAbsolutePath();

FileField.setText(directoryName);
// TODO add your handling code here:
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
if(originalDirectory != null){
    GenerateButton.setEnabled(false);
    chkHDPI.setEnabled(false);
    chkXHDPI.setEnabled(false);
    chkLDPI.setEnabled(false);
    chkMDPI.setEnabled(false);
    chkTVDPI.setEnabled(false);
    BrowseButton.setEnabled(false);
    PrefixCheckbox.setEnabled(false);
    CopyXXHDPIChk.setEnabled(false);
    PrefixText.setEnabled(false);
    FileField.setEnabled(false);
    
    OutputTxtArea.setText("");
    OutputTxtArea.append("Processing Images...\n");
  fileList = originalDirectory.listFiles();
  
    int i;
        
//  for(i=0; i<fileList.length; i++){
//      System.out.println(fileList[i].getName());
////      if(fileList[i].isFile()){
////          if(!fileList[i].isHidden()){
////              try{
////                  
////              imageList[imageList.length] = new File(fileList[i].getAbsolutePath());
////              }catch(NullPointerException e){
////              imageList[0] = new File(fileList[i].getAbsolutePath());
////              }
////          }
////      }
//  }
//  for(i=0; i<imageList.length; i++){
//      System.out.println(imageList[i].getName());
//  }
//    try {
    Thread one = new Thread() {
        @Override
        public void run() {
            
            try {
                processImages();
            } catch (IOException ex) {
                Logger.getLogger(AResizerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    };

one.start();



//        fileList[0];
//  originalDirectory.listFiles();
//    } catch (IOException ex) {
//        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//    }
}else{
     OutputTxtArea.append("Directory doesn't exist!\n");
}
    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void PrefixTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrefixTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrefixTextActionPerformed

    private void PrefixCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrefixCheckboxActionPerformed
        // TODO add your handling code here:
        if(PrefixCheckbox.isSelected()){
            PrefixText.setEnabled(true);
            CopyXXHDPIChk.setEnabled(true);
        }else{
            PrefixText.setEnabled(false);
            PrefixText.setText("drawable-");
            CopyXXHDPIChk.setSelected(false);
            CopyXXHDPIChk.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_PrefixCheckboxActionPerformed

    private void chkLDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLDPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLDPIActionPerformed

    private void CopyXXHDPIChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyXXHDPIChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CopyXXHDPIChkActionPerformed

    private void FileFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileFieldActionPerformed
   
    
    
    
    
    public void processImages() throws IOException{
        
        
        DefaultCaret caret = (DefaultCaret) OutputTxtArea.getCaret();
caret.setUpdatePolicy(ALWAYS_UPDATE);

        if(CopyXXHDPIChk.isSelected()){
            
        xxhdpiDirectory = new File(originalDirectory.getParent()+"/" + PrefixText.getText() + "xxhdpi");
        if(!xxhdpiDirectory.exists()){
            xxhdpiDirectory.mkdir();
             OutputTxtArea.append("Creating " + PrefixText.getText() + "xxhdpi\n");
        }else{
            OutputTxtArea.append(PrefixText.getText() + "xxhdpi already exists, copying assets into this folder\n");
        }
        int i;
       GenerateProgressBar.setMaximum(fileList.length);
        for(i=0; i<fileList.length; i++){
            GenerateProgressBar.setValue(i);
            System.out.println(fileList[i].getName());
             OutputTxtArea.append("Processing XXHDPI - "+ i + " of " + fileList.length + "\n");
            String fileName = fileList[i].getName();
            if(fileName.contains(".png")||fileName.contains(".gif")||fileName.contains(".jpg")){
                ext = fileName.substring(fileName.length()-3);
                System.out.println(ext);
                BufferedImage img = ImageIO.read(fileList[i]);
                float scaleX = (float) (img.getWidth());
//                scaleX = (float) (scaleX / 4);
//                scaleX = (float) (scaleX * 3);
float scaleY = (float) (img.getHeight());
// scaleY = (float) (scaleY / 4);
//                scaleY = (float) (scaleY * 3);
                
                int finalScaleX = (int)scaleX;
                int finalScaleY = (int)scaleY;
System.out.println("Image: " + fileName + "| Height: " + finalScaleY + "| Width: " + finalScaleX);

if(finalScaleX == 0){
    finalScaleX = 1;
}
if(finalScaleY == 0){
    finalScaleY = 1;
}





Image newImg = img.getScaledInstance(finalScaleX, finalScaleY, Image.SCALE_SMOOTH);

BufferedImage bImage;
if(img.getColorModel().toString().contains("has alpha = false")){
    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_RGB);

}else{
    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_ARGB);

}


Graphics2D bImageGraphics = bImage.createGraphics();


bImageGraphics.drawImage(newImg, null, null);


RenderedImage rImage = (RenderedImage)bImage;


File outputfile = new File(xxhdpiDirectory + "/" + fileName);
//    ImageIO.write((RenderedImage) newImg, "png", outputfile);
//for (Picture pic : allPictures){
//    File newFilePic = new File(fileName);
    ImageIO.write(rImage, ext, outputfile);
    
//    pic.writeImageContent(new DataOutputStream(new FileOutputStream(newFilePic)));
//    FileUtils.copyFileToDirectory(newFilePic, new File(tmpDir.toString()));
//    FileUtils.forceDelete(newFilePic);
//}
            }
        }
        GenerateProgressBar.setValue(0);
         OutputTxtArea.append("XXHDPI complete\n");
        }


        if(chkLDPI.isSelected()){
            GenerateProgressBar.setString("TEST");
        ldpiDirectory = new File(originalDirectory.getParent()+"/" + PrefixText.getText() + "ldpi");
        if(!ldpiDirectory.exists()){
            ldpiDirectory.mkdir();
             OutputTxtArea.append("Creating " + PrefixText.getText() + "ldpi\n");
        }else{
            OutputTxtArea.append(PrefixText.getText() + "ldpi already exists, copying assets into this folder\n");
        }
        int i;
       GenerateProgressBar.setMaximum(fileList.length);
        for(i=0; i<fileList.length; i++){
            GenerateProgressBar.setValue(i);
            System.out.println(fileList[i].getName());
             OutputTxtArea.append("Processing LDPI - "+ i + " of " + fileList.length + "\n");
            String fileName = fileList[i].getName();
            if(fileName.contains(".png")||fileName.contains(".gif")||fileName.contains(".jpg")){
                ext = fileName.substring(fileName.length()-3);
                System.out.println(ext);
                BufferedImage img = ImageIO.read(fileList[i]);
                float scaleX = (float) (img.getWidth() / 4);
//                scaleX = (float) (scaleX / 4);
//                scaleX = (float) (scaleX * 3);
float scaleY = (float) (img.getHeight() / 4);
// scaleY = (float) (scaleY / 4);
//                scaleY = (float) (scaleY * 3);
                
                int finalScaleX = (int)scaleX;
                int finalScaleY = (int)scaleY;
System.out.println("Image: " + fileName + "| Height: " + finalScaleY + "| Width: " + finalScaleX);

if(finalScaleX == 0){
    finalScaleX = 1;
}
if(finalScaleY == 0){
    finalScaleY = 1;
}

Image newImg = img.getScaledInstance(finalScaleX, finalScaleY, Image.SCALE_SMOOTH);

BufferedImage bImage;
if(img.getColorModel().toString().contains("has alpha = false")){
    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_RGB);

}else{
    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_ARGB);

}



Graphics2D bImageGraphics = bImage.createGraphics();


bImageGraphics.drawImage(newImg, null, null);


RenderedImage rImage = (RenderedImage)bImage;


File outputfile = new File(ldpiDirectory + "/" + fileName);
//    ImageIO.write((RenderedImage) newImg, "png", outputfile);
//for (Picture pic : allPictures){
//    File newFilePic = new File(fileName);
    ImageIO.write(rImage, ext, outputfile);
    
//    pic.writeImageContent(new DataOutputStream(new FileOutputStream(newFilePic)));
//    FileUtils.copyFileToDirectory(newFilePic, new File(tmpDir.toString()));
//    FileUtils.forceDelete(newFilePic);
//}
            }
        }
        GenerateProgressBar.setValue(0);
         OutputTxtArea.append("LDPI complete\n");
        }
        if(chkMDPI.isSelected()){
        mdpiDirectory = new File(originalDirectory.getParent()+"/" + PrefixText.getText() + "mdpi");
        if(!mdpiDirectory.exists()){
            mdpiDirectory.mkdir();
            OutputTxtArea.append("Creating " + PrefixText.getText() + "mdpi\n");
        }else{
            OutputTxtArea.append(PrefixText.getText() + "mdpi already exists, copying assets into this folder\n");
        }
        int i;
        GenerateProgressBar.setMaximum(fileList.length);
        for(i=0; i<fileList.length; i++){
            GenerateProgressBar.setValue(i);
            OutputTxtArea.append("Processing MDPI - "+ i + " of " + fileList.length + "\n");
            System.out.println(fileList[i].getName());
            String fileName = fileList[i].getName();
            if(fileName.contains(".png")||fileName.contains(".gif")||fileName.contains(".jpg")){
                ext = fileName.substring(fileName.length()-3);
                System.out.println(ext);
                BufferedImage img = ImageIO.read(fileList[i]);
                float scaleX = (float) (img.getWidth() / 3);
//                scaleX = (float) (scaleX / 4);
//                scaleX = (float) (scaleX * 3);
float scaleY = (float) (img.getHeight() / 3);
// scaleY = (float) (scaleY / 4);
//                scaleY = (float) (scaleY * 3);
                
                int finalScaleX = (int)scaleX;
                int finalScaleY = (int)scaleY;
System.out.println("Image: " + fileName + "| Height: " + finalScaleY + "| Width: " + finalScaleX);
Image newImg = img.getScaledInstance(finalScaleX, finalScaleY, Image.SCALE_SMOOTH);


BufferedImage bImage;if(img.getColorModel().toString().contains("has alpha = false")){    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_RGB);}else{    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_ARGB);}


Graphics2D bImageGraphics = bImage.createGraphics();


bImageGraphics.drawImage(newImg, null, null);


RenderedImage rImage = (RenderedImage)bImage;


File outputfile = new File(mdpiDirectory + "/" + fileName);
//    ImageIO.write((RenderedImage) newImg, "png", outputfile);
//for (Picture pic : allPictures){
//    File newFilePic = new File(fileName);
    ImageIO.write(rImage, ext, outputfile);
    
//    pic.writeImageContent(new DataOutputStream(new FileOutputStream(newFilePic)));
//    FileUtils.copyFileToDirectory(newFilePic, new File(tmpDir.toString()));
//    FileUtils.forceDelete(newFilePic);
//}
            }
        }
        GenerateProgressBar.setValue(0);
        OutputTxtArea.append("MDPI complete\n");
        }
        if(chkTVDPI.isSelected()){
        tvdpiDirectory = new File(originalDirectory.getParent()+"/" + PrefixText.getText() + "tvdpi");
        if(!tvdpiDirectory.exists()){
            OutputTxtArea.append("Creating " + PrefixText.getText() + "tvdpi\n");
            tvdpiDirectory.mkdir();
        }else{
            OutputTxtArea.append(PrefixText.getText() + "tvdpi already exists, copying assets into this folder\n");
        }
        int i;
        
      GenerateProgressBar.setMaximum(fileList.length);
        for(i=0; i<fileList.length; i++){
            GenerateProgressBar.setValue(i);
            OutputTxtArea.append("Processing TVDPI - "+ i + " of " + fileList.length + "\n");
            System.out.println(fileList[i].getName());
            String fileName = fileList[i].getName();
            if(fileName.contains(".png")||fileName.contains(".gif")||fileName.contains(".jpg")){
                ext = fileName.substring(fileName.length()-3);
                System.out.println(ext);
                BufferedImage img = ImageIO.read(fileList[i]);
                float scaleX = (float) (img.getWidth() / 2.3);
//                scaleX = (float) (scaleX / 4);
//                scaleX = (float) (scaleX * 3);
float scaleY = (float) (img.getHeight() / 2.3);
// scaleY = (float) (scaleY / 4);
//                scaleY = (float) (scaleY * 3);
                
                int finalScaleX = (int)scaleX;
                int finalScaleY = (int)scaleY;
System.out.println("Image: " + fileName + "| Height: " + finalScaleY + "| Width: " + finalScaleX);
Image newImg = img.getScaledInstance(finalScaleX, finalScaleY, Image.SCALE_SMOOTH);


BufferedImage bImage;if(img.getColorModel().toString().contains("has alpha = false")){    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_RGB);}else{    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_ARGB);}


Graphics2D bImageGraphics = bImage.createGraphics();


bImageGraphics.drawImage(newImg, null, null);


RenderedImage rImage = (RenderedImage)bImage;


File outputfile = new File(tvdpiDirectory + "/" + fileName);
//    ImageIO.write((RenderedImage) newImg, "png", outputfile);
//for (Picture pic : allPictures){
//    File newFilePic = new File(fileName);
    ImageIO.write(rImage, ext, outputfile);
    
//    pic.writeImageContent(new DataOutputStream(new FileOutputStream(newFilePic)));
//    FileUtils.copyFileToDirectory(newFilePic, new File(tmpDir.toString()));
//    FileUtils.forceDelete(newFilePic);
//}
            }
        }
        GenerateProgressBar.setValue(0);
        OutputTxtArea.append("TVDPI complete\n");
        }
        if(chkHDPI.isSelected()){
        hdpiDirectory = new File(originalDirectory.getParent()+"/" + PrefixText.getText() + "hdpi");
        if(!hdpiDirectory.exists()){
            OutputTxtArea.append("Creating " + PrefixText.getText() + "hdpi\n");
            hdpiDirectory.mkdir();
        }else{
            OutputTxtArea.append(PrefixText.getText() + "hdpi already exists, copying assets into this folder\n");
        }
        int i;
        GenerateProgressBar.setMaximum(fileList.length);
        for(i=0; i<fileList.length; i++){
            GenerateProgressBar.setValue(i);
            OutputTxtArea.append("Processing HDPI - "+ i + " of " + fileList.length + "\n");
            System.out.println(fileList[i].getName());
            String fileName = fileList[i].getName();
            if(fileName.contains(".png")||fileName.contains(".gif")||fileName.contains(".jpg")){
                ext = fileName.substring(fileName.length()-3);
                System.out.println(ext);
                BufferedImage img = ImageIO.read(fileList[i]);
                float scaleX = (float) (img.getWidth() / 2);
//                scaleX = (float) (scaleX / 4);
//                scaleX = (float) (scaleX * 3);
float scaleY = (float) (img.getHeight() / 2);
// scaleY = (float) (scaleY / 4);
//                scaleY = (float) (scaleY * 3);
                
                int finalScaleX = (int)scaleX;
                int finalScaleY = (int)scaleY;
System.out.println("Image: " + fileName + "| Height: " + finalScaleY + "| Width: " + finalScaleX);
Image newImg = img.getScaledInstance(finalScaleX, finalScaleY, Image.SCALE_SMOOTH);


BufferedImage bImage;if(img.getColorModel().toString().contains("has alpha = false")){    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_RGB);}else{    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_ARGB);}


Graphics2D bImageGraphics = bImage.createGraphics();


bImageGraphics.drawImage(newImg, null, null);


RenderedImage rImage = (RenderedImage)bImage;


File outputfile = new File(hdpiDirectory + "/" + fileName);
//    ImageIO.write((RenderedImage) newImg, "png", outputfile);
//for (Picture pic : allPictures){
//    File newFilePic = new File(fileName);
    ImageIO.write(rImage, ext, outputfile);
    
//    pic.writeImageContent(new DataOutputStream(new FileOutputStream(newFilePic)));
//    FileUtils.copyFileToDirectory(newFilePic, new File(tmpDir.toString()));
//    FileUtils.forceDelete(newFilePic);
//}
            }
        }
        GenerateProgressBar.setValue(0);
        OutputTxtArea.append("HDPI Complete\n");
        }
        if(chkXHDPI.isSelected()){
        xhdpiDirectory = new File(originalDirectory.getParent()+"/" + PrefixText.getText() + "xhdpi");
        if(!xhdpiDirectory.exists()){
            OutputTxtArea.append("Creating " + PrefixText.getText() + "xhdpi\n");
            xhdpiDirectory.mkdir();
        }else{
            OutputTxtArea.append(PrefixText.getText() + "xhdpi already exists, copying assets into this folder\n");
        }
        int i;
        GenerateProgressBar.setMaximum(fileList.length);
        for(i=0; i<fileList.length; i++){
            GenerateProgressBar.setValue(i);
            OutputTxtArea.append("Processing XHDPI - "+ i + " of " + fileList.length + "\n");
            System.out.println(fileList[i].getName());
            String fileName = fileList[i].getName();
            if(fileName.contains(".png")||fileName.contains(".gif")||fileName.contains(".jpg")){
                ext = fileName.substring(fileName.length()-3);
                System.out.println(ext);
                BufferedImage img = ImageIO.read(fileList[i]);
                float scaleX = (float) (img.getWidth() / 1.5);
//                scaleX = (float) (scaleX / 4);
//                scaleX = (float) (scaleX * 3);
float scaleY = (float) (img.getHeight() / 1.5);
// scaleY = (float) (scaleY / 4);
//                scaleY = (float) (scaleY * 3);
                
                int finalScaleX = (int)scaleX;
                int finalScaleY = (int)scaleY;
System.out.println("Image: " + fileName + "| Height: " + finalScaleY + "| Width: " + finalScaleX);
Image newImg = img.getScaledInstance(finalScaleX, finalScaleY, Image.SCALE_SMOOTH);


BufferedImage bImage;if(img.getColorModel().toString().contains("has alpha = false")){    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_RGB);}else{    bImage = new BufferedImage(newImg.getWidth(null), newImg.getHeight(null), BufferedImage.TYPE_INT_ARGB);}


Graphics2D bImageGraphics = bImage.createGraphics();


bImageGraphics.drawImage(newImg, null, null);


RenderedImage rImage = (RenderedImage)bImage;


File outputfile = new File(xhdpiDirectory + "/" + fileName);
//    ImageIO.write((RenderedImage) newImg, "png", outputfile);
//for (Picture pic : allPictures){
//    File newFilePic = new File(fileName);
    ImageIO.write(rImage, ext, outputfile);
    
//    pic.writeImageContent(new DataOutputStream(new FileOutputStream(newFilePic)));
//    FileUtils.copyFileToDirectory(newFilePic, new File(tmpDir.toString()));
//    FileUtils.forceDelete(newFilePic);
//}
            }
        }
        GenerateProgressBar.setValue(0);
        OutputTxtArea.append("XHDPI Complete\n");
        }
        
        OutputTxtArea.append("Re-sizing complete.");
        
        GenerateButton.setEnabled(true);
    chkHDPI.setEnabled(true);
    chkXHDPI.setEnabled(true);
    chkLDPI.setEnabled(true);
    chkMDPI.setEnabled(true);
//    chkTVDPI.setEnabled(true);
    BrowseButton.setEnabled(true);
    PrefixCheckbox.setEnabled(true);
    FileField.setEnabled(true);
    
    if(PrefixCheckbox.isSelected()){
        PrefixText.setEnabled(true);
        CopyXXHDPIChk.setEnabled(true);
    }
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AResizerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AResizerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AResizerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AResizerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AResizerFrame().setVisible(true);
            }
        });
    }
    
    public void test(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseButton;
    private javax.swing.JLabel ChooseLabel;
    public javax.swing.JCheckBox CopyXXHDPIChk;
    private javax.swing.JTextField FileField;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JProgressBar GenerateProgressBar;
    private javax.swing.JTextArea OutputTxtArea;
    public javax.swing.JCheckBox PrefixCheckbox;
    private javax.swing.JTextField PrefixText;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JCheckBox chkHDPI;
    private javax.swing.JCheckBox chkLDPI;
    private javax.swing.JCheckBox chkMDPI;
    private javax.swing.JCheckBox chkTVDPI;
    private javax.swing.JCheckBox chkXHDPI;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}