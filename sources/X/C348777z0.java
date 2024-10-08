package X;

import java.util.concurrent.Callable;

/* renamed from: X.7z0  reason: invalid class name and case insensitive filesystem */
public final class C348777z0 implements Callable {
    public final /* synthetic */ C311976dc A00;
    public final /* synthetic */ String A01;

    public C348777z0(C311976dc r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        C311976dc r4 = this.A00;
        1Vg r3 = r4.A0C;
        AnonymousClass1WV acquire = r3.acquire();
        acquire.ADh(1, this.A01);
        try {
            r1 = r4.A07;
            r1.beginTransaction();
            acquire.ATQ();
            r1.setTransactionSuccessful();
            C60340gF r0 = C60340gF.A00;
            r1.endTransaction();
            r3.release(acquire);
            return r0;
        } catch (Throwable th) {
            r3.release(acquire);
            throw th;
        }
    }
}
