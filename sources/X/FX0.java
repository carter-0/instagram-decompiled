package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class FX0 implements 27S {
    public final /* synthetic */ C50302FXh A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C323536xe A02;

    public FX0(C50302FXh fXh, UserSession userSession, C323536xe r3) {
        this.A00 = fXh;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        FWT fwt = (FWT) obj;
        0qQ.A0B(fwt, 0);
        return 0qQ.A0K(fwt.A00.getId(), this.A00.A05);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        FollowStatus followStatus;
        int A03 = AnonymousClass0fD.A03(-125578897);
        FWT fwt = (FWT) obj;
        int A032 = AnonymousClass0fD.A03(773586541);
        0qQ.A0B(fwt, 0);
        C50302FXh fXh = this.A00;
        User user = fwt.A00;
        fXh.A04 = user;
        fXh.A06 = user.getUsername();
        fXh.A05 = user.getId();
        User user2 = fXh.A04;
        if (user2 != null) {
            followStatus = user2.B6o();
        } else {
            followStatus = null;
        }
        if (followStatus == FollowStatus.A08) {
            C294695ms.A00(this.A01).A0G(user, false);
        }
        UserSession userSession = this.A01;
        fXh.A02(userSession, this.A02);
        AnonymousClass1Nd.A00(userSession).A02(this, FWT.class);
        AnonymousClass0fD.A0A(-722594906, A032);
        AnonymousClass0fD.A0A(1267726499, A03);
    }
}
