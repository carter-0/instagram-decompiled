package X;

import java.util.concurrent.Callable;

/* renamed from: X.5O7  reason: invalid class name */
public final class AnonymousClass5O7 implements Callable {
    public final /* synthetic */ C279014xw A00;

    public AnonymousClass5O7(C279014xw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        C279014xw r0 = this.A00;
        1Vg r3 = r0.A02;
        AnonymousClass1WV acquire = r3.acquire();
        try {
            r1 = r0.A01;
            r1.beginTransaction();
            acquire.ATQ();
            r1.setTransactionSuccessful();
            C60340gF r02 = C60340gF.A00;
            r1.endTransaction();
            r3.release(acquire);
            return r02;
        } catch (Throwable th) {
            r3.release(acquire);
            throw th;
        }
    }
}
