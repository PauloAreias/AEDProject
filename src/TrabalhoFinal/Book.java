package TrabalhoFinal;

public class Book implements Comparable<Book> {

    private String tipolivro;
    private String nomeautor;
    private String titulo;
    private int edicao;

    public Book(String tipliv, String nomaut, String tit, int edic) {
        this.tipolivro = tipliv;
        this.nomeautor = nomaut;
        this.titulo = tit;
        this.edicao = edic;
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

    @Override
    public String toString() {
        return "Book [Tipo de livro=" + tipolivro + ", Nome do Autor=" + nomeautor + ", Titulo=" + titulo + ", Edicao=" + edicao + "]";
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
