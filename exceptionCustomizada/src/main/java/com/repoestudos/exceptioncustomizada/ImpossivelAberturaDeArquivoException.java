package com.repoestudos.exceptioncustomizada;

public class ImpossivelAberturaDeArquivoException extends Exception 
{
	private static final long serialVersionUID = 1L;
	
	private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) 
    {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.setNomeDoArquivo(nomeDoArquivo);
        this.setDiretorio(diretorio);
    }

	public String getNomeDoArquivo() 
	{
		return nomeDoArquivo;
	}

	public void setNomeDoArquivo(String nomeDoArquivo) 
	{
		this.nomeDoArquivo = nomeDoArquivo;
	}

	public String getDiretorio() 
	{
		return diretorio;
	}

	public void setDiretorio(String diretorio) 
	{
		this.diretorio = diretorio;
	}
}
