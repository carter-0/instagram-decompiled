package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NsS  reason: case insensitive filesystem */
public abstract class C69805NsS {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        boolean A1W = JTQ.A1W(r15.A03(0));
        C277014uI r4 = ((C280064zw) r15.A02()).A00;
        C277014uI r5 = ((C280064zw) r15.A00()).A00;
        C307896Rx r3 = r14;
        UserSession A0B = C308206Td.A0B(r14);
        Context context = C64361Kj.A00().A00;
        if (182.A06(DbS.A0J(A0B, 0), A0B, 36313403027425200L)) {
            if (C70111NxR.A00(A0B).A00 == null) {
                C70111NxR.A00(A0B).A00();
            }
            OTU otu = C70111NxR.A00(A0B).A00;
            if (otu == null) {
                return null;
            }
            OTU.A00(otu, new J7N(4, otu, new GA1(15, A0B, A1W), A1W));
            return null;
        }
        FGP.A03(context, AnonymousClass07i.A00(C308206Td.A04(r14)), A0B, new C50933FlM(r3, r4, r5, A0B, 0), "disabled", A1W);
        return null;
    }
}
