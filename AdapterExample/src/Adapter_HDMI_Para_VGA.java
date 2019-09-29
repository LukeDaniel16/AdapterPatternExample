// Classe Adapter
public class Adapter_HDMI_Para_VGA 	extends Target_HDMI_Compativel{ 
			
	private Adaptee_VGA_Conector adaptado;

	public Adapter_HDMI_Para_VGA(Adaptee_VGA_Conector adaptado) {		
		this.adaptado = adaptado;
	}
	
	public void conectarHDMI() {
		System.out.println("Conexão adaptada!");
		adaptado.conectarVGA();			
	} 
	
}
