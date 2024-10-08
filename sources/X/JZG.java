package X;

import java.util.concurrent.Callable;

public final class JZG implements Callable {
    public final /* synthetic */ 2NU A00;
    public final /* synthetic */ String A01;

    public JZG(2NU r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        2NU r4 = this.A00;
        1Vg r3 = r4.A03;
        AnonymousClass1WV acquire = r3.acquire();
        acquire.ADh(1, this.A01);
        try {
            r1 = r4.A02;
            r1.beginTransaction();
            C60340gF A10 = AnonymousClass7TF.A10(r1, acquire);
            r1.endTransaction();
            r3.release(acquire);
            return A10;
        } catch (Throwable th) {
            r3.release(acquire);
            throw th;
        }
    }
}
