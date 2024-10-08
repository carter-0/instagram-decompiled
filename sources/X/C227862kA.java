package X;

/* renamed from: X.2kA  reason: invalid class name and case insensitive filesystem */
public final class C227862kA implements AnonymousClass0eM {
    public 2YL A00;
    public final C62320sa A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final C62230ry A04;

    public final boolean CVQ() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        2YL r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C587707f r4 = (C587707f) this.A03.invoke();
        2YM r3 = (2YM) this.A02.invoke();
        AnonymousClass2YQ r2 = (AnonymousClass2YQ) this.A01.invoke();
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        2YL A022 = new 2YN(r3, r4, r2).A02(this.A04);
        this.A00 = A022;
        return A022;
    }

    public C227862kA(C62320sa r1, C62320sa r2, C62320sa r3, C62230ry r4) {
        this.A04 = r4;
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
