/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;
import java.util.concurrent.Callable;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // testFindById();
        // testFindByKeyword();
        // testFindByCategory();
        //testSize();
        //testGetAll();
        
        // TASK method tests 
        //testFindSelfTitled();
        //testFindCheapRock();
        //testNumberInGenre();
        ///testGetAveragePrice();
        //testFindCheapest();

        //testHasGenre();
        
        
    }

    private static void testHasGenre() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        boolean hasBlues = catalog.hasGenre(MusicCategory.BLUES); // true
        System.out.println(hasBlues);

        boolean hasJazz = catalog.hasGenre(MusicCategory.JAZZ); // false
        System.out.println(hasJazz);

    }

    private static void testFindCheapest() {
    }

    private static void testGetAveragePrice() {
    }

    private static void testNumberInGenre() {
    }

    private static void testFindCheapRock() {
    }

    private static void testFindSelfTitled() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection <MusicItem> selfTitled = catalog.findSelfTitled();
        Collection<MusicItem> findSelfTitled = null;
        dump(selfTitled);


        }



    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(9L);
        System.out.println(found);

        MusicItem notFound = catalog.findById(20L);
        System.out.println(notFound);

    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        dump(popItems);
    }


    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size());  // should be 18


    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> allItems = catalog.getAll();
        allItems.clear(); // should throw exception

    }
    // helper
    private static void dump(Collection<MusicItem> popItems) {
        for (MusicItem item : popItems) {
            System.out.println(item);
        }
    }
}