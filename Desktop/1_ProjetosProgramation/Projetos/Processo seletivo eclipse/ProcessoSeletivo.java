import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		selecaoCandidatos();
		String [] candidatos = {"Felipe", "Marcia", "Julio", "Paulo", "Augusto"};
		for (String candidato: candidatos) {
			entrandoEmContato (candidato);
		}
	}
	
	static void entrandoEmContato (String candidato) {
		int tentativasRealizadas = 1;
				boolean continuarTentando = true;
				boolean atendeu = false;
				do { atendeu = atender();
				continuarTentando = !atendeu;
				if (continuarTentando) 
					tentativasRealizadas++;
				else
					System.out.println("Contato realizado com sucesso");
					
					
				} while(continuarTentando && tentativasRealizadas<=3);
				
				if (atendeu);
					System.out.println("Conseguimos contato com " + candidato + " na" + tentativasRealizadas + " tentativa");
				if (!atendeu);
					System.out.println("Não conseguimos contato com " + candidato  + " numero maximo de tentativas realizadas");
	
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe", "Marcia", "Julio", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou a remuneração de " + salarioPretendido + " reais" );
			if (salarioBase>=salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			else {
				System.out.println("O candidato " + candidato + " não é compatível com a vaga");
			}
			candidatosAtual++;
		} 		
	}
	
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);

	}
	
	static void analisarCandidato(double salarioPretendido)  {
		double salarioBase = 2000.0;
		if(salarioBase>salarioPretendido) {
			System.out.println("Ligar para candidato");
		}
		else if (salarioBase==salarioPretendido) {
			System.out.println("Ligar para candidato apresentando contraproposta");
		}
		else {
			System.out.println("Aguardar o resultado dos demais candidatos");
		}
	}
}
