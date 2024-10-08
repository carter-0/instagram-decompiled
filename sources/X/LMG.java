package X;

import java.util.HashMap;

public final class LMG {
    public long A00;
    public final HashMap A01;

    public LMG(long j) {
        this.A01 = new HashMap(48);
        this.A00 = 0;
    }

    public LMG() {
        this(0);
    }
}
