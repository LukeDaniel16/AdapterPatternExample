
public class Cliente_Saida_HDMI { // Classe Cliente 
	
	public static void main(String[] args) {
		Adaptee_VGA_Conector adaptee = new Adaptee_VGA_Conector();
		
		Target_HDMI_Compativel target1 = new Adapter_HDMI_Para_VGA(adaptee);
		
		Target_HDMI_Compativel target2 = new Target_HDMI_Compativel();
		
		// Usando a adaptação:
			target1.conectarHDMI();
			
		// Usando nosso alvo padrão:
			
			target2.conectarHDMI();
	}

}


