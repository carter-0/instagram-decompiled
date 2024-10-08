package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.S2n  reason: case insensitive filesystem */
public final class C10955S2n {
    public final S5Y A00;
    public final C10571RuQ A01;
    public final C9611Rdp A02;
    public final String A03;
    public final Collection A04;

    public C10955S2n(S5Y s5y, C10571RuQ ruQ, C9611Rdp rdp, String str, Collection collection) {
        0qQ.A0B(str, 5);
        this.A01 = ruQ;
        this.A00 = s5y;
        this.A04 = collection;
        this.A02 = rdp;
        this.A03 = str;
    }

    public final void A00(String str) {
        try {
            C10571RuQ ruQ = this.A01;
            S5Y s5y = this.A00;
            for (QOy A002 : new C11283SJb(s5y, ruQ.A00, ruQ.A01, ruQ.A02).A00("", true)) {
                s5y.A00(A002, AnonymousClass05K.A02, (String) null, str, (Throwable) null, (Map) null);
            }
        } catch (Throwable unused) {
        }
    }
}
