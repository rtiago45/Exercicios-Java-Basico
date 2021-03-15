
public class TesteLabFaculdade {
	public static void main(String[] args) {
		LabFaculdade usuario = new LabFaculdade();
		
		LabFaculdade a = new LabFaculdade();
		LabFaculdade b = new LabFaculdade();
		LabFaculdade c = new LabFaculdade();
		LabFaculdade d = new LabFaculdade();
		LabFaculdade e = new LabFaculdade();
		
		a.setSaldo(300);
		
		
		usuario.setNome("João");
		usuario.setSaldo(20);
		a.setDeposito(300);
		
		System.out.println(a.getDeposito());
	}
}
