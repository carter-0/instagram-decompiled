package X;

/* renamed from: X.M8j  reason: case insensitive filesystem */
public final class C66024M8j implements Runnable {
    public final /* synthetic */ MB2 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C66024M8j(MB2 mb2, String str, boolean z) {
        this.A00 = mb2;
        this.A02 = z;
        this.A01 = str;
    }

    public final void run() {
        this.A00.A03.Dgl(this.A02, this.A01);
    }
}
