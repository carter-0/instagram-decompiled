package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Cw  reason: invalid class name and case insensitive filesystem */
public abstract class C327957Cw {
    public static final boolean A00(UserSession userSession, AnonymousClass2Ep r8) {
        boolean z;
        Integer CHO;
        List CHP;
        1Av A00 = 1Au.A00(userSession);
        if (!0qQ.A0K(r8.CSS(), true) || (CHO = r8.CHO()) == null || CHO.intValue() <= 0 || ((CHP = r8.CHP()) != null && !CHP.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        if (!(!A00.A01.getBoolean("broadcast_channel_crossposting_nux_tooltip_shown", false)) || !((Boolean) A00.A2R.CDM(A00, 1Av.A8a[452])).booleanValue() || r8.C6a() != 29 || !0qQ.A0K(r8.AsX(), userSession.A06) || !z || !AnonymousClass7K4.A03(userSession, false)) {
            return false;
        }
        return true;
    }
}
