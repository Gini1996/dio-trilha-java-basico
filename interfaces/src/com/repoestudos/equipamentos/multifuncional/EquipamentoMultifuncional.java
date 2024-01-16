package com.repoestudos.equipamentos.multifuncional;

import com.repoestudos.equipamentos.copiadora.Copiadora;
import com.repoestudos.equipamentos.digitalizadora.Digitalizadora;
import com.repoestudos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora
{
	@Override
	public void copiar() 
	{
		System.out.println("COPIANDO VIA MULTIFUNCIONAL");
	}

	@Override
	public void digitalizar() 
	{
		System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");
	}

	@Override
	public void imprimir() 
	{
		System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
	}
}
