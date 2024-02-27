public class Playlist {
    public String nome;
    public String descricao;
    public List<Video> videos;

    public void addVideo(Video video){
        System.out.println("Video adicionado com sucesso!");
    }

    public void removerVideo(Video video){
        System.out.println("Video removido com sucesso!");
    }

}
