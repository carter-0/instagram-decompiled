package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6vo  reason: invalid class name and case insensitive filesystem */
public final class C322426vo implements C322386vk {
    public final String A00;

    public final /* synthetic */ String BRv(Activity activity, UserSession userSession) {
        return VFX.A00(activity, userSession, this);
    }

    public final int CHV(Context context, boolean z) {
        0qQ.A0B(context, 0);
        return -context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void DsG(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A002 = 1Au.A00(userSession);
        A002.A5Q.Epx(A002, true, 1Av.A8a[445]);
    }

    public final long EKO() {
        return 1000;
    }

    public final boolean EtR(UserSession userSession, boolean z) {
        User A02;
        0qQ.A0B(userSession, 1);
        if (!z && (A02 = 17h.A00(userSession).A02(this.A00)) != null) {
            0sn CC1 = A02.A03.CC1();
            if (CC1 == null) {
                CC1 = 0sn.A00;
            }
            if (!CC1.isEmpty()) {
                1Av A002 = 1Au.A00(userSession);
                if (((Boolean) A002.A5Q.CDM(A002, 1Av.A8a[445])).booleanValue() || !182.A06(0Tu.A05, userSession, 36318720196680091L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final C322366vi Bdj() {
        return C322366vi.UPCOMING_EVENT_ON_PROFILE;
    }

    public final /* synthetic */ boolean EtY() {
        return true;
    }

    public C322426vo(String str) {
        this.A00 = str;
    }

    public final int BSL(UserSession userSession) {
        return 2131976016;
    }
}
