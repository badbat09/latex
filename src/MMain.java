import java.io.IOException;

public class MMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process p;
		try {
		    p = Runtime.getRuntime().exec("C:\\Program Files\\MiKTeX 2.9\\miktex\\bin\\x64\\pdflatex.exe -synctex=1 -interaction=nonstopmode  -output-directory C:\\Users\\batuhan\\eclipse-workspace\\Latex\\hier C:\\Users\\batuhan\\eclipse-workspace\\Latex\\src\\document.tex ");
		    p.waitFor();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	}

}
