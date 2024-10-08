package X;

import java.util.concurrent.Callable;

/* renamed from: X.AsB  reason: case insensitive filesystem */
public final class C41328AsB implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass92U A01;

    public C41328AsB(AnonymousClass92U r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        AnonymousClass92U r5 = this.A01;
        1Vg r4 = r5.A06;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, this.A00);
        try {
            r1 = r5.A05;
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
