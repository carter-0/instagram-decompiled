package X;

import java.util.concurrent.Callable;

/* renamed from: X.MAp  reason: case insensitive filesystem */
public final class C66082MAp implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LS6 A01;

    public C66082MAp(LS6 ls6, long j) {
        this.A01 = ls6;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        LS6 ls6 = this.A01;
        1Vg r4 = ls6.A02;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, this.A00);
        try {
            r1 = ls6.A01;
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
