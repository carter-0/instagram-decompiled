package X;

/* renamed from: X.Iit  reason: case insensitive filesystem */
public final class C57938Iit implements Runnable {
    public final /* synthetic */ AnonymousClass6LO A00;
    public final /* synthetic */ AnonymousClass6L7 A01;
    public final /* synthetic */ AnonymousClass59L A02;
    public final /* synthetic */ String A03;

    public C57938Iit(AnonymousClass6LO r1, AnonymousClass6L7 r2, AnonymousClass59L r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
    }

    public final void run() {
        try {
            this.A02.AUx(this.A00, this.A01, this.A03, true);
        } catch (C242623Vf e) {
            11Z.A02(new C57709IfC(new C57892Ii9(this.A01, e, this.A02)));
        }
    }
}
