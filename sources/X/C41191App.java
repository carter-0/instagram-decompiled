package X;

/* renamed from: X.App  reason: case insensitive filesystem */
public final class C41191App implements Runnable {
    public final /* synthetic */ C371478yM A00;
    public final /* synthetic */ C314366i5 A01;
    public final /* synthetic */ C352728Ep A02;
    public final /* synthetic */ String A03;

    public C41191App(C371478yM r1, C314366i5 r2, C352728Ep r3, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S1g] */
    public final void run() {
        C314366i5 r4 = this.A01;
        C371478yM r3 = this.A00;
        C352728Ep r2 = this.A02;
        ? obj = new Object();
        obj.A00 = AnonymousClass05K.A09;
        obj.A01 = this.A03;
        C314366i5.A02(r3, obj.A00(), r4, r2);
    }
}
