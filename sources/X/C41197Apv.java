package X;

import java.io.File;

/* renamed from: X.Apv  reason: case insensitive filesystem */
public final class C41197Apv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C41809B1o A02;
    public final /* synthetic */ AH4 A03;

    public C41197Apv(C41809B1o b1o, AH4 ah4, int i, int i2) {
        this.A03 = ah4;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = b1o;
    }

    public final void run() {
        C345647tr r3 = (C345647tr) this.A03.A0A.Ape(C345647tr.A00);
        r3.ESa(AnonymousClass05K.A01);
        r3.ESZ(100);
        r3.Ef7(this.A01, this.A00);
        r3.EzZ(new A3G(this.A02), (File) null, false);
    }
}
