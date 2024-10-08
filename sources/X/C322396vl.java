package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vl  reason: invalid class name and case insensitive filesystem */
public final class C322396vl implements C322386vk {
    public int A00;

    public final /* synthetic */ String BRv(Activity activity, UserSession userSession) {
        return VFX.A00(activity, userSession, this);
    }

    public final int CHV(Context context, boolean z) {
        0qQ.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final long EKO() {
        return 0;
    }

    public final boolean EtR(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        if (!z || !0eE.A00(userSession).A00().A1P() || AnonymousClass0xl.A00(C61170le.A00).A00.getBoolean("has_seen_organic_insights_nux", false)) {
            return false;
        }
        return true;
    }

    public final C322366vi Bdj() {
        return C322366vi.ORGANIC_INSIGHT;
    }

    public final void DsG(UserSession userSession) {
        0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
        AR4.E5T("has_seen_organic_insights_nux", true);
        AR4.apply();
    }

    public final /* synthetic */ boolean EtY() {
        return true;
    }

    public final int BSL(UserSession userSession) {
        return this.A00;
    }
}
