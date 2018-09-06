package atividadetoo;

import javax.swing.JOptionPane;

abstract class Pessoa {

    private String nome = "";
    private String sobrenome = "";
    private String cpf = "";
    private String rg = "";

    public String getNome() {
        String nome = "";
        return this.nome;

    }

    public void setNome(String nome) {
        if (nome != "") {
            this.nome = nome;
        }

    }

    public String getSobrenome() {
        String sobrenome = "";
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome != "") {
            this.sobrenome = sobrenome;
        }
    }

    public String getCpf() {
        String cpf = "";
        return this.cpf;

    }

    public void setCpf(String cpf) {
        if (cpf != "") {
            this.cpf = cpf;
        }

    }

    public String getRG() {
        String rg = "";
        return this.rg;
    }

    public void setRg(String rg) {
        if (rg != "") {
            this.rg = rg;
        }
    }

    /*    public boolean Logar(){ 
        boolean verificar=false;
        String senha="";
       
      
    }
     }
