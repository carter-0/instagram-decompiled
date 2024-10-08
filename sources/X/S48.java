package X;

import java.util.concurrent.Executor;

public final class S48 {
    public final C11990Sk9 A00;
    public final Executor A01;

    public final boolean equals(Object obj) {
        if (obj instanceof S48) {
            return this.A00.equals(((S48) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public S48(C11990Sk9 sk9, Executor executor) {
        this.A00 = sk9;
        this.A01 = executor;
    }
}
