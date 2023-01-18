package org.example.transformations.implementations;

import org.example.transformations.interfaces.SingleParamTransformation;
import org.example.transformations.interfaces.Transformer;
import org.springframework.stereotype.Component;

@Component
public class OneStringTransformer implements Transformer {
    @Override
    public SingleParamTransformation<String> transform() {
        return string -> System.out.println("Found one string: " + string);
    }
}
