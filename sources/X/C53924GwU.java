package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;

/* renamed from: X.GwU  reason: case insensitive filesystem */
public final class C53924GwU extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C59594JPo A04;
    public final boolean A05;

    public C53924GwU(C267324bN r2, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r5, C59594JPo jPo, boolean z) {
        DbW.A1O(gDe, 4, jPo);
        this.A02 = userSession;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = gDe;
        this.A05 = z;
        this.A04 = jPo;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        String str;
        C257543xZ r8;
        String str2;
        String title;
        C250513lZ A0w;
        C250513lZ A0w2;
        C257883y7 BdU;
        0qQ.A0B(r12, 0);
        C267324bN r9 = this.A00;
        1Xj r0 = r9.A02;
        if (r0 == null || (A0w2 = C51966G9m.A0w(r0)) == null || (BdU = A0w2.BdU()) == null) {
            str = null;
        } else {
            str = BdU.AjA();
        }
        1Xj r02 = r9.A02;
        if (r02 == null || (A0w = C51966G9m.A0w(r02)) == null) {
            r8 = null;
        } else {
            r8 = A0w.AZ1();
        }
        UserSession userSession = this.A02;
        boolean A06 = 182.A06(DbS.A0J(userSession, 0), userSession, 36324037365935820L);
        if (A06) {
            str2 = C247573gZ.A00(IGAdTransparencyDisclaimerPlacement.BELOW_IMAGE, C231122qu.A02(userSession, r9.A02));
        } else {
            str2 = null;
        }
        if (!A06) {
            if (this.A05 && str != null && str.length() > 0) {
                return A00(r12, str);
            }
        } else if (str2 != null && str2.length() > 0) {
            return A00(r12, str2);
        }
        if (r8 == null || (title = r8.getTitle()) == null || title.length() <= 0) {
            1Xj r03 = r9.A02;
            if (r03 == null || !r03.A6K()) {
                return null;
            }
            AnonymousClass3XV r04 = 2WX.A02;
            2WX A10 = G9t.A10(AnonymousClass9JR.A00(C51973G9u.A0R((2WX) null, C51966G9m.A0k(0, C244013aV.A06(r12)), 0, C244013aV.A0C(r12, R.dimen.add_account_icon_circle_radius)), AnonymousClass05K.A15, 2, C244013aV.A06(r12)), AnonymousClass05K.A0D, "clips_ads_disclaimers_component");
            2Wb A0K = C51973G9u.A0K(r12);
            A0K.A00(A04(A0K));
            return C51967G9n.A0P(A05(A0K, "", 2), A0K, r12, A10);
        }
        2V1 Aqq = r12.Aqq();
        Context A0B = C51965G9l.A0B(Aqq);
        String title2 = r8.getTitle();
        if (title2 == null) {
            title2 = "";
        }
        String A002 = C270804hK.A00(A0B, title2, true);
        AnonymousClass3XV r05 = 2WX.A02;
        2WX A102 = G9t.A10(AnonymousClass9JR.A00(C51973G9u.A0R((2WX) null, C51966G9m.A0k(0, C244013aV.A06(r12)), 0, C244013aV.A0C(r12, R.dimen.add_account_icon_circle_radius)), AnonymousClass05K.A15, 2, C244013aV.A06(r12)), AnonymousClass05K.A0D, "clips_ads_disclaimers_component");
        AnonymousClass4DU r5 = this.A03;
        2WX A032 = GFM.A03(C238863Ds.USER_MESSAGE, GFM.A01(C238863Ds.STORY, A102, r9, userSession, r5), userSession, r5, J6R.A00(this, r8, 17));
        2Wb A0S = AnonymousClass7TG.A0S(Aqq);
        A0S.A00(A04(A0S));
        return C51967G9n.A0P(A05(A0S, A002, 2), A0S, r12, A032);
    }

    private final 2Tp A00(C70832Wc r10, String str) {
        UserSession userSession = this.A02;
        int A002 = C55164HdG.A00(userSession);
        AnonymousClass3XV r0 = 2WX.A02;
        long A06 = C244013aV.A06(r10);
        2WX A10 = G9t.A10(AnonymousClass9JR.A00(C51973G9u.A0R((2WX) null, C51965G9l.A0c(AnonymousClass05K.A08, 0, A06), 0, C244013aV.A0C(r10, R.dimen.add_account_icon_circle_radius)), AnonymousClass05K.A15, 2, C244013aV.A06(r10)), AnonymousClass05K.A0D, "clips_political_ads_disclaimers_component");
        AnonymousClass4DU r3 = this.A03;
        2WX A032 = GFM.A03(C238863Ds.USER_MESSAGE, GFM.A01(C238863Ds.STORY, A10, this.A00, userSession, r3), userSession, r3, J6E.A00(this, 3));
        2Wb A0M = C51973G9u.A0M(r10);
        A0M.A00(A04(A0M));
        return C51967G9n.A0P(A05(A0M, str, A002), A0M, r10, A032);
    }

    public static final C247373gE A04(C70832Wc r5) {
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0x = G9t.A0x(C51972G9s.A0T(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A09, 0, C244013aV.A09(r5)), AnonymousClass05K.A00, 0, C244013aV.A06(r5)), 0, C244013aV.A06(r5)), AnonymousClass05K.A0C, 0.0f);
        Drawable A0K = C51968G9o.A0K(r5, R.drawable.instagram_info_filled_16);
        C51972G9s.A0w(A0K, r5, R.color.baseline_neutral_80);
        return C51974G9v.A0P(A0K, r5.Aqq(), A0x);
    }

    private final 2WW A05(C70832Wc r20, String str, int i) {
        String str2;
        C267324bN r1 = this.A00;
        1Xj r0 = r1.A02;
        String str3 = "";
        if (r0 == null || (str2 = r0.A0C.Axm()) == null) {
            str2 = str3;
        }
        if (str != null) {
            str3 = str;
        }
        1Xj r02 = r1.A02;
        if (r02 != null && r02.A6K() && str2.length() > 0) {
            if (str3.length() > 0) {
                str3 = 002.A0R(str3, " • ");
            }
            str3 = 002.A0R(str3, str2);
        }
        AnonymousClass3XV r03 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51968G9o.A0e(AnonymousClass05K.A0E, C244083ac.A00(C244063aa.DISCLAIMER)));
        C70832Wc r13 = r20;
        long A08 = C244013aV.A08(r13);
        2V1 Aqq = r13.Aqq();
        int A082 = C51968G9o.A08(Aqq.A0C, r13, R.attr.igds_color_link_on_color);
        UserSession userSession = this.A02;
        long A032 = GHW.A03(userSession);
        int A022 = GHW.A02(userSession, r13.Bnf().A02(R.color.black));
        long A042 = GHW.A04(userSession);
        Integer A052 = GHW.A05(userSession, r13.Bnf().A02(R.color.black));
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A13 = G9t.A13(Aqq, str3, A082);
        C51971G9r.A1J(A13, r13.Bnf(), 0, A08);
        A13.A0S(typeface);
        A13.A0O(A022);
        C51974G9v.A10(A13, r13, C51969G9p.A09(r13, A032), A0D);
        C51974G9v.A11(A13, r13.Bnf(), A052, A042);
        C51974G9v.A19(A13, num, false);
        A13.A0M(i);
        C51973G9u.A19(A0X, A13, false);
        return A13.A0A();
    }
}
