
import java.util.*;

public class hellograph {

     ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public hellograph( int v) {
//to add nodes
        for(int i = 0 ; i< v ; i++){
            graph.add(new ArrayList<>());
        }
        
    }
//to add edgess
    void addedg(int u , int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }


     
    
    
    }
