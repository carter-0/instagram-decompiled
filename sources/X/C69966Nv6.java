package X;

import com.instagram.common.session.UserSession;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nv6  reason: case insensitive filesystem */
public abstract class C69966Nv6 {
    public static final void A00(AnonymousClass4DH r12, UserSession userSession, C331527Ri r14, C331537Rj r15, boolean z) {
        C73205PYj pYj;
        UserSession userSession2 = userSession;
        C331537Rj r9 = r15;
        AnonymousClass7TF.A1D(userSession, 0, r15);
        AnonymousClass4DH r5 = r12;
        C331527Ri r7 = r14;
        RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId A00 = C71096OcW.A00(r12.requireContext(), userSession, r14, r15);
        C71096OcW.A02(r12.requireContext(), (C69465Nm9) null, userSession, r14, r15);
        ArrayList A1C = AnonymousClass7TE.A1C();
        List BRZ = r14.BRZ();
        Iterator it = BRZ.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (A0k.CXO()) {
                String A07 = AnonymousClass50n.A07(A0k);
                0qQ.A07(A07);
                A1C.add(A07);
            }
        }
        F2Q A002 = C48882Eli.A00(userSession);
        C73399Pbw pbw = new C73399Pbw(r5, userSession2, r7, A00, r9, z);
        if (!DbT.A1b(A1C) || (!r14.CVr() && !182.A06(0Tu.A05, userSession, 36313592005593254L))) {
            r12.requireContext();
            if (!A002.A00(r12, pbw, r14.C6C(), BRZ, r7.CUG())) {
                pbw.run();
                return;
            }
            return;
        }
        if (182.A06(0Tu.A05, userSession, 36315889812901528L)) {
            pYj = new C73205PYj(userSession, A00);
        } else {
            pYj = null;
        }
        FV5.A00(r12.requireContext(), userSession, pYj, pbw, A1C);
    }
}
