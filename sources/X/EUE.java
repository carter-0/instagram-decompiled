package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class EUE extends C243843aC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47031DpN A01;
    public final /* synthetic */ C46848DmQ A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ boolean A04;

    public final void D2Y(FollowStatus followStatus, User user) {
        String str;
        0qQ.A0B(user, 0);
        boolean z = this.A04;
        if (z || user.B6o() == FollowStatus.A05 || user.B6o() == FollowStatus.A07) {
            this.A01.A02.setVisibility(8);
        } else {
            this.A01.A02.setVisibility(0);
        }
        C46848DmQ dmQ = this.A02;
        if (z) {
            E23 e23 = dmQ.A0A;
            Object A0r = DbV.A0r(user, dmQ.A0C);
            C46848DmQ.A00(dmQ, this.A00);
            if (A0r == null) {
                return;
            }
            if (e23.A01 == null) {
                str = "discoverAccountsLogger";
            } else {
                user.B6o();
                return;
            }
        } else {
            E23 e232 = dmQ.A0A;
            Object obj = this.A03;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.api.schemas.SuggestedUserItem");
            C47217Dt4 dt4 = (C47217Dt4) obj;
            int A002 = C46848DmQ.A00(dmQ, this.A00);
            String A012 = C46848DmQ.A01(dmQ, user.getId());
            0qQ.A0B(dt4, 0);
            User user2 = dt4.A00;
            String str2 = dt4.A05;
            if (user2 != null) {
                Integer A003 = GTO.A00(user2.B6o());
                String str3 = null;
                if (A003 == AnonymousClass05K.A00 || A003 == AnonymousClass05K.A0C) {
                    str3 = "create";
                } else if (A003 == AnonymousClass05K.A01) {
                    str3 = "destroy";
                }
                C230012om r2 = e232.A02;
                if (r2 == null) {
                    str = "recommendedUserLogger";
                } else {
                    AnonymousClass6KM A004 = E23.A00(dt4, user2, str2, A012, A002);
                    A004.A0A = str3;
                    r2.A08(new AnonymousClass6KN(A004));
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DGO(User user) {
        0qQ.A0B(user, 0);
        if (!user.CPV()) {
            C267064at r2 = this.A01.A09.A0J;
            C46848DmQ dmQ = this.A02;
            r2.A03(dmQ.A07, dmQ.A08, user);
        }
    }

    public EUE(C47031DpN dpN, C46848DmQ dmQ, Object obj, int i, boolean z) {
        this.A04 = z;
        this.A01 = dpN;
        this.A02 = dmQ;
        this.A00 = i;
        this.A03 = obj;
    }
}
