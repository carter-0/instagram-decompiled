package X;

import java.util.ArrayDeque;
import java.util.Queue;

public final class SII {
    public static final Queue A01 = new ArrayDeque(0);
    public Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof SII) {
            return Pxi.A1W(this.A00, ((SII) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
