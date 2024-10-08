package X;

/* renamed from: X.FfU  reason: case insensitive filesystem */
public final class C50614FfU implements G63 {
    public final /* bridge */ /* synthetic */ Object ClM(0lg r7, Object obj, String str, String str2, String str3, AnonymousClass4D7 r12) {
        QP8 qp8 = (QP8) obj;
        String str4 = qp8.A04;
        String str5 = qp8.A01;
        String str6 = qp8.A02;
        if (!(r7 instanceof AnonymousClass0aP)) {
            return new C297815sO(new C268664dn(AnonymousClass7TE.A0z("LoggedOutSession is required for one tap log ins")));
        }
        AnonymousClass7TG.A0w(1, str4, str, str2);
        1NY A0N = DbU.A0N(r7);
        A0N.A0A("accounts/one_tap_app_login/");
        A0N.A9m("login_nonce", str5);
        DbU.A1O(A0N, str);
        A0N.A9m("guid", str2);
        DbS.A1P(A0N, str4);
        DbW.A19(19f.A1v, A0N, DbW.A0I(A0N, r7, "adid", FHA.A0H()));
        A0N.A0G("device_base_login_session", str6);
        DbW.A1D(A0N);
        return DbT.A0U(A0N, true).A00(820, r12);
    }
}
