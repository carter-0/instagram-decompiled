package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vm  reason: invalid class name and case insensitive filesystem */
public final class C322406vm implements C322386vk {
    public final /* synthetic */ String BRv(Activity activity, UserSession userSession) {
        return VFX.A00(activity, userSession, this);
    }

    public final int CHV(Context context, boolean z) {
        0qQ.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void DsG(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0xa A03 = 1Al.A01(userSession).A03(1An.A3V);
        int i = A03.getInt("panavision_profile_tab_tooltip_view_total_times_seen_key", 0);
        0xY AR4 = A03.AR4();
        AR4.E5Z("panavision_profile_tab_tooltip_view_total_times_seen_key", i + 1);
        AR4.apply();
    }

    public final long EKO() {
        return 3000;
    }

    public final boolean EtR(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        if (!z || 1Al.A01(userSession).A03(1An.A3V).getInt("panavision_profile_tab_tooltip_view_total_times_seen_key", 0) >= 1) {
            return false;
        }
        return true;
    }

    public final C322366vi Bdj() {
        return C322366vi.PANAVISION_PROFILE_UNIFICATION;
    }

    public final /* synthetic */ boolean EtY() {
        return true;
    }

    public final int BSL(UserSession userSession) {
        return 2131969138;
    }
}
