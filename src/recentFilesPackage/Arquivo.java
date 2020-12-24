package recentFilesPackage;

public class Arquivo {

	private String nomeArquivo = null;
	
	public Arquivo(String nome) {
		this.nomeArquivo = nome;
	}
	
	public String getName() {
		return nomeArquivo;
	}
	
	public void setName(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
}
