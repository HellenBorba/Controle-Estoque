import java.util.Objects;

public class Categoria {
    private Long id;
    private String nome;
    private String descricao;
    private ref_baixo_estoque;

    public Categoria() {
    }

    public Categoria(Long id, String name, String descricao, int ref_baixo_estoque) {
        this.id = id;
        this.nome = name;
        this.descricao = descricao;
        this.ref_baixo_estoque = ref_baixo_estoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getRef_baixo_estoque() {
        return ref_baixo_estoque;
    }

    public void setRef_baixo_estoque(int ref_baixo_estoque)
    {
        this.ref_baixo_estoque = ref_baixo_estoque;
    }

    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Categoria{" + "id=" + id + ", name=" + nome + ", descricao=" + descricao + ", ref_baixo_estoque=" + ref_baixo_estoque + '}';
    }

}