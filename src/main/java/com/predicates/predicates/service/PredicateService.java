package com.predicates.predicates.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.predicates.predicates.model.Person;

@Component
public class PredicateService {

    Person person = new Person();
    List<Predicate<String>> allPr = new ArrayList<>();

    Predicate<String> pr1 = a -> "John".contains(this.person.getName().split(" ")[0]);
    Predicate<String> pr2 = a -> "Wick".contains(this.person.getName().split(" ")[1]);

    public Boolean checkPredicateResult1 (String name) {
        this.person.setName(name);
        return pr1.and(pr2).test(this.person.getName());
    }

    public Boolean checkPredicateResult2 (String name) {
        this.person.setName(name);
        allPr.add(pr1);
        allPr.add(pr2);
        return allPr.stream().allMatch(a -> a.test(this.person.getName()));
    }



}
