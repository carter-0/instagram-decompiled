package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

public final class GED {
    public static final GED A00 = new Object();

    public static final float A00(C52058GDe gDe) {
        0qQ.A0B(gDe, 0);
        AnonymousClass3W1 r0 = gDe.A0E;
        if (r0 == null || !r0.A1r) {
            return 1.0f;
        }
        return 0.0f;
    }

    public static final int A02(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 1);
        if (A03(userSession, r4)) {
            return (int) 182.A01(0Tu.A06, userSession, 36603059919459180L);
        }
        return 0;
    }

    public static final boolean A03(UserSession userSession, 1Xj r4) {
        C278644xI Aq4;
        List<C278624xG> AiA;
        0qQ.A0B(userSession, 1);
        if (!(!182.A06(0Tu.A06, userSession, 36321584939542052L) || r4 == null || (Aq4 = r4.A0C.Aq4()) == null || (AiA = Aq4.AiA()) == null || ((AiA instanceof Collection) && AiA.isEmpty()))) {
            for (C278624xG CGB : AiA) {
                if (CGB.CGB() == IGConsiderAndBrowseType.REELS_TAP_ON_CAPTION_AND_BROWSE) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A05(Context context, C52058GDe gDe, UserSession userSession, 1Xj r12, S6e s6e, boolean z) {
        AnonymousClass3W1 r6;
        String str;
        DbZ.A0t(1, r12, gDe, userSession);
        if (A03(userSession, r12)) {
            0Tu r2 = 0Tu.A06;
            if (!182.A06(r2, userSession, 36321584940394027L) && (r6 = gDe.A0E) != null && ((182.A01(r2, userSession, 36603059916575592L) <= 0 || r6.A25) && r6.A1p)) {
                Activity A002 = C61270mF.A00(context);
                Activity activity = null;
                if (A002 instanceof FragmentActivity) {
                    activity = A002;
                }
                AnonymousClass37E r1 = AnonymousClass37D.A00;
                AnonymousClass37D A01 = r1.A01(activity);
                if ((A01 == null || A01.A0Y()) && activity != null) {
                    DbX.A10(activity, r1);
                    if (s6e != null) {
                        if (z) {
                            str = "external_tap";
                        } else {
                            str = "caption_tap";
                        }
                        s6e.A02("secondary_cta", "dismiss", str);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final int A01(C267324bN r2, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, r2);
        if (!r2.CcK() || (!C51966G9m.A0s(r2).A5o() && !C51966G9m.A0s(r2).A5n())) {
            return DbS.A04(0Tu.A05, userSession, 36610335591372789L);
        }
        return 0;
    }

    public final float A04(Context context, UserSession userSession, AnonymousClass3W1 r7) {
        long j;
        int A002 = 0Pn.A00(C61270mF.A00(context));
        boolean z = r7.A2z;
        0Tu r2 = 0Tu.A06;
        if (z) {
            j = 37166009870582171L;
        } else {
            j = 37166009869730200L;
        }
        return ((C51965G9l.A00(r2, userSession, j) * ((float) AnonymousClass0nB.A00(context))) - ((float) A002)) - C61380mr.A00(context, 8.0f);
    }
}
