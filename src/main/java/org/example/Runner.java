package org.example;

import lombok.RequiredArgsConstructor;
import org.example.transformations.TransformationManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final TransformationManager transformationManager;

    @Override
    public void run(String... args) {
        transformationManager.runTransformations();
        transformationManager.runTransformations("abc"); //prints Found one string: abc
        transformationManager.runTransformations(1);
        transformationManager.runTransformations((Object) null);
        transformationManager.runTransformations("def", "ghi");
        transformationManager.runTransformations("jkl", 2);
        transformationManager.runTransformations("mno", 3, 4);
        transformationManager.runTransformations(5, 6); //prints Found two integers, their sum: 11
    }
}
