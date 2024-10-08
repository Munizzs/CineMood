package br.com.project.cineMood.model;

public class Usuario {
    private int id_usuario;
    private String nome;
    private String email;
    private String senha;
    private String data_nascimento;
    private String estado_emocional;

    public Usuario(int id_usuario, String nome, String email, String senha, String data_nascimento, String estado_emocional) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
        this.estado_emocional = estado_emocional;
    }

    public int getId_usuario() {return id_usuario;}

    public void setId_usuario(int id_usuario) {this.id_usuario = id_usuario;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public String getData_nascimento() {return data_nascimento;}

    public void setData_nascimento(String data_nascimento) {this.data_nascimento = data_nascimento;}

    public String getEstado_emocional() {return estado_emocional;}

    public void setEstado_emocional(String estado_emocional) {this.estado_emocional = estado_emocional;}


    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", data_nascimento='" + data_nascimento + '\'' +
                ", estado_emocional='" + estado_emocional + '\'' +
                '}';
    }

}
