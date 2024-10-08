package X;

/* renamed from: X.T6q  reason: case insensitive filesystem */
public final class C12781T6q implements C13669Ted {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ 0r1 A01;
    public final /* synthetic */ Integer[] A02;

    public C12781T6q(C307786Rm r1, 0r1 r2, Integer[] numArr) {
        this.A02 = numArr;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean FN7(C276544tV r4) {
        C13668Tec tec;
        0qQ.A0B(r4, 0);
        if (03t.A0O(Integer.valueOf(r4.A04), this.A02) && (tec = (C13668Tec) C307476Qg.A06(this.A00, r4)) != null) {
            0r1 r2 = this.A01;
            r2.A00 = tec.isScrolledToTop() & r2.A00;
        }
        return !this.A01.A00;
    }
}
