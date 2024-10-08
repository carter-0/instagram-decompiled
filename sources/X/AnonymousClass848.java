package X;

/* renamed from: X.848  reason: invalid class name */
public final class AnonymousClass848 extends 2YL {
    public static final AnonymousClass9J8 A02 = new AnonymousClass9J8(AnonymousClass849.A08, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
    public final 05G A00 = new 02z(new AnonymousClass84D(AnonymousClass84B.DEFAULT));
    public final 05G A01 = 106.A01(A02);

    public final AnonymousClass9J8 A00(AnonymousClass849 r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass9J8 r1 = (AnonymousClass9J8) this.A01.getValue();
        if (0qQ.A0K(r1, A02) || r1.A01 != r3) {
            return new AnonymousClass9J8(r3, "FOR_YOU");
        }
        return r1;
    }

    public final boolean A02(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass84D r1 = (AnonymousClass84D) this.A00.getValue();
        if (r1 instanceof AnonymousClass8YD) {
            return 0qQ.A0K(((AnonymousClass8YD) r1).A02, str);
        }
        return false;
    }

    public final void A01(AnonymousClass84B r3) {
        this.A00.Epw(new AnonymousClass84D(r3));
    }
}
