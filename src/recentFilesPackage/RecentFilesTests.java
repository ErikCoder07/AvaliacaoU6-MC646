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
	
	@Test
	void testeAdicionarMaxArquivos() {
		
		RecentFileList listaArquivos = new RecentFileList();
		Arquivo arquivoAberto;
		
		
		for (int i = 0; i < 15; i++) {
			arquivoAberto = new Arquivo("nome" + i);
			listaArquivos.addArchive(arquivoAberto);
		}
		
		for (int i = 0; i < 15; i++) {
			System.out.println(listaArquivos.getItem(i).getName());					
		}
		
	}
	
	@Test
	void testeAdicinar16naLista() {
		
		RecentFileList listaArquivos = new RecentFileList();
		Arquivo arquivoAberto;
		
		
		for (int i = 0; i < 15; i++) {
			arquivoAberto = new Arquivo("nome" + i);
			listaArquivos.addArchive(arquivoAberto);
		}
		
		arquivoAberto = new Arquivo("nome" + 50);
		listaArquivos.addArchive(arquivoAberto);
		
		System.out.println("\n16 itens adicionados, 1 repetido");
		
		for (int i = 0; i < 15; i++) {
			System.out.println(listaArquivos.getItem(i).getName());					
		}
		
	}
	
	@Test
	void testeLimpaLista() {
		
		RecentFileList listaArquivos = new RecentFileList();
		Arquivo arquivoAberto;
		
		for (int i = 0; i < 15; i++) {
			arquivoAberto = new Arquivo("nome" + i);
			listaArquivos.addArchive(arquivoAberto);
		}
		
		assertEquals("nome14", listaArquivos.getfirstItem().getName());
		
		listaArquivos.limpaLista();
		
		assertEquals(null, listaArquivos.getfirstItem());
		
	}
	
	@Test
	void testeTravaLista() {
		
		RecentFileList listaArquivos = new RecentFileList();
		Arquivo arquivoAberto;
		
		for (int i = 0; i < 5; i++) {
			arquivoAberto = new Arquivo("nome" + i);
			listaArquivos.addArchive(arquivoAberto);
		}
		
		assertEquals("nome4", listaArquivos.getfirstItem().getName());
		
		listaArquivos.travaLista();
		
		arquivoAberto = new Arquivo("nome" + 50);
		listaArquivos.addArchive(arquivoAberto);
		
		assertEquals("nome4", listaArquivos.getfirstItem().getName());
		
		assertEquals(5, listaArquivos.getTamLista());
		
		listaArquivos.destravaLista();
		
		arquivoAberto = new Arquivo("nome" + 50);
		listaArquivos.addArchive(arquivoAberto);
		
		assertEquals("nome50", listaArquivos.getfirstItem().getName());
		
		assertEquals(6, listaArquivos.getTamLista());
		
	}
	
}
