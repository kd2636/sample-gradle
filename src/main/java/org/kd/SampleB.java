package org.kd;

import io.reactivex.rxjava3.core.Flowable;

public class SampleB {
    public static void main(String[] args) {
        System.out.println("SampleB class created");
        Flowable.just("Hello, world!!")
                .subscribe(System.out::println);
    }
}
