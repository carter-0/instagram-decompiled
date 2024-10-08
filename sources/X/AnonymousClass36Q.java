package X;

import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.36Q  reason: invalid class name */
public final class AnonymousClass36Q {
    public static final void A00() {
        AnonymousClass36O.A0B = null;
        AnonymousClass36O.A0C = null;
        AnonymousClass36O.A0D = null;
        AnonymousClass36O.A0E = null;
    }

    public static final void A01(Fragment fragment, 0hq r2) {
        0SM A0R;
        0qQ.A0B(fragment, 0);
        0qQ.A0B(r2, 1);
        if (fragment.mView != null && (A0R = r2.A0R(ReactProgressBarViewManager.PROP_PROGRESS)) != null) {
            A0R.A08();
        }
    }

    public static final void A02(Fragment fragment, 0hq r2) {
        0qQ.A0B(fragment, 0);
        0qQ.A0B(r2, 1);
        if (fragment.isResumed() && !r2.A0G && r2.A0R(ReactProgressBarViewManager.PROP_PROGRESS) == null) {
            new R8F().A0B(r2, ReactProgressBarViewManager.PROP_PROGRESS);
        }
    }

    public static final void A03(AnonymousClass57Y r9, UserSession userSession, String str) {
        AnonymousClass36O.A0G = false;
        HashMap hashMap = new HashMap();
        String str2 = AnonymousClass36O.A0D;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        hashMap.put("filter_name", str2);
        String str4 = AnonymousClass36O.A0E;
        if (str4 != null) {
            str3 = str4;
        }
        hashMap.put(AnonymousClass000.A00(4119), str3);
        if (str != null) {
            hashMap.put(TraceFieldType.ErrorCode, str);
        }
        00y.A0n(10, userSession.A06);
        C46653DiY.A00(AnonymousClass36O.A0B, userSession, "profile_picture_updated", "photo_editing", AnonymousClass36O.A0C, (String) null, hashMap);
        if (r9 != null) {
            r9.FJw(AnonymousClass36O.A0A);
        }
        A00();
    }
}
