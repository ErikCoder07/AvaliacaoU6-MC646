package recentFilesPackage;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecentFilesTests {

	@Test
	void testeAdicionarArquivo() {
		
		Arquivo arquivoAberto = new Arquivo("nome");
		
		RecentFileList listaArquivos = new RecentFileList();
	
		listaArquivos.addArchive(arquivoAberto);
	
		assertEquals(arquivoAberto.getName(), listaArquivos.getfirstItem().getName());
		
		assertEquals(arquivoAberto,listaArquivos.getfirstItem());
	}
	
}
