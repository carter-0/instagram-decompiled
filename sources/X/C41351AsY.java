package X;

import java.util.concurrent.Callable;

/* renamed from: X.AsY  reason: case insensitive filesystem */
public final class C41351AsY implements Callable {
    public final /* synthetic */ AnonymousClass92U A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C41351AsY(AnonymousClass92U r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1;
        AnonymousClass92U r4 = this.A00;
        1Vg r3 = r4.A07;
        AnonymousClass1WV acquire = r3.acquire();
        acquire.ADh(1, this.A02);
        acquire.ADh(2, this.A01);
        try {
            r1 = r4.A05;
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
