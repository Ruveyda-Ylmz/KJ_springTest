package com.ruveyda.utility;

import java.util.List;
import java.util.Optional;

public interface ServiceCrud <T, ID>{
    List<T> finalAll();
    T save (T t);
    T Update (T t);
    void delete (T t);
    void deleteById(ID id);
    Optional<T> findById(ID id);

}
