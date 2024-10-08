package X;

import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.2nG  reason: invalid class name and case insensitive filesystem */
public final class C229362nG implements C229372nH {
    public final AnonymousClass9J0 A00;
    public final C229352nF A01;

    public final void D3p(C267324bN r4, Integer num, int i) {
        List list;
        0qQ.A0B(r4, 0);
        C229352nF r1 = this.A01;
        AnonymousClass9J0 r2 = this.A00;
        String str = r2.A01;
        if (str != null) {
            list = r1.A02(str).A03;
        } else {
            list = 0sn.A00;
        }
        if (list.contains(r4)) {
            r2.A00 = r4;
            ((AbstractCollection) r2.A04).add(r4.getId());
        }
        r2.A02 = true;
    }

    public final void D3q(C276114sa r1, List list, boolean z, boolean z2) {
    }

    public final void D3v(C276114sa r1, List list, boolean z, boolean z2) {
    }

    public C229362nG(AnonymousClass9J0 r1, C229352nF r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
