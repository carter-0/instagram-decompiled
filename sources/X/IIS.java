package X;

public final class IIS implements C70832Wc {
    public final 2V1 A00;
    public final C336557eo A01 = new C336557eo();

    public final void A00(Iterable iterable, 0sP r11, 0sP r12, 0sL r13) {
        boolean z;
        0qQ.A0B(iterable, 0);
        C336607et r2 = new C336607et(this.A00);
        for (Object next : iterable) {
            C336557eo r3 = this.A01;
            Object invoke = r11.invoke(next);
            if (r12 != null) {
                z = C51971G9r.A1a(next, r12);
            } else {
                z = false;
            }
            r3.A00((C251263mp) r13.invoke(r2, next), invoke, -1.0f, -1.0f, z);
        }
    }

    public final 2V1 Aqq() {
        return this.A00;
    }

    public IIS(2V1 r2) {
        this.A00 = r2;
    }

    public final AnonymousClass2V4 Bnf() {
        return C51970G9q.A0d(this);
    }
}
