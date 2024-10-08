package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.M7n  reason: case insensitive filesystem */
public final class C66002M7n implements Runnable {
    public final /* synthetic */ AnonymousClass3Q2 A00;
    public final /* synthetic */ 1ua A01;

    public C66002M7n(AnonymousClass3Q2 r1, 1ua r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        Set set = this.A01.A06;
        AnonymousClass3Q2 r2 = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass2Zd r0 = (AnonymousClass2Zd) JTR.A10(it);
            if (r0 != null) {
                r0.DFp(r2);
            }
        }
    }
}
