import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.imageio.ImageIO;

public class DownloadImagens {
	
	public void download(String numero) {
		
		Image image = null;
		try {
		    URL url = new URL("http://www.yahoo.com/image_to_read.jpg");
		    image = ImageIO.read(url);
		} catch (IOException e) {
			
			
		}
		
	}
	

	public static void main(String[] args) throws Exception {
		String imageUrl = "http://www.mundodescargas.com/servicios/fondos_de_pantalla/coches/imagenes/wallpapers-coches-025.jpg";
		String destinationFile = "C:\\android\\x1934.png";
		
		download(imageUrl, destinationFile);
	}

	public static void download(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;
		System.out.println("Baixando... item de numero"+1933);
		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}
		
		is.close();
		os.close();
		System.out.println("Baixado!!");
		
	}

}

