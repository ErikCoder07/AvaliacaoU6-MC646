package recentFilesPackage;

public class RecentFileList {
	
	private Arquivo[] arquivosRecentes = new Arquivo[15];
	
	public void addArchive(Arquivo arquivoAberto) {
			
		Arquivo[] arquivosTemp = new Arquivo[15];
		
		//Adiciona o arquivo aberto na primeira posicao do array temporario
		arquivosTemp[0] = arquivoAberto;
		
		//percorre a lista de arquivos abertos recentemente
		for (int i = 1; i <= arquivosRecentes.length; i++) {
			
			//Se o novo item ja estava na lista então ignora
			if(arquivoAberto.equals(arquivosRecentes[i-1])) {
				continue;
			}
			/* 	
			 	Se a lista temporaria esta cheia então quebra a execucao do for.
				Caso a lista de arquivos abertos recentemente estiver cheia e o
				arquivo aberto nao estiver nela, entao o ultimo arquivo sera 
				descartado.
			*/
			else if(arquivosTemp.length == 15) {
				break;
			}
			
			
			//adiciona elementos de arquivos recentes no temporario
			else {
				arquivosTemp[i] = arquivosRecentes[i-1];
			}
		}
		/*
			Agora o temporario tem o arquivo aberto no topo da lista e todos os 
			elementos validos de arquivos recentes foram adicionados depois
		*/ 	
		arquivosRecentes = arquivosTemp;
	}

	public Arquivo getfirstItem() {
		return arquivosRecentes[0];
	}

}
