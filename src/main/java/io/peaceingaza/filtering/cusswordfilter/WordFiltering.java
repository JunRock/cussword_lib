package io.peaceingaza.filtering.cusswordfilter;
import java.util.Arrays;
import java.util.HashSet;

public class WordFiltering extends HashSet<String> implements CussWord{
    public WordFiltering(){
        addAll(Arrays.asList(cussWord));
    }
    public boolean checkMessage(String content){
        return stream().anyMatch(content::contains);
    }
}

