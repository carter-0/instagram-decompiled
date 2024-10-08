package X;

import java.util.List;

/* renamed from: X.LMv  reason: case insensitive filesystem */
public final class C64101LMv {
    public static final C64101LMv A05;
    public final List A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    static {
        List list = 0sn.A00;
        A05 = new C64101LMv(list, list, false, true, false);
    }

    public C64101LMv(List list, List list2, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A00 = list;
        this.A01 = list2;
    }
}
