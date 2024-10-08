package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class M05 implements G81 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ LF6 A02;
    public final /* synthetic */ K8O A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void DED() {
    }

    public final void onCancel() {
    }

    public M05(UserSession userSession, User user, LF6 lf6, K8O k8o, String str, String str2) {
        this.A03 = k8o;
        this.A00 = userSession;
        this.A01 = user;
        this.A02 = lf6;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void D5S() {
        LF6 lf6 = this.A02;
        String id = this.A01.getId();
        String str = this.A04;
        String str2 = this.A00.A06;
        String str3 = this.A05;
        0Aj A0e = AnonymousClass7TE.A0e(lf6.A01, "ig_live_remove_follower");
        JTQ.A14(A0e, str2);
        JTQ.A10(A0e, DbZ.A07(str));
        C51965G9l.A1I(A0e, str3);
        C51969G9p.A1A(A0e, lf6.A00);
        A0e.AAJ("method", "moderator_action_review");
        A0e.A9F("target_user_id", Long.valueOf(JTR.A0M(id)));
        JTP.A1G(A0e);
        JTQ.A16(A0e, 0sn.A00);
    }

    public final void onSuccess() {
        C59689JTv.A07(this.A03.requireContext(), 2131972137);
        C49170Eqb.A00(this.A00, this.A01);
    }
}
