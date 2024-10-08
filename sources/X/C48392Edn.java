package X;

import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.fx.access.sso.FxSsoViewModel;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.Edn  reason: case insensitive filesystem */
public abstract class C48392Edn {
    public static final Object A00(C307896Rx r21, AnonymousClass6Tm r22) {
        AnonymousClass6Tm r1 = r22;
        String A0h = DbY.A0h(r1, 0);
        String A0i = DbW.A0i(r1, 1);
        AnonymousClass0aP A0B = C308206Td.A0B(r21);
        0qQ.A0C(A0B, AnonymousClass000.A00(36));
        AnonymousClass0aP r4 = A0B;
        AnonymousClass4DH A0H = DbU.A0H(r21);
        0qQ.A0C(A0H, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
        Date date = AccessToken.A0A;
        AccessToken accessToken = new AccessToken(AnonymousClass05K.A1F, A0h, AnonymousClass1KO.A02, A0i, EW3.A04.A00, (Collection) null, (Date) null, new Date());
        CallerContext callerContext = EEM.A0B;
        AnonymousClass4DH r16 = A0H;
        EEM eem = new EEM(r16, C308206Td.A08(r21), r4, (FxSsoViewModel) null, C46634DiE.A0z, (String) null);
        if (!accessToken.A06.isEmpty()) {
            C49206ErB.A00(r4, "bloks_action_caa_complete_login_with_fb", "bloks_action_caa_complete_login_with_fb");
            return null;
        }
        double A00 = DbV.A00(r4, 0);
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r4), "facebook_auth_succeeded");
        A0e.A7p("fb4a_installed", Boolean.valueOf(AnonymousClass1G3.A03()));
        A0e.AAJ("referrer", "bloks_action_caa_complete_login_with_fb");
        DbY.A1D(A0e, A00, A002);
        DbY.A1I(A0e, "waterfall_id", 1Q0.A01(), A002);
        DbW.A13(A0e, A00);
        DbT.A1O(A0e);
        FH8.A0D(A0e, r4, "step", "bloks_action_caa_complete_login_with_fb");
        DbY.A1A(A0e);
        DbS.A1G(A0e, "facebook");
        A0e.Cgf();
        eem.A0B(r4, A0i, A0h, false);
        return null;
    }
}
