package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vj  reason: invalid class name and case insensitive filesystem */
public final class C322376vj implements C322386vk {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final /* synthetic */ String BRv(Activity activity, UserSession userSession) {
        return VFX.A00(activity, userSession, this);
    }

    public final int CHV(Context context, boolean z) {
        0qQ.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void DsG(UserSession userSession) {
        C319986rY r6;
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        boolean z = this.A02;
        boolean z2 = this.A01;
        String str2 = this.A00;
        C319976rX r4 = C319976rX.A00;
        if (z) {
            r6 = C319986rY.SELF;
        } else if (z2) {
            r6 = C319986rY.FOLLOWING;
        } else {
            r6 = C319986rY.NOT_FOLLOWING;
        }
        r4.A0E(userSession2, r6, "profile_highlights_subtab_tooltip", "impression_highlights_subtab_tooltip", str2, (String) null);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        if (z) {
            str = "preference_has_seen_self_highlights_subtab_tooltip";
        } else {
            str = "preference_has_seen_other_highlights_subtab_tooltip";
        }
        AR4.E5T(str, true);
        AR4.apply();
    }

    public final long EKO() {
        return 1000;
    }

    public final boolean EtR(UserSession userSession, boolean z) {
        0xa r1;
        String str;
        0qQ.A0B(userSession, 1);
        boolean z2 = this.A02;
        0Tu r4 = 0Tu.A05;
        if (!182.A06(r4, userSession, 36329019528986350L)) {
            return false;
        }
        1Av A002 = 1Au.A00(userSession);
        if (z2) {
            r1 = A002.A01;
            str = "preference_has_seen_self_highlights_subtab_tooltip";
        } else if (182.A06(r4, userSession, 36329019528920813L)) {
            return false;
        } else {
            r1 = A002.A01;
            str = "preference_has_seen_other_highlights_subtab_tooltip";
        }
        if (!r1.getBoolean(str, false)) {
            return true;
        }
        return false;
    }

    public final boolean EtY() {
        return false;
    }

    public final C322366vi Bdj() {
        return C322366vi.HIGHLIGHTS_TAB;
    }

    public C322376vj(boolean z, boolean z2, String str) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = str;
    }

    public final int BSL(UserSession userSession) {
        return 2131963457;
    }
}
