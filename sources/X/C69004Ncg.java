package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ncg  reason: case insensitive filesystem */
public final class C69004Ncg extends C67573Mq7 implements 0lm {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final UserSession A03;

    public C69004Ncg(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = AnonymousClass1QO.A00(userSession);
        this.A03 = userSession;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A02 = false;
    }

    public static final void A01(C67256Mkq mkq, C69004Ncg ncg, boolean z, boolean z2) {
        String str;
        String str2;
        if ("pending".equals(mkq.A00)) {
            if (z) {
                str = "fetch_threads_finish_pending";
            } else {
                str = "fetch_threads_more_finish_pending";
            }
        } else if (z) {
            str = "fetch_threads_finish_other";
        } else {
            str = "fetch_threads_more_finish_other";
        }
        if (z2) {
            str2 = "server";
        } else {
            str2 = "cache";
        }
        ncg.A04(str, str2);
    }

    public static final boolean A02(C69004Ncg ncg, Integer num) {
        String str;
        if (ncg.A00 == 0) {
            UserSession userSession = ncg.A03;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36314167531014624L)) {
                1QP r2 = ncg.A01;
                switch (num.intValue()) {
                    case 0:
                        str = "DIRECT_TAB";
                        break;
                    case 1:
                        str = "REQUEST_THREAD_VIEW";
                        break;
                    default:
                        str = "MANUAL_RETRY";
                        break;
                }
                ncg.A00 = r2.flowStartForMarker(70785807, AnonymousClass7TF.A0j(str), false);
                return true;
            }
        }
        return false;
    }
}
