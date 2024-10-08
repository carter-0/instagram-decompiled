package X;

/* renamed from: X.ApP  reason: case insensitive filesystem */
public final class C41165ApP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70960OTh A01;
    public final /* synthetic */ String A02;

    public C41165ApP(C70960OTh oTh, String str, int i) {
        this.A01 = oTh;
        this.A02 = str;
        this.A00 = i;
    }

    public final void run() {
        C70960OTh oTh = this.A01;
        C70960OTh.A00(oTh.A02, oTh, this.A02, this.A00, true);
    }
}
