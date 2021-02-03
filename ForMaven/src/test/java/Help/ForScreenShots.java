package Help;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ForScreenShots {

	ConfigPropertyReader configpropertyreader=new ConfigPropertyReader();
    Document document;
    PdfWriter writer;
    byte[] input;
    TakesScreenshot ts;
//    ConfigPropertyReader configpropertyreader=new ConfigPropertyReader();
	
	public void ForScreenShots_ScreenshotpdfStart() {
        try{
            document= new Document();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
            LocalDateTime now = LocalDateTime.now();
            String currentdatetime=dtf.format(now);

//            String output = "E:\\Chinnan\\Automation_Importent\\Screenshots\\" + "Report" + currentdatetime + ".pdf";
            
	        configpropertyreader.cofigInitialiser();
	        String sspath=configpropertyreader.getConfigValue("screenshotpath");
            String output= sspath + "Report" + currentdatetime + ".pdf";
            
            FileOutputStream fos = new FileOutputStream(output);

            // Instantiate the PDF writer
            writer = PdfWriter.getInstance(document, fos);

            // open the pdf for writing
            writer.open();
            document.open();
        }
        catch(Exception e){
            System.out.println("Issue is from ForScreenShots_ScreenshotpdfStart() function" + e.toString());
        }

    }
	
	public void Screenshotpdf(String comment) {
        try{
            ts=(TakesScreenshot)Common.driver;
            input=ts.getScreenshotAs(OutputType.BYTES);

            // process content into image
            Image im = Image.getInstance(input);


            //set the size of the image
            im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);

            // add the captured image to PDF
            document.add(new Paragraph(comment));
            document.add(im);


            document.add(new Paragraph(" "));

            //close the files and write to local system

        }
        catch(Exception e){
            System.out.println("Issue is from ForScreenShots_Screenshotpdf() function" + e.toString());
        }

    }
	
	 public void ScreenshotpdfClose() {
	        try{
	            document.close();
	            writer.close();
	        }
	        catch(Exception e){
	            System.out.println("Issue is from ForScreenShots_ScreenshotpdfClose() function" + e.toString());
	        }
	    }
}
