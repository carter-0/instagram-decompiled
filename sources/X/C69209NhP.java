package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.NhP  reason: case insensitive filesystem */
public final class C69209NhP extends C243843aC {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C66967Mg0 A02;
    public final /* synthetic */ C66632Ma1 A03;
    public final /* synthetic */ C74585PxY A04;
    public final /* synthetic */ C67431Mnm A05;
    public final /* synthetic */ C67432Mnn A06;

    public final void D2Y(FollowStatus followStatus, User user) {
        String str;
        0qQ.A0B(user, 0);
        C74585PxY pxY = this.A04;
        C66632Ma1 ma1 = this.A03;
        pxY.DwE(this.A00, this.A02, ma1);
        C67431Mnm mnm = this.A05;
        FollowStatus A0i = DbV.A0i(this.A01, user);
        FollowStatus followStatus2 = FollowStatus.A05;
        if (A0i == followStatus2) {
            str = DialogModule.KEY_MESSAGE;
        } else if (A0i == FollowStatus.A07) {
            str = "requested";
        } else if (A0i == FollowStatus.A06) {
            str = "follow";
        } else {
            str = "unknown";
        }
        ma1.A03 = str;
        if (A0i == followStatus2) {
            mnm.A0U.setVisibility(8);
        }
    }

    public C69209NhP(AnonymousClass0iw r1, UserSession userSession, C66967Mg0 mg0, C66632Ma1 ma1, C74585PxY pxY, C67431Mnm mnm, C67432Mnn mnn) {
        this.A04 = pxY;
        this.A03 = ma1;
        this.A02 = mg0;
        this.A00 = r1;
        this.A05 = mnm;
        this.A01 = userSession;
        this.A06 = mnn;
    }

    public final void D2p(User user) {
        C74585PxY pxY = this.A04;
        C66632Ma1 ma1 = this.A03;
        pxY.DwE(this.A00, this.A02, ma1);
    }
}
