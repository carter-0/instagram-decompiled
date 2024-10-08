package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SgT  reason: case insensitive filesystem */
public final class C11781SgT implements C13516Tbl {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C11781SgT(String str, AtomicBoolean atomicBoolean, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = atomicBoolean;
    }

    public final void onResult(Object obj) {
        String str = this.A02;
        Map map = C11425STh.A00;
        map.remove(str);
        ((AtomicBoolean) this.A01).set(true);
        if (map.size() == 0) {
            ArrayList A1D = AnonymousClass7TE.A1D(C11425STh.A01);
            if (0 < A1D.size()) {
                A1D.get(0);
                throw AnonymousClass7TE.A11("onIdleChanged");
            }
        }
    }
}
