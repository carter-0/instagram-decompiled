package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.PZK  reason: case insensitive filesystem */
public final class C73240PZK implements Runnable {
    public final /* synthetic */ C72215Oyg A00;
    public final /* synthetic */ 2Kb A01;

    public C73240PZK(C72215Oyg oyg, 2Kb r2) {
        this.A00 = oyg;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass5HJ A002;
        C72215Oyg oyg = this.A00;
        List list = this.A01.A02;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C254703su A0a = C66580MXl.A0a(it);
                String A0g = A0a.A0g();
                if (!(A0g == null || (A002 = C72215Oyg.A00(oyg, A0g)) == null)) {
                    C72215Oyg.A01(A002, A0a, oyg);
                }
            }
        }
    }
}
