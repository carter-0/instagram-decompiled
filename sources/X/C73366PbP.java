package X;

/* renamed from: X.PbP  reason: case insensitive filesystem */
public final class C73366PbP implements Runnable {
    public final /* synthetic */ AnonymousClass3H3 A00;
    public final /* synthetic */ AnonymousClass3H4 A01;
    public final /* synthetic */ OVQ A02;
    public final /* synthetic */ String A03;

    public C73366PbP(AnonymousClass3H3 r1, AnonymousClass3H4 r2, OVQ ovq, String str) {
        this.A00 = r1;
        this.A02 = ovq;
        this.A03 = str;
        this.A01 = r2;
    }

    public final void run() {
        0sP r1 = this.A02.A02;
        String str = this.A03;
        0qQ.A0A(str);
        ((2J9) r1.invoke(str)).A02(new C270884hY(this.A01, "notification_received"));
    }
}
