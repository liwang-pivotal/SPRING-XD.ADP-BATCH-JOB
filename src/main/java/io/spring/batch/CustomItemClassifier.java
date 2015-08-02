package io.spring.batch;

import io.spring.domain.Person;

import org.springframework.batch.support.annotation.Classifier;

public class CustomItemClassifier {
    @Classifier
    public String classify(Person item) {
        return item.getPersonID() > 2 ? "1" : "2";
    }
}
