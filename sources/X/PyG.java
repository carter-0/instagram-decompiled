package X;

import java.util.concurrent.Executor;

public final class PyG {
    public B1A A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public PyG(B1A b1a, Executor executor) {
        if (executor != null) {
            this.A02 = executor;
            this.A00 = b1a;
            return;
        }
        throw new IllegalArgumentException("executor is null");
    }
}
