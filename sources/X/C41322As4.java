package X;

import java.util.concurrent.Callable;

/* renamed from: X.As4  reason: case insensitive filesystem */
public final class C41322As4 implements Callable {
    public final /* synthetic */ C311976dc A00;
    public final /* synthetic */ String A01;

    public C41322As4(C311976dc r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        C311976dc r4 = this.A00;
        1Vg r3 = r4.A08;
        AnonymousClass1WV acquire = r3.acquire();
        acquire.ADh(1, this.A01);
        try {
            r1 = r4.A07;
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
