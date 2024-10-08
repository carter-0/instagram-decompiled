package X;

/* renamed from: X.WpQ  reason: case insensitive filesystem */
public final /* synthetic */ class C20329WpQ implements Runnable {
    public final /* synthetic */ AnonymousClass4MM A00;
    public final /* synthetic */ C263814Nl A01;
    public final /* synthetic */ AnonymousClass4M1 A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C20329WpQ(AnonymousClass4MM r1, C263814Nl r2, AnonymousClass4M1 r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass4M1 r4 = this.A02;
        AnonymousClass4MM r3 = this.A00;
        String str = this.A03;
        C263814Nl r2 = this.A01;
        r3.getClass();
        r3.EnS(0cp.A01(AnonymousClass4M1.A1L, str));
        r4.A0u.post(new C20259Wny(r2, r4));
    }
}
