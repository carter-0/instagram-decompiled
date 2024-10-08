package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

public final class WQT implements 27S {
    public final C307786Rm A00;
    public final C276544tV A01;
    public final UserSession A02;
    public final FollowButton A03;
    public final User A04;

    public WQT(C307786Rm r2, C276544tV r3, UserSession userSession, FollowButton followButton, User user) {
        0qQ.A0B(userSession, 5);
        this.A03 = followButton;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = user;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C2370836g r3 = (C2370836g) obj;
        0qQ.A0B(r3, 0);
        return DbV.A1Z(r3.A00, this.A04.getId());
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(1672621563);
        int A033 = AnonymousClass0fD.A03(2049552199);
        FollowButton followButton = this.A03;
        C276544tV r3 = this.A01;
        W12.A00(this.A00, r3, this.A02, followButton, this.A04);
        AnonymousClass0fD.A0A(986741150, A033);
        AnonymousClass0fD.A0A(-1890568048, A032);
    }
}
