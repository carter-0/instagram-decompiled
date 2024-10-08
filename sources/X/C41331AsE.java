package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.AsE  reason: case insensitive filesystem */
public final class C41331AsE implements Callable {
    public final /* synthetic */ C332417Uy A00;
    public final /* synthetic */ List A01;

    public C41331AsE(C332417Uy r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C332417Uy r0 = this.A00;
        C251983oI r2 = r0.A02;
        r2.beginTransaction();
        try {
            r0.A01.insert(this.A01);
            return AnonymousClass7TF.A0z(r2);
        } catch (Throwable th) {
            r2.endTransaction();
            throw th;
        }
    }
}
