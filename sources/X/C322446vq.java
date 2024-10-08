package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vq  reason: invalid class name and case insensitive filesystem */
public final class C322446vq implements C322386vk {
    public final boolean A00;

    public final /* synthetic */ String BRv(Activity activity, UserSession userSession) {
        return VFX.A00(activity, userSession, this);
    }

    public final int CHV(Context context, boolean z) {
        0qQ.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void DsG(UserSession userSession) {
        AnonymousClass0YZ[] r6;
        long currentTimeMillis;
        0s0 r2;
        char c;
        0qQ.A0B(userSession, 0);
        C65001Zz.A00();
        boolean z = this.A00;
        1Av A002 = 1Au.A00(userSession);
        if (z) {
            0s0 r22 = A002.A8V;
            r6 = 1Av.A8a;
            r22.Epx(A002, Integer.valueOf(((Number) r22.CDM(A002, r6[493])).intValue() + 1), r6[493]);
            currentTimeMillis = System.currentTimeMillis();
            r2 = A002.A8W;
            c = 491;
        } else {
            0s0 r23 = A002.A8T;
            r6 = 1Av.A8a;
            r23.Epx(A002, Integer.valueOf(((Number) r23.CDM(A002, r6[494])).intValue() + 1), r6[494]);
            currentTimeMillis = System.currentTimeMillis();
            r2 = A002.A8U;
            c = 492;
        }
        r2.Epx(A002, Long.valueOf(currentTimeMillis), r6[c]);
    }

    public final long EKO() {
        return 1000;
    }

    public final boolean EtR(UserSession userSession, boolean z) {
        int intValue;
        String str;
        0qQ.A0B(userSession, 1);
        C65001Zz.A00();
        boolean z2 = this.A00;
        0Tu r4 = 0Tu.A05;
        if (!182.A06(r4, userSession, 36322353738688598L) || !182.A06(r4, userSession, 36322353739475041L)) {
            return false;
        }
        1Av A002 = 1Au.A00(userSession);
        if (z2) {
            intValue = ((Number) A002.A8V.CDM(A002, 1Av.A8a[493])).intValue();
            str = "wall_self_profile_tooltip_last_shown_ts";
        } else {
            intValue = ((Number) A002.A8T.CDM(A002, 1Av.A8a[494])).intValue();
            str = "wall_other_profile_tooltip_last_shown_ts";
        }
        if (!1Av.A07(A002, str, 3) || intValue >= ((int) 182.A01(r4, userSession, 36603828716245975L))) {
            return false;
        }
        return true;
    }

    public final boolean EtY() {
        return false;
    }

    public final int BSL(UserSession userSession) {
        if (this.A00) {
            return 2131976760;
        }
        return 2131976784;
    }

    public final C322366vi Bdj() {
        return C322366vi.WONDER_WALL;
    }

    public C322446vq(boolean z) {
        this.A00 = z;
    }
}
