package com.projetono;

public class No {
    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {

        this.proximoNo = proximoNo;
    }
  
    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
}