package br.com.mauricioeduardo.giflib.data;

import br.com.mauricioeduardo.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2016,06,28),"Mauricio Eduardo",false),
            new Gif("ben-and-mike", LocalDate.of(2016,06,28),"Eduardo",true),
            new Gif("book-dominos", LocalDate.of(2016,06,28),"Eduardo Mauricio",true),
            new Gif("compiler-bot", LocalDate.of(2016,06,28),"Oliveira",true),
            new Gif("cowboy-coder", LocalDate.of(2016,06,28),"Oliveira Eduardo",true),
            new Gif("infinite-andrew", LocalDate.of(2016,06,28),"Mauricio",true)
             );

    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS){
            if (gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }
}
