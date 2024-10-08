package X;

import java.util.concurrent.Callable;

/* renamed from: X.Arm  reason: case insensitive filesystem */
public final class C41306Arm implements Callable {
    public final /* synthetic */ C311976dc A00;

    public C41306Arm(C311976dc r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        C311976dc r0 = this.A00;
        1Vg r3 = r0.A09;
        AnonymousClass1WV acquire = r3.acquire();
        try {
            r1 = r0.A07;
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
