package X;

/* renamed from: X.6H8  reason: invalid class name */
public final class AnonymousClass6H8 {
    public C305566Io A00;
    public final AnonymousClass6H9 A01;
    public final 0sP A02;

    public final JP9 A00(int i, long j) {
        C305566Io r3 = this.A00;
        if (r3 == null) {
            return IFK.A00;
        }
        GR8 gr8 = new GR8(r3, this.A01, i, j);
        AnonymousClass6I9 r1 = (AnonymousClass6I9) r3.A01;
        r1.A04.A09(gr8);
        if (!r1.A00) {
            r1.A00 = true;
            r1.A03.post(r1);
        }
        return gr8;
    }

    public AnonymousClass6H8(0sP r2) {
        this.A02 = r2;
        this.A01 = new AnonymousClass6H9();
    }

    public AnonymousClass6H8() {
        this((0sP) null);
    }
}
