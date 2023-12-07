package io.peaceingaza.filtering.cusswordfilter;
import java.util.HashSet;
import java.util.List;

public class WordFiltering1 extends HashSet<String> implements CussWord{
    public WordFiltering1(){
        addAll(List.of(cussWord));
    }
    public boolean checkMessage(String content){
        return stream().anyMatch(content::contains);
    }
}

