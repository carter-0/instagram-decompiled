package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.MjT  reason: case insensitive filesystem */
public final class C67171MjT extends C232232tF {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67962Mxm(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_ads_event_sharing_notice_view_banner, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        NP6 np6 = (NP6) r7;
        C67962Mxm mxm = (C67962Mxm) r8;
        AnonymousClass7TG.A1N(np6, mxm);
        String str = np6.A01;
        UserSession userSession = mxm.A01;
        C370818x7 r3 = new C370818x7(userSession);
        0qQ.A0B(str, 0);
        if (r3.A01(str).length() > 0) {
            IgdsBanner igdsBanner = mxm.A02;
            igdsBanner.setVisibility(0);
            DbT.A1U(igdsBanner, r3.A00(str), false);
            igdsBanner.setAction((CharSequence) mxm.A00.getContext().getString(2131952506));
            igdsBanner.A00 = new PHK(r3, mxm, np6, str);
            C69864NtS.A00(userSession).A01(userSession.A06, r3.A01(str));
            return;
        }
        mxm.A02.setVisibility(8);
    }

    public final Class modelClass() {
        return NP6.class;
    }

    public C67171MjT(UserSession userSession) {
        this.A00 = userSession;
    }
}
