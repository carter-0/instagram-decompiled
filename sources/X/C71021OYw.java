package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.OYw  reason: case insensitive filesystem */
public final class C71021OYw {
    public static final void A01(Activity activity, UserSession userSession, C254923tH r9, Long l, Long l2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str2;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, activity);
        NK8 nk8 = new NK8();
        Bundle A0A = DbV.A0A(userSession);
        A0A.putString("thread_id_for_logging", str);
        if (r9 != null) {
            str2 = r9.A00;
        } else {
            str2 = null;
        }
        A0A.putString("dm_transport_type_for_logging", str2);
        A0A.putBoolean("is_dm_7_day_enabled", z);
        A0A.putBoolean("is_thread_eligible_open_dm_send", z2);
        A0A.putBoolean("is_dm_e2ee_attribution_enabled", z3);
        A0A.putBoolean("is_tlc_thread", z4);
        if (l != null) {
            A0A.putLong("dm_ephemeral_lifetime_ms_for_logging", l.longValue());
        }
        if (l2 != null) {
            A0A.putLong("dm_after_viewed_ephemeral_lifetime_ms_for_logging", l2.longValue());
        }
        A0A.putBoolean("dm_is_after_viewed_mode", z5);
        nk8.setArguments(A0A);
        C331127Pr A0e = DbX.A0e(userSession, false);
        A0e.A0v = A1U;
        A0e.A0g = activity.getResources().getString(2131960928);
        C331157Pu A00 = A0e.A00();
        0qQ.A0A(nk8);
        OXC.A02(activity, nk8, A00, (C62320sa) null);
    }

    public final boolean A02(UserSession userSession, boolean z, boolean z2, boolean z3) {
        C69366Nk6 nk6;
        0qQ.A0B(userSession, 0);
        long A00 = A00(userSession);
        if (z || z2) {
            if (A00(userSession) == 0) {
                nk6 = C69366Nk6.A07;
            } else {
                nk6 = C69366Nk6.A08;
            }
        } else if (!z3) {
            nk6 = C69366Nk6.A09;
        } else {
            nk6 = C69366Nk6.A05;
        }
        return C51970G9q.A1T((A00 > nk6.A00 ? 1 : (A00 == nk6.A00 ? 0 : -1)));
    }

    public static final long A00(UserSession userSession) {
        1Av A00 = 1Au.A00(userSession);
        0s0 r1 = A00.A12;
        AnonymousClass0YZ[] r5 = 1Av.A8a;
        long A0R = AnonymousClass7TE.A0R(r1.CDM(A00, r5[1]));
        if (A0R > 0) {
            return A0R;
        }
        if (!AnonymousClass7TG.A1a(A00, A00.A37, r5, 0)) {
            return 0;
        }
        A00.A0d(1);
        return 1;
    }
}
