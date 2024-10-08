package X;

/* renamed from: X.WnM  reason: case insensitive filesystem */
public final class C20222WnM implements Runnable {
    public final /* synthetic */ C15615Ufh A00;
    public final /* synthetic */ C15381Ube A01;

    public C20222WnM(C15615Ufh ufh, C15381Ube ube) {
        this.A01 = ube;
        this.A00 = ufh;
    }

    public final void run() {
        C18806W2y w2y = this.A01.A0c;
        int i = this.A00.A00;
        C18806W2y.A01(w2y, i, false);
        C18806W2y.A04(w2y, "INFO_REQUEST_FAIL", i);
    }
}
