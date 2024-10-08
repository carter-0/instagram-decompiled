package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.MAe  reason: case insensitive filesystem */
public final class C66071MAe implements Callable {
    public final /* synthetic */ 2NU A00;
    public final /* synthetic */ List A01;

    public C66071MAe(2NU r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        2NU r0 = this.A00;
        C251983oI r2 = r0.A02;
        r2.beginTransaction();
        try {
            r0.A00.A02(this.A01);
            return AnonymousClass7TF.A0z(r2);
        } catch (Throwable th) {
            r2.endTransaction();
            throw th;
        }
    }
}
