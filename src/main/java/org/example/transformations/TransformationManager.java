package org.example.transformations;

import lombok.RequiredArgsConstructor;
import org.example.transformations.interfaces.Transformer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TransformationManager {
    private final List<Transformer> transformers;

    public void runTransformations(Object... args) {
        transformers.forEach(transformer -> transformer.transform().executeVariadic(args));
    }
}