package X;

/* renamed from: X.SEj  reason: case insensitive filesystem */
public final class C11183SEj {
    public final SO5 A00;
    public final C13712Tfa A01;
    public final C11000S4u A02;

    public C11183SEj(C13712Tfa tfa, C11000S4u s4u) {
        SO5 A012 = SO5.A01(s4u.A00, tfa);
        this.A02 = s4u;
        this.A00 = A012;
        this.A01 = tfa;
    }

    public static C7617QQh A00(C8991RKj rKj, C11183SEj sEj) {
        RFF rff = rKj.A00;
        RFF rff2 = RFF.INTERNAL_UNRECOVERABLE;
        C11000S4u s4u = sEj.A02;
        if (rff == rff2) {
            return new C7617QQh(rff2, s4u);
        }
        return new C7617QQh(rff, s4u);
    }
}
