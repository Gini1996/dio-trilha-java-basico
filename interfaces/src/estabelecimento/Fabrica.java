/*
 * Princípios da Orientacao a Objeto: 
 * Interfaces:
 *   Uso semelhante a herança, mas utilizando a palavra reservada IMPLEMENTS
 *   Uma interface são niveis mais abrangentes de abstração
 *   Permitindo implementar em uma classe diversos métodos de diversas interfaces
 *   */

package estabelecimento;

import com.repoestudos.equipamentos.impressora.DeskJet;
import com.repoestudos.equipamentos.impressora.Impressora;
import com.repoestudos.equipamentos.impressora.LaserJet;
import com.repoestudos.equipamentos.digitalizadora.Digitalizadora;
import com.repoestudos.equipamentos.copiadora.Copiadora;
import com.repoestudos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica 
{
	public static void main(String[] args) 
	{
	  EquipamentoMultifuncional em = new EquipamentoMultifuncional();
	  Impressora impressora = em;
	  Digitalizadora digitalizadora = em;
	  Copiadora copiadora = em;
	  
	  Impressora impressoraLaser = new LaserJet();
	  Impressora impressoraTinta = new DeskJet();
	  
	  impressora.imprimir();
	  digitalizadora.digitalizar();
	  copiadora.copiar();
	  
	  System.out.println("\n Utilizando equipamentos especificos \n");
	  
	  impressoraLaser.imprimir();
	  impressoraTinta.imprimir();
	}
}
