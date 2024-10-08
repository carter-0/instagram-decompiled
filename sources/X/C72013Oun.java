package X;

import java.util.ArrayList;

/* renamed from: X.Oun  reason: case insensitive filesystem */
public final class C72013Oun implements AnonymousClass68Z {
    public final /* synthetic */ OVJ A00;

    public C72013Oun(OVJ ovj) {
        this.A00 = ovj;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C301345z0 r14 = (C301345z0) obj;
        0qQ.A0B(r14, 0);
        OVJ ovj = this.A00;
        int A04 = C66580MXl.A04(r14);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < A04; i++) {
            Integer num = AnonymousClass05K.A0C;
            String A0u = C66581MXm.A0u(r14, i);
            0qQ.A07(A0u);
            A1C.add(new C68143N2j(num, A0u, C66581MXm.A0t(r14, i), 0.0d, (int) r14.mResultSet.getLong(i, 4)));
        }
        ovj.A00(A1C);
        return C60340gF.A00;
    }
}
