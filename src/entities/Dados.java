package entities;

public class Dados {
	
	private int quarto;
	private String estudante;
	private String email;
	
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public String getEstudante() {
		return estudante;
	}
	public void setEstudante(String estudante) {
		this.estudante = estudante;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Dados(int quarto, String estudante, String email) {
		this.quarto = quarto;
		this.estudante = estudante;
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Quarto " + quarto + ", estudante: " + estudante + ", e-mail: " + email;
	}
	
}
