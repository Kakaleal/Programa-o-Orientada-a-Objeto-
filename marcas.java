package MapaMarcas;
import java.util.HashMap;
import java.util.Map;
public class marcas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> carros = new HashMap<String, String>();
		
		carros.put("astra", " chevrolet");
		carros.put("rav4 ", " toyota");
		carros.put("Ford", "Ka");
		carros.put("porsche ", " cayenne");
		
		for(String s : carros.keySet()) {
			System.out.println(s);
		}
		
		for(Map.Entry<String, String> entrada : carros.entrySet()) {
			System.out.println(entrada);
		}

	}

}


