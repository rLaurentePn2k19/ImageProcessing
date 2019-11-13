package imageprocess;



import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;


public class ImageProcess {

   BufferedImage  image;
   int width;
   int height;
   
   public ImageProcess() {
   
      try {
         File input = new File("C:\\Users\\laurentera_sd2022\\Pictures\\flower.jpg");
         image = ImageIO.read(input);
         width = image.getWidth();
         height = image.getHeight();
         
         for(int i=0; i<height; i++) {
         
            for(int j=0; j<width; j++) {
            
               Color c = new Color(image.getRGB(j, i));
               int red = (int)(c.getRed() * 0.299);
               int green = (int)(c.getGreen() * 0.587);
               int blue = (int)(c.getBlue() *0.114);
//               Color newColor = new Color(red+green+blue,
//               
//               red+green+blue,red+green+blue);
               Color newColor = new Color(0,0,0);
               
               image.setRGB(j,i,newColor.getRGB());
            }
         }
         
         File ouptut = new File("C:\\Users\\laurentera_sd2022\\Pictures\\Output.png");
         ImageIO.write(image, "png", ouptut);
         
      } catch (Exception e) {}
   }
   
   static public void main(String args[]) throws Exception {
      ImageProcess obj = new ImageProcess();
   }
}