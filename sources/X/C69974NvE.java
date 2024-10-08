package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NvE  reason: case insensitive filesystem */
public abstract class C69974NvE {
    public static final NPL A00(UserSession userSession, C67304Mle mle, C67237MkX mkX, 2EM r20) {
        int i;
        int i2;
        int i3;
        C53343GmT gmT;
        Integer num;
        2EM r10;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        if (!2El.A0H(userSession2)) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        C67237MkX mkX2 = mkX;
        if (mkX2 == C67237MkX.A03 || mkX2 == C67237MkX.A04) {
            A1C2.add(C69367Nk7.VIEW_MODE);
        }
        if (2El.A00(userSession2)) {
            A1C2.add(C69367Nk7.FILTER_TYPE);
        }
        2EM r14 = r20;
        if (2El.A01(userSession2)) {
            A1C2.add(C69367Nk7.SENDER_TYPE);
            if (!0qQ.A0K(r14, C300895y8.A00)) {
                A1C2.add(C69367Nk7.LABEL);
            }
        }
        A1C2.add(C69367Nk7.HIDDEN);
        Iterator it = A1C2.iterator();
        while (it.hasNext()) {
            C69367Nk7 nk7 = (C69367Nk7) it.next();
            C67304Mle mle2 = mle;
            if (nk7 == C69367Nk7.VIEW_MODE) {
                if (!0qQ.A0K(r14, AnonymousClass2EX.A00)) {
                    r10 = r14;
                } else if (mkX2 == C67237MkX.A04) {
                    r10 = C300885y7.A00;
                } else {
                    r10 = AnonymousClass2EU.A00;
                }
                if (r10 != null) {
                    Integer A01 = OXD.A01(r10);
                    int A00 = OXD.A00(r10);
                    if (A01 != null) {
                        gmT = new C53343GmT(mle2, nk7, r10, A00, A01.intValue(), R.drawable.instagram_chevron_down_pano_filled_12);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    continue;
                }
            } else {
                if (nk7 == C69367Nk7.FILTER_TYPE && 0qQ.A0K(r14, AnonymousClass2EX.A00)) {
                    num = OXD.A01(r14);
                    i2 = OXD.A00(r14);
                    if (num == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (mle2.A01 == C2611948q.ALL || !((List) OXD.A02(userSession2, nk7, r14).A00).contains(mle2)) {
                    i2 = nk7.A02;
                    i3 = nk7.A00;
                    i = nk7.A01;
                    gmT = new C53343GmT(mle2, nk7, r14, i2, i3, i);
                } else {
                    num = mle2.A02;
                    i2 = mle2.A00;
                    if (num == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                i3 = num.intValue();
                i = R.drawable.instagram_x_pano_filled_12;
                gmT = new C53343GmT(mle2, nk7, r14, i2, i3, i);
            }
            A1C.add(gmT);
        }
        return new NPL(A1C);
    }
}
