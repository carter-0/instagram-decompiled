package X;

import java.util.List;

public final class U9P extends C232322tW {
    public List A00;
    public List A01;
    public final 2Ru A02;

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        this.A01.get(i);
        this.A00.get(i2);
        return false;
    }

    public final boolean A05(int i, int i2) {
        C17967Vj1 vj1 = (C17967Vj1) this.A01.get(i);
        C17967Vj1 vj12 = (C17967Vj1) this.A00.get(i2);
        if (vj1.A00 != vj12.A00 || !0qQ.A0K(vj1.A01, vj12.A01)) {
            return false;
        }
        return true;
    }

    public U9P(2Ru r2) {
        this.A02 = r2;
        0sn r0 = 0sn.A00;
        this.A01 = r0;
        this.A00 = r0;
    }
}
