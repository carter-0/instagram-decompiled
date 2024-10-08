package X;

import java.util.concurrent.Callable;

public final class As0 implements Callable {
    public final /* synthetic */ C348847z7 A00;
    public final /* synthetic */ C311976dc A01;

    public As0(C348847z7 r1, C311976dc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C311976dc r0 = this.A01;
        C251983oI r2 = r0.A07;
        r2.beginTransaction();
        try {
            r0.A05.insert(this.A00);
            return AnonymousClass7TF.A0z(r2);
        } catch (Throwable th) {
            r2.endTransaction();
            throw th;
        }
    }
}
