package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EiZ  reason: case insensitive filesystem */
public abstract class C48688EiZ {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        0bb r2;
        AnonymousClass6Tm r1 = r16;
        Object A03 = r1.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        String A0k = DbW.A0k(r1, A0p);
        String A0p2 = DbX.A0p(r1, A0p);
        String str2 = (String) DbT.A0q(r1, A0p, 3);
        String str3 = (String) DbT.A0q(r1, A0p, 4);
        String A0i = DbW.A0i(r1, 5);
        UserSession A0W = DbX.A0W(r15);
        if (0qQ.A0K(A0W.A06, str)) {
            return null;
        }
        W3U w3u = W3U.A00;
        if (W3U.A02(A0W, w3u).getBoolean("has_shown_mini_shop_legal_dialog", false)) {
            return null;
        }
        C50445Fbs fbs = new C50445Fbs(A0k);
        FragmentActivity A04 = C308206Td.A04(r15);
        0qQ.A0B(A04, 0);
        0qQ.A0B(A0p2, 3);
        0qQ.A0B(str2, 4);
        DbW.A1O(str3, 5, str);
        String A0g = 002.A0g(AnonymousClass7TE.A16(A04, 2131966545), "\n\n", AnonymousClass7TE.A16(A04, 2131966547));
        C358248ab A0X = DbS.A0X(A04);
        A0X.A09(2131966549);
        A0X.A0q(A0g);
        A0X.A0E(FJV.A00);
        A0X.A0a(new C50008FIt(A04, A0W, fbs, A0p2, str2, str3, str, 1), AnonymousClass7TE.A16(A04, 2131957519));
        DbT.A1V(A0X);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(fbs, A0W), "instagram_shopping_mini_shop_legal_nux_impression");
        if (A0e.isSampled()) {
            Dbc.A0e(A0e, str, A0p2, str2, str3);
            if (A0i == null) {
                r2 = null;
            } else {
                r2 = new 0bb();
                r2.A06("m_pk", A0i);
                r2.A06("tracking_token", C231122qu.A0I(A0W, A0i));
            }
            A0e.AAK(r2, "ads_tracking_info");
            A0e.Cgf();
        }
        DbX.A1V(W3U.A02(A0W, w3u), "has_shown_mini_shop_legal_dialog", true);
        return null;
    }
}
