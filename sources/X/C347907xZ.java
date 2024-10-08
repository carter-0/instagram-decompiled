package X;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: X.7xZ  reason: invalid class name and case insensitive filesystem */
public final class C347907xZ implements Callable {
    public final /* synthetic */ 1Vd A00;
    public final /* synthetic */ Collection A01;

    public C347907xZ(1Vd r1, Collection collection) {
        this.A00 = r1;
        this.A01 = collection;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1Vd r0 = this.A00;
        C251983oI r2 = r0.A01;
        r2.beginTransaction();
        try {
            r0.A00.insert(this.A01);
            r2.setTransactionSuccessful();
            return C60340gF.A00;
        } finally {
            r2.endTransaction();
        }
    }
}
