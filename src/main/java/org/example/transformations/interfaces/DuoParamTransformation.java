package org.example.transformations.interfaces;

public interface DuoParamTransformation<T, D> extends Transformation {
    void execute(T t, D d);

    @Override
    @SuppressWarnings("unchecked")
    default void executeVariadic(Object... args) {
        if (args == null) {
            return;
        }
        if (args.length != 2) {
            return;
        }
        if (args[0] == null || args[1] == null) {
            return;
        }
        try {
            this.execute((T) args[0], (D) args[1]);
        } catch (ClassCastException e) {
            //ignored
        }
    }
}
