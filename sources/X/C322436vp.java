package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vp  reason: invalid class name and case insensitive filesystem */
public final class C322436vp implements C322386vk {
    public final /* synthetic */ String BRv(Activity activity, UserSession userSession) {
        return VFX.A00(activity, userSession, this);
    }

    public final int BSL(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Integer A00 = C319716r5.A00(userSession);
        if (A00 != null) {
            return A00.intValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int CHV(Context context, boolean z) {
        0qQ.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void DsG(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C319716r5.A01(userSession);
    }

    public final long EKO() {
        return 1000;
    }

    public final boolean EtR(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        if (C319716r5.A00(userSession) != null) {
            return true;
        }
        return false;
    }

    public final boolean EtY() {
        return false;
    }

    public final C322366vi Bdj() {
        return C322366vi.CREATE_CHANNELS;
    }
}
