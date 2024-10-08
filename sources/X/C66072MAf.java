package X;

import java.util.concurrent.Callable;

/* renamed from: X.MAf  reason: case insensitive filesystem */
public final class C66072MAf implements Callable {
    public final /* synthetic */ 2NU A00;
    public final /* synthetic */ String A01;

    public C66072MAf(2NU r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        2NU r4 = this.A00;
        1Vg r3 = r4.A04;
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
