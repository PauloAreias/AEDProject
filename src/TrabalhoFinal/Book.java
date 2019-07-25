package TrabalhoFinal;

public class Book implements Comparable<Book> {
    private String tipolivro;
    private String nomeautor;
    private String titulo;
    private int edicao;
    private int exemplares;
    
    
    public Book() {
        this.tipolivro = null;
        this.nomeautor = null;
        this.titulo = null;
        this.edicao = 0;
        this.exemplares = 0;
    }

    public Book(String tipliv, String nomaut, String tit, int edic, int exempl) {
        this.tipolivro = tipliv;
        this.nomeautor = nomaut;
        this.titulo = tit;
        this.edicao = edic;
        this.exemplares = exempl;
    }

    public String getTipolivro() {
        return tipolivro;
    }
    public void setTipolivro(String tipolivro) {
        this.tipolivro = tipolivro;
    }

    public String getNomeautor() {
        return nomeautor;
    }
    public void setNomeautor(String nomeautor) {
        this.nomeautor = nomeautor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
    public int getExemplares() {
        return exemplares;
    }
    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }
    
   
    @Override
    public String toString() {
        return "Tipo de livro=" + tipolivro + ", Nome do Autor=" + nomeautor +
       ", Titulo=" + titulo + ", Edicao=" + edicao + ", Exemplares=" + exemplares ;
    }

    @Override
    public int compareTo(Book other) {
        int result;
        if (tipolivro.equals(((Book) other).tipolivro)) {
            result = nomeautor.compareTo(((Book) other).nomeautor);
            if (result == 0) {
                result = titulo.compareTo(((Book) other).titulo);
                if (result == 0) {
                    result = ((Integer) edicao).compareTo(((Integer) other.edicao));
                }
            }
        } else {
            result = tipolivro.compareTo(((Book) other).tipolivro);
        }
        return result;
    }
}
