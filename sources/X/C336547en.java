package X;

/* renamed from: X.7en  reason: invalid class name and case insensitive filesystem */
public final class C336547en implements C70832Wc {
    public final 2V1 A00;
    public final C336557eo A01 = new C336557eo();

    public final void A01(Iterable iterable, 0sP r11, 0sL r12) {
        0qQ.A0B(iterable, 0);
        C336607et r2 = new C336607et(this.A00);
        for (Object next : iterable) {
            this.A01.A00((C251263mp) r12.invoke(r2, next), r11.invoke(next), -1.0f, -1.0f, false);
        }
    }

    public final void A00(C251263mp r7, Object obj, float f, float f2) {
        this.A01.A00(r7, obj, f, f2, false);
    }

    public final 2V1 Aqq() {
        return this.A00;
    }

    public C336547en(2V1 r2) {
        this.A00 = r2;
    }

    public final AnonymousClass2V4 Bnf() {
        AnonymousClass2V4 r0 = Aqq().A0D;
        0qQ.A07(r0);
        return r0;
    }
}
