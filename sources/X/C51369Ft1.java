package X;

/* renamed from: X.Ft1  reason: case insensitive filesystem */
public final /* synthetic */ class C51369Ft1 implements Runnable {
    public final /* synthetic */ G79 A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C51369Ft1(G79 g79, String str) {
        this.A00 = g79;
        this.A01 = str;
    }

    public final void run() {
        this.A00.onFail(new C268664dn(AnonymousClass7TE.A15(this.A01)));
    }
}
