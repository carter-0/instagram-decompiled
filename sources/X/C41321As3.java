package X;

import java.util.concurrent.Callable;

/* renamed from: X.As3  reason: case insensitive filesystem */
public final class C41321As3 implements Callable {
    public final /* synthetic */ C311976dc A00;
    public final /* synthetic */ C346117ud A01;

    public C41321As3(C311976dc r1, C346117ud r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C311976dc r0 = this.A00;
        C251983oI r2 = r0.A07;
        r2.beginTransaction();
        try {
            r0.A02.A00(this.A01);
            return AnonymousClass7TF.A0z(r2);
        } catch (Throwable th) {
            r2.endTransaction();
            throw th;
        }
    }
}
