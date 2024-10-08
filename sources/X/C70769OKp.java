package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import java.util.ArrayList;

/* renamed from: X.OKp  reason: case insensitive filesystem */
public final class C70769OKp {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass4kA A02;

    public final void A00(DirectThreadAnalyticsParams directThreadAnalyticsParams, String str, C62320sa r21, boolean z) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        0xY AR4 = this.A02.A00.AR4();
        AR4.E5T(002.A0R("direct_has_seen_nudity_forward_friction_", str2), true);
        AR4.apply();
        UserSession userSession = this.A01;
        C331127Pr A0W = DbS.A0W(userSession);
        Activity activity = this.A00;
        A0W.A0g = activity.getString(2131956704);
        A0W.A1J = true;
        DirectThreadAnalyticsParams directThreadAnalyticsParams2 = directThreadAnalyticsParams;
        boolean z2 = z;
        A0W.A0K = new C71355OjA(5, directThreadAnalyticsParams2, r21, this, z2);
        A0W.A0h = activity.getString(2131974225);
        A0W.A1N = true;
        A0W.A0L = new C71398Ojx(7, (Object) this, (Object) directThreadAnalyticsParams2, z2);
        C331157Pu A002 = A0W.A00();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new FullscreenBannerViewModel.SectionBulletPoint((Integer) null, "ls://icon?icon=shield-pano", AnonymousClass7TE.A16(activity, 2131962664), activity.getString(2131962662)));
        A1C.add(new FullscreenBannerViewModel.SectionBulletPoint((Integer) null, "ls://icon?icon=heart-pano", AnonymousClass7TE.A16(activity, 2131962665), activity.getString(2131962663)));
        A002.A02(activity, C66584MXp.A0K(new FullscreenBannerViewModel(Integer.valueOf(R.drawable.ig_illustrations_illo_content_checkpoint_refresh), (String) null, activity.getString(2131962666), (String) null, A1C)));
        if (z) {
            0Aj A0C = C66584MXp.A0C(userSession);
            if (A0C.isSampled()) {
                C71137Odf.A01(A0C, userSession);
                C66584MXp.A0v(A0C, "fwd_friction_impression");
                C66583MXo.A17(A0C, C66584MXp.A0R(C66583MXo.A0I(A0C, directThreadAnalyticsParams2, C66583MXo.A0f(directThreadAnalyticsParams2)), A0C, directThreadAnalyticsParams2));
            }
        }
    }

    public C70769OKp(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = AnonymousClass4k9.A00(userSession);
    }
}
