package X;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: X.AsJ  reason: case insensitive filesystem */
public final class C41336AsJ implements Callable {
    public final /* synthetic */ AnonymousClass93J A00;
    public final /* synthetic */ Collection A01;

    public C41336AsJ(AnonymousClass93J r1, Collection collection) {
        this.A00 = r1;
        this.A01 = collection;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass93J r0 = this.A00;
        C251983oI r2 = r0.A01;
        r2.beginTransaction();
        try {
            r0.A00.insert(this.A01);
            return AnonymousClass7TF.A0z(r2);
        } catch (Throwable th) {
            r2.endTransaction();
            throw th;
        }
    }
}
