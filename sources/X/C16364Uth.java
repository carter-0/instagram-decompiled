package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Uth  reason: case insensitive filesystem */
public final class C16364Uth extends C243843aC {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ FollowButton A04;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.EtL, java.lang.Object] */
    public final void D2Y(FollowStatus followStatus, User user) {
        0qQ.A0B(user, 0);
        C267064at r1 = this.A04.A0J;
        r1.A07(this);
        UserSession userSession = this.A03;
        r1.A03(this.A00, userSession, user);
        Parcelable.Creator creator = User.CREATOR;
        User user2 = new User(user.getId(), user.getUsername());
        user2.A0k(userSession, user, false);
        ? obj = new Object();
        obj.A00 = user2;
        C307786Rm r5 = this.A01;
        C307446Qd A022 = C307476Qg.A02(r5);
        C276544tV r4 = this.A02;
        A022.A0E(new R9V(obj, 1), (long) r4.A03);
        A022.A08();
        C277014uI A0A = r4.A0A(43);
        FollowStatus B6o = user.B6o();
        if (A0A != null) {
            String A06 = 1aC.A06(B6o);
            C308276Tl r0 = new C308276Tl();
            r0.A03(r4, 0);
            r0.A02(A06);
            DbT.A1R(r5, r4, r0, A0A);
        }
        C277014uI A08 = r4.A08();
        if (A08 != null && B6o == FollowStatus.A05) {
            C307886Rw.A03(r5, r4, DbY.A0Q(r4), A08);
        }
        C277014uI A09 = r4.A09();
        if (A09 != null && B6o == FollowStatus.A06) {
            C307886Rw.A03(r5, r4, DbY.A0Q(r4), A09);
        }
    }

    public final void DGP(User user) {
        0qQ.A0B(user, 0);
        C276544tV r3 = this.A02;
        C277014uI A09 = r3.A09();
        if (A09 != null && user.B6o() == FollowStatus.A06) {
            C307886Rw.A03(this.A01, r3, DbY.A0Q(r3), A09);
        }
    }

    public C16364Uth(AnonymousClass0iw r1, C307786Rm r2, C276544tV r3, UserSession userSession, FollowButton followButton) {
        this.A04 = followButton;
        this.A03 = userSession;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
