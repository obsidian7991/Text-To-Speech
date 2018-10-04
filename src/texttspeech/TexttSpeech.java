package texttspeech;

import java.io.File;
import java.io.FileNotFoundException;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

public class TexttSpeech {
	
	public static void main(String[] args) {
		TextToSpeech synthesizer = new TextToSpeech();

         String translation = “今日は良い天気ですね。”;



		   synthesizer.setUsernameAndPassword("1618006", "1618006");

}

private static void writeToFile(InputStream in, File file) {

   try {

     OutputStream out = new FileOutputStream(file);

     byte[] buf = new byte[1024];

     int len;

     while ((len = in.read(buf)) > 0) {

       out.write(buf, 0, len);

     }

     out.close();

     in.close();

   } catch (Exception e) {

     e.printStackTrace();

   }

 }





}
