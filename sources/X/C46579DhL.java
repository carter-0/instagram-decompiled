package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.DhL  reason: case insensitive filesystem */
public final class C46579DhL extends C243843aC {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ AnonymousClass3UK A01;
    public final /* synthetic */ C46577DhJ A02;
    public final /* synthetic */ String A03;

    public final void D2Y(FollowStatus followStatus, User user) {
        String str;
        AnonymousClass7TF.A1H(user, followStatus);
        if (user.B6o() == FollowStatus.A05 || user.B6o() == FollowStatus.A07) {
            str = "create";
        } else if (user.B6o() == FollowStatus.A06) {
            str = "destroy";
        } else {
            str = "";
        }
        C230012om r5 = GBV.A06;
        if (r5 != null) {
            AnonymousClass6KM A002 = C46575DhH.A00(this.A00, this.A01, user, (Integer) DbV.A0r(user, GBV.A0A), this.A03);
            A002.A0A = str;
            A002.A06 = 1aC.A06(user.B6o());
            r5.A08(new AnonymousClass6KN(A002));
        }
        C294975nL A012 = C294975nL.A01(this.A02.A00, 0);
        A012.A0G();
        C294975nL A0E = A012.A0E(C71392co.A03(0.5d, 0.5d));
        A0E.A0U(0.975f, 1.0f, -1.0f);
        A0E.A0V(0.975f, 1.0f, -1.0f);
        A0E.A0H();
    }

    public C46579DhL(AnonymousClass0iw r1, AnonymousClass3UK r2, C46577DhJ dhJ, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
        this.A02 = dhJ;
    }
}
