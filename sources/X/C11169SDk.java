package X;

/* renamed from: X.SDk  reason: case insensitive filesystem */
public final class C11169SDk {
    public final C331327Ql A00;

    public static final void A00(C11169SDk sDk, float f, int i) {
        C331327Ql r5 = sDk.A00;
        r5.A02("max_ampitude", String.valueOf((int) (f * 100.0f)));
        r5.A02("vmrecording_duration", Long.toString(((long) ((int) AnonymousClass7TE.A0P(((long) i) & 4294967295L))) & 4294967295L, 10));
        r5.A01("vmrecording_fail");
        ((C13842TiH) r5.A00.getValue()).A6p();
    }

    public C11169SDk(boolean z) {
        this.A00 = new C331327Ql(z);
    }
}
