/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/
import java.util.*;

public interface GenericDao<E, K> {
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
} // end GenericDao
