package interfaces;

import javafx.beans.value.ObservableValue;

import java.io.Serializable;

/**
 * Created by peterzdankin on 28.10.16.
 */
public interface Song {
    String getAlbum() ;

    void setAlbum(String album) ;

    String getInterpret() ;

    void setInterpret(String interpret) ;

    String getPath() ;

    void setPath(String path) ;

    String getTitle() ;

    void setTitle(String title) ;

    long getId();

    void setId(long id);

    ObservableValue<String> pathProperty();
    ObservableValue<String> albumProperty();
    ObservableValue<String> interpretProperty();

    String toString();
}