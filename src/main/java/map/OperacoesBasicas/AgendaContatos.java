package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("joao", 12356);
        agendaContatos.adicionarContato("maria", 25412);
        agendaContatos.adicionarContato("jose", 58745);
        agendaContatos.adicionarContato("maria", 31147);
        agendaContatos.adicionarContato("ricardo", 55555);
        agendaContatos.adicionarContato("rosa", 55454);
        //no map o metodo put também atualiza o contato

        agendaContatos.exibirContato();

        agendaContatos.removerContato("ricardo");

        agendaContatos.exibirContato();
    }
}
