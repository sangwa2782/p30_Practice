package com.ajayam.p30_practice.Singleton_practice;




public class MySingleton {

//    Eager Way of creating singleton class
//    private static  MySingleton mySingleton = new MySingleton();
//    public static MySingleton getMySingleton() {
//        return mySingleton;
//    }
//





//LAZY WAY OF CREATING SINGLETON CLASS

//    1. Create static instance
    private static MySingleton mySingleton;

//    2. make constructor private
    private MySingleton() {}

//    3. make GetInstance method
    public static MySingleton getMySingleton() {
//        object of this class and optimize for threads:-
        synchronized (MySingleton.class) {
            if (mySingleton == null) {
                mySingleton = new MySingleton();
            }
        }

        return mySingleton;
    }



}
