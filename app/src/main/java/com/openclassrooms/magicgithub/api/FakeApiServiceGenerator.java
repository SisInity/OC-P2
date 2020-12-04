package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }
 // ici on créé des fake users
    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://gravatar.com/avatar/512fa2ed095eb9952fdb763ce32a178f?s=400&d=robohash&r=x"),
            new User("002", "Paul", "https://gravatar.com/avatar/40ca7cea352c7d7e850d2566fd103755?s=400&d=robohash&r=x"),
            new User("003", "Phil", "https://gravatar.com/avatar/1c927d096e3247f6e6cf4a22a3108fb9?s=400&d=robohash&r=x"),
            new User("004", "Guillaume", "https://gravatar.com/avatar/9e853ea68dca02a8fd94dd5c83dc0a3a?s=400&d=robohash&r=x"),
            new User("005", "Francis", "https://gravatar.com/avatar/6b1393ea492eab7e1b3a0e4e39520197?s=400&d=robohash&r=x"),
            new User("006", "George", "https://gravatar.com/avatar/9341179bdc34a99816c661c8948cced5?s=400&d=robohash&r=x"),
            new User("007", "Louis", "https://gravatar.com/avatar/f63472d5e6f5c6ffe2c154a6e85e833e?s=400&d=robohash&r=x"),
            new User("008", "Mateo", "https://gravatar.com/avatar/67c1cdaef2281e0f8b2b9311e53b433a?s=400&d=robohash&r=x"),
            new User("009", "April", "https://gravatar.com/avatar/962147717828386814ae2d94ed29e36a?s=400&d=robohash&r=x"),
            new User("010", "Louise", "https://gravatar.com/avatar/37a2ee368d96cac674e68d59e16b805f?s=400&d=robohash&r=x"),
            new User("011", "Elodie", "https://gravatar.com/avatar/822a75a3fc82387fb413a62f0c00458f?s=400&d=robohash&r=x"),
            new User("012", "Helene", "https://gravatar.com/avatar/4fd5c56ff62b608c80484803359abc1d?s=400&d=robohash&r=x"),
            new User("013", "Fanny", "https://gravatar.com/avatar/bf21ed631f4cf0edc28d4a50972b5dba?s=400&d=robohash&r=x"),
            new User("014", "Laura", "https://gravatar.com/avatar/5c4f9ad2814473252b4e132345a43104?s=400&d=robohash&r=x"),
            new User("015", "Gertrude", "https://gravatar.com/avatar/6d164efc851f8becf51e29df0dc5deb7?s=400&d=robohash&r=x"),
            new User("016", "Chloé", "https://gravatar.com/avatar/0ae85234eea228e2bd8e9a75375dcd80?s=400&d=robohash&r=x"),
            new User("017", "April", "https://gravatar.com/avatar/63897351a12927dca2ae2d8e61f34948?s=400&d=robohash&r=x"),
            new User("018", "Marie", "https://gravatar.com/avatar/e6a36148ab7ea00cc100bdeaa047a853?s=400&d=robohash&r=x"),
            new User("019", "Henri", "https://gravatar.com/avatar/389eeb6d39a070c5b26752d94c36177d?s=400&d=robohash&r=x"),
            new User("020", "Rémi", "https://gravatar.com/avatar/20f77e16db364b378fbdacce39cbe324?s=400&d=robohash&r=x")
    );
    //créé des fake users qui seront par la suite ajoutés de manière aléatoire
    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://api.adorable.io/AVATARS/512/21.png"),
            new User("022", "Geoffrey", "https://gravatar.com/avatar/616b6ebe60df531660d373785758be58?s=400&d=robohash&r=x"),
            new User("023", "Simon", "https://gravatar.com/avatar/f06885c44453af1cbb7166c3528bdcf2?s=400&d=robohash&r=x"),
            new User("024", "André", "https://gravatar.com/avatar/03976ecfdd0aa415c7f9fc7658f3321c?s=400&d=robohash&r=x"),
            new User("025", "Leopold", "https://gravatar.com/avatar/1854393eebf827196e2c2deddf6fcee2?s=400&d=robohash&r=x")
    );
}
