package X;

import java.util.concurrent.Callable;

/* renamed from: X.Arz  reason: case insensitive filesystem */
public final class C41319Arz implements Callable {
    public final /* synthetic */ C346147ug A00;
    public final /* synthetic */ C311976dc A01;

    public C41319Arz(C346147ug r1, C311976dc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C311976dc r0 = this.A01;
        C251983oI r2 = r0.A07;
        r2.beginTransaction();
        try {
            r0.A04.insert(this.A00);
            return AnonymousClass7TF.A0z(r2);
        } catch (Throwable th) {
            r2.endTransaction();
            throw th;
        }
    }
}
