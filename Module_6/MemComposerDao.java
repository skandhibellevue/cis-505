/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/

import java.util.*;

public class MemComposerDao implements ComposerDao {

    // private properties
    List<Composer> composers = new ArrayList<>();

    /**
     * Default Constructor method, which is used to initialize composers list with 5 Composer objects
     */
    public MemComposerDao() {
        this.composers = new ArrayList<>(Arrays.asList(
                new Composer(1000, "Ludwig Van Beethoven", "Classical"),
                new Composer(1001, "Antonio Vivaldi", "Baroque"),
                new Composer(1002, "Wolfgang Amadeus Mozart", "Classical"),
                new Composer(1003, "Pyotr Ilyich Tchaikovsky", "Romantic"),
                new Composer(1004, "Claude Debussy", "Impressionist")
        ));
    }

    /**
     * findAll method, which is used to return list of Composer objects
     * @return returns List of Composer objects
     */
    @Override
    public List<Composer> findAll() {
        return this.composers;
    }

    /**
     * findby method with one argument, which is used to find a Composer object with ID
     * @param Integer key, id value of a Composer
     * @return returns Composer object
     */
    @Override
    public Composer findBy(Integer key) {
        // Find composer object by comparing with the Id parameter and returns an optional list of objects
        Optional<Composer> result = this.composers
                .stream()
                .filter(c -> c.getId() == key)
                .findFirst();

        // Returns the Composer object if found or else an empty Composer object
        return result.orElseGet(Composer::new);
    }

    /**
     * insert method with one argument, which is used to insert Composer object to the list
     * @param Composer composer
     */
    @Override
    public void insert(Composer composer) {
        this.composers.add(composer);
    } // end insert
} // end MemComposerDao
