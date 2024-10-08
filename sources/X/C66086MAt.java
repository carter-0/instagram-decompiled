package X;

import java.util.concurrent.Callable;

/* renamed from: X.MAt  reason: case insensitive filesystem */
public final class C66086MAt implements Callable {
    public final /* synthetic */ 2NU A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C66086MAt(2NU r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        2NU r5 = this.A00;
        1Vg r4 = r5.A08;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, this.A02 ? 1 : 0);
        acquire.ADh(2, this.A01);
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
