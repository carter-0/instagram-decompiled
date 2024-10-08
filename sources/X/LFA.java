package X;

import java.util.Arrays;

public final class LFA {
    public int A00;
    public int A01;
    public final C66569MWx A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && DbY.A1b(this, obj) && 0qQ.A0K(this.A02.BfO(), ((LFA) obj).A02.BfO()));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02.BfO()});
    }

    public LFA(C66569MWx mWx, Integer num, int i, int i2) {
        this.A02 = mWx;
        this.A03 = num;
        this.A01 = i;
        this.A00 = i2;
    }
}
