package recentFilesPackage;

public class RecentFileList {
	
	private Arquivo[] arquivosRecentes = new Arquivo[15];
	
	public void addArchive(Arquivo arquivoAberto) {
		arquivosRecentes[0] = arquivoAberto;
	}

	public Arquivo getfirstItem() {
		return arquivosRecentes[0];
	}
}
