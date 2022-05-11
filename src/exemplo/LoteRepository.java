package exemplo;

import java.util.HashMap;
import java.util.Map;

public class LoteRepository {

    private Map<String, Lote> lotes = new HashMap<>();

    public String addLote(Lote lote){
        lotes.put(lote.getId(), lote);
        return lote.getId();
    }

    public void removeLote(Lote lote){
        lotes.remove(lote.getId());
    }

    public Lote getLote(String ID){
        return lotes.get(ID);
    }

    public String listaLotes(){
        String saida = "LISTA DE LOTES:\n";
        for (Lote lote: lotes.values()){
            saida += lote.toString();
            saida += "\n";
        }
        return saida;
    }

    public void atualizaLote(Lote lote){ lotes.put(lote.getId(), lote); }
}