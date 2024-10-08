package X;

import java.util.concurrent.Callable;

/* renamed from: X.AsK  reason: case insensitive filesystem */
public final class C41337AsK implements Callable {
    public final /* synthetic */ AnonymousClass93J A00;
    public final /* synthetic */ String A01;

    public C41337AsK(AnonymousClass93J r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        AnonymousClass93J r4 = this.A00;
        1Vg r3 = r4.A02;
        AnonymousClass1WV acquire = r3.acquire();
        acquire.ADh(1, this.A01);
        try {
            r1 = r4.A01;
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
