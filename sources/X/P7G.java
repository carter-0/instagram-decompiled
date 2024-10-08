package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class P7G implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r22, C331837So r23, AnonymousClass7L2 r24, 17i r25, boolean z) {
        N4R n4r;
        boolean z2;
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r23, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r2 = r24;
        C51974G9v.A1P(userSession2, r25, r2, A0Y);
        0qQ.A0B(r22, 5);
        C254703su r7 = A0Y.A0e;
        C61072JwA jwA = r7.A0C;
        if (jwA != null) {
            boolean z3 = r7.A2P;
            boolean z4 = A0Y.A0G.A0x;
            boolean A01 = AnonymousClass7F3.A01(r7, userSession2.A06);
            C74326Pt2 pt2 = (C74326Pt2) C51968G9o.A10(O4N.A00, jwA.A01);
            if (pt2 != null) {
                n4r = pt2.AWd(context2, jwA, A0Y, r2.A00, r2.A04.A04, A01);
            } else {
                n4r = new N4R(C66580MXl.A0D(""), (List) 0sn.A00);
            }
            String A0s = C66582MXn.A0s(userSession2, r7, z);
            List list = (List) n4r.A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String A18 = AnonymousClass7TE.A18(it);
                    if (A18 != null && A18.length() != 0) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            return new C68809NXt(C70863OPc.A00(userSession2, A0Y, r2, z3, z4), (SpannableString) n4r.A02, A0s, list, r2.A00, z2, A01, r2.A00());
        }
        throw AnonymousClass7TE.A0y();
    }
}
