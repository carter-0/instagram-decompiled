package X;

import java.util.concurrent.Callable;

/* renamed from: X.MAr  reason: case insensitive filesystem */
public final class C66084MAr implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2NU A01;
    public final /* synthetic */ String A02;

    public C66084MAr(2NU r1, String str, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        2NU r5 = this.A01;
        1Vg r4 = r5.A09;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, (long) this.A00);
        acquire.ADh(2, this.A02);
        try {
            r1 = r5.A02;
            r1.beginTransaction();
            C60340gF A10 = AnonymousClass7TF.A10(r1, acquire);
            r1.endTransaction();
            r4.release(acquire);
            return A10;
        } catch (Throwable th) {
            r4.release(acquire);
            throw th;
        }
    }
}
