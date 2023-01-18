package org.example.transformations.implementations;

import org.example.transformations.interfaces.DuoParamTransformation;
import org.example.transformations.interfaces.Transformer;
import org.springframework.stereotype.Component;

@Component
public class TwoIntegersTransformer implements Transformer {
    @Override
    public DuoParamTransformation<Integer, Integer> transform() {
        return (integer1, integer2) -> {
            int sum = integer1 + integer2;
            System.out.println("Found two integers, their sum: " + sum);
        };
    }
}
