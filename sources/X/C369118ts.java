package X;

/* renamed from: X.8ts  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C369118ts implements Runnable {
    public final /* synthetic */ C364018kj A00;
    public final /* synthetic */ C363858kS A01;

    public /* synthetic */ C369118ts(C364018kj r1, C363858kS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C363858kS r1 = this.A01;
        C364018kj r2 = this.A00;
        byte[] bArr = (byte[]) r1.A04(C363858kS.A0X);
        if (bArr == null || bArr.length == 0) {
            r2.DCn(new RuntimeException("Photo taking returned no jpeg data!"));
            return;
        }
        r2.DX5(r1);
        C364268l9 A002 = C364268l9.A00();
        C364268l9.A01(A002, 0, A002.A05);
    }
}
