package X;

import java.util.concurrent.Callable;

/* renamed from: X.4B3  reason: invalid class name */
public final class AnonymousClass4B3 implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2NU A01;

    public AnonymousClass4B3(2NU r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        2NU r5 = this.A01;
        1Vg r4 = r5.A05;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, this.A00);
        try {
            r1 = r5.A02;
            r1.beginTransaction();
            acquire.ATQ();
            r1.setTransactionSuccessful();
            C60340gF r0 = C60340gF.A00;
            r1.endTransaction();
            r4.release(acquire);
            return r0;
        } catch (Throwable th) {
            r4.release(acquire);
            throw th;
        }
    }
}
