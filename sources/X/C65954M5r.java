package X;

/* renamed from: X.M5r  reason: case insensitive filesystem */
public final class C65954M5r implements Runnable {
    public final /* synthetic */ AnonymousClass34S A00;
    public final /* synthetic */ LP6 A01;

    public C65954M5r(AnonymousClass34S r1, LP6 lp6) {
        this.A01 = lp6;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass84F r1 = this.A01.A07;
        Object obj = this.A00.A01;
        if (obj != null) {
            r1.DLV((String) obj);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
