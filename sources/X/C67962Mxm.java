package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Mxm  reason: case insensitive filesystem */
public final class C67962Mxm extends C249703kE {
    public final View A00;
    public final UserSession A01;
    public final IgdsBanner A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67962Mxm(View view, UserSession userSession) {
        super(view);
        0qQ.A0B(userSession, 2);
        this.A00 = view;
        this.A01 = userSession;
        this.A02 = (IgdsBanner) AnonymousClass7TF.A0F(view, R.id.direct_inbox_ads_event_sharing_notice_view_igds_banner);
    }
}
