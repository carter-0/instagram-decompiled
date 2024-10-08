package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sol  reason: case insensitive filesystem */
public final class C12196Sol implements C13818Thm {
    public final 0f9 A00;
    public final C279364yW A01;
    public final AnonymousClass0eM A02;

    public final void A9M(String str) {
    }

    public final void A8R(Exception exc) {
        this.A00.ERJ(exc);
    }

    public final boolean isSampled() {
        return this.A00.isSampled();
    }

    public final void report() {
        0f9 r3 = this.A00;
        if (r3.isSampled()) {
            Iterator it = 0Yt.A0E().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                r3.ABQ(DbT.A13(A1J), DbS.A0s(A1J));
            }
            r3.report();
        }
    }

    public C12196Sol(C279364yW r4, Integer num, AnonymousClass0eM r6) {
        AnonymousClass7TG.A1Q(r6, r4);
        this.A02 = r6;
        this.A01 = r4;
        int A002 = S96.A00(num);
        this.A00 = ((0fA) r6.getValue()).AEf(S96.A01(num), A002);
    }

    public final void ABT(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A00.ABQ(str, str2);
    }
}
