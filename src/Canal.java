public class Canal {
    public List<Video> videos;
    public String nome;
    public List<Playlist> playlists;
    public List<Usuario> inscritos;

    public void addVideo(Video video){
        System.out.println("Video adicionado com sucesso!");
    }

    public void addPlaylist(Playlist){
        System.out.println("Playlist adicionada com sucesso!");
    }
}
