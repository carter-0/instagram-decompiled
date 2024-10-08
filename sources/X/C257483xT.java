package X;

import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.3xT  reason: invalid class name and case insensitive filesystem */
public final class C257483xT implements Runnable {
    public final /* synthetic */ C256213vP A00;
    public final /* synthetic */ boolean A01;

    public C257483xT(C256213vP r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        C256213vP r4 = this.A00;
        String str = r4.A03;
        Set set = r4.A07;
        set.remove(r4.A02);
        AnonymousClass3BV r6 = r4.A01;
        AnonymousClass3BV.A04(r4.A00, r6, str, set, r4.A06, r4.A05);
        if (r4.A08) {
            Set<Reference> set2 = r6.A04;
            for (Reference reference : set2) {
                C311566ct r1 = (C311566ct) reference.get();
                if (r1 == null) {
                    set2.remove(reference);
                } else if (this.A01) {
                    r1.DQr(str, r4.A04);
                } else {
                    r1.DQ3(str, r4.A04);
                }
            }
        }
    }
}
