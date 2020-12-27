package recentFilesPackage;

public class RecentFileList {
	
	private Arquivo[] arquivosRecentes = new Arquivo[15];
	
	private int tamanho = 0;
	
	public void addArchive(Arquivo arquivoAberto) {
			
		Arquivo[] arquivosTemp = new Arquivo[15];
		int tempTam = 0;
		
		//Adiciona o arquivo aberto na primeira posicao do array temporario
		arquivosTemp[0] = arquivoAberto;
		tempTam++;
		
		//percorre a lista de arquivos abertos recentemente
		for (int i = 0; i < tamanho; i++){
			
			//Se o novo item ja estava na lista então ignora
			if(arquivoAberto.getName().equals(arquivosRecentes[i].getName())){
				continue;
			}
			/* 	
			 	Se a lista temporaria esta cheia então quebra a execucao do for.
				Caso a lista de arquivos abertos recentemente estiver cheia e o
				arquivo aberto nao estiver nela, entao o ultimo arquivo sera 
				descartado.
			*/
			else if(tempTam == 15) {
				break;
			}
			
			
			//adiciona elementos de arquivos recentes no temporario
			else {
				arquivosTemp[tempTam] = arquivosRecentes[i];
				tempTam++;
			}
		}
		/*
			Agora o temporario tem o arquivo aberto no topo da lista e todos os 
			elementos validos de arquivos recentes foram adicionados depois
		*/ 
		for (int i = 0; i < tempTam; i++) {
			arquivosRecentes[i] = arquivosTemp[i];
		}
		
		tamanho = tempTam;
	}

	public Arquivo getfirstItem() {
		return arquivosRecentes[0];
	}
	
	public Arquivo getItem(int posicao) {
		return arquivosRecentes[posicao];
	}

}
