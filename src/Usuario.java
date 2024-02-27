public class Usuario {
    public String nome;
    public String email;
    public List<Notificacao> notificacoes;
    public List<Canal> inscricoes;
    public List<Canal> canais;
    public List<Playlist> playlists;
    public List<Historico> historico;

    Usuario(){
        inscricoes = new ArrayList<>();
        notificacoes = new ArrayList<>();
        canais =  new ArrayList<>();
        playlists =  new ArrayList<>();
        historico =  new ArrayList<>();
    }

    public void adicionarPlaylist(Playlist playlist){
        System.out.println("Playlist "+playlist.nome+" adicionada com sucesso!");
    }
    public void limparHistorico(){
        System.out.println("Historico apagado com sucesso!");
    }

    public void verVideo(Video video){
        System.out.println("Video "+video.nome+" foi aberto para visualização!");
    }

    public void inscrever(Canal canal){
        System.out.println("Inscrição realizada no canal "+canal.nome);
    }

}
