package org.example.transformations.interfaces;

public interface SingleParamTransformation<T> extends Transformation {
    void execute(T t);

    @Override
    @SuppressWarnings("unchecked")
    default void executeVariadic(Object... args) {
        if (args == null) {
            return;
        }
        if (args.length != 1) {
            return;
        }
        if (args[0] == null) {
            return;
        }
        try {
            this.execute((T) args[0]);
        } catch (ClassCastException e) {
            //ignored
        }
    }
}
