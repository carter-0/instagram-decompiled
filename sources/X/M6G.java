package X;

public final class M6G implements Runnable {
    public final /* synthetic */ AnonymousClass8N2 A00;
    public final /* synthetic */ 0sP A01;

    public M6G(AnonymousClass8N2 r1, 0sP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        0sP r3 = this.A01;
        if (r3 != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Invalid state, upload edit points: ");
            r3.invoke(new KK5((C8917RFk) null, AnonymousClass7TF.A0i(this.A00.A0I.getValue(), A1A)));
        }
    }
}
