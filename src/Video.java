public class Video {
    public String url;
    public int curtidas;
    public int volume;
    public String descricao;
    public String nome;

    public List<Comentario> comentarios;
    public void addComentario(Comentario comentario){
        System.out.println("Comentário adicionado com sucesso!");
    }
}
