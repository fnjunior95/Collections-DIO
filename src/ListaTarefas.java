/* . Lista de Tarefas
Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
removerTarefas(String descricao): Remove mais de uma tarefa da lista com base em sua descrição.
obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.*/
import java.util.ArrayList;
import java.util.List;
public class ListaTarefas{
    private final List<Tarefa> tarefas = new ArrayList<>();
    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        for(int i = 0; i < tarefas.size(); i++){
            if(tarefas.get(i).getDescricao().equals(descricao)){
                tarefas.remove(i);
                break;
            }
        }
    }
    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }
    public List<String> obterDescricoesTarefas(){
        List<String> descricoes = new ArrayList<>();
        for(Tarefa tarefa : tarefas){
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }
    public void removerTarefas(String descricao){
        for(int i = 0; i < tarefas.size(); i++){
            if(tarefas.get(i).getDescricao().equals(descricao)){
                tarefas.remove(i);
                i--;
            }
        }
    }
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer compras");
        lista.adicionarTarefa("Lavar o carro");
        lista.adicionarTarefa("Lavar o carro");
        System.out.println(lista.obterNumeroTotalTarefas());
        System.out.println(lista.obterDescricoesTarefas());
        lista.removerTarefa("Lavar o carro");
        System.out.println(lista.obterNumeroTotalTarefas());
        System.out.println(lista.obterDescricoesTarefas());
        lista.adicionarTarefa("Lavar o carro");
        System.out.println(lista.obterNumeroTotalTarefas());
        System.out.println(lista.obterDescricoesTarefas());
        lista.removerTarefas("Lavar o carro");
        System.out.println(lista.obterNumeroTotalTarefas());
        System.out.println(lista.obterDescricoesTarefas());
    }
}