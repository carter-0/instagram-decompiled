package X;

import java.util.List;

/* renamed from: X.Jk4  reason: case insensitive filesystem */
public final class C60356Jk4 extends C232322tW {
    public final List A00;
    public final List A01;

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        return 0qQ.A0K(this.A01.get(i), this.A00.get(i2));
    }

    public final boolean A05(int i, int i2) {
        return 0qQ.A0K(((C60956JuE) this.A01.get(i)).A05, ((C60956JuE) this.A00.get(i2)).A05);
    }

    public C60356Jk4(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
