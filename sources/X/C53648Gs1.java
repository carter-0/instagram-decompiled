package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchema;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gs1  reason: case insensitive filesystem */
public final class C53648Gs1 extends C251343mx {
    public final UserSession A00;
    public final C62320sa A01;

    public C53648Gs1(UserSession userSession, C62320sa r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        BoostUpsellBannerPayloadSchema boostUpsellBannerPayloadSchema;
        AnonymousClass3Y5 r9 = r20;
        0qQ.A0B(r9, 0);
        C61078JwG jwG = (C61078JwG) this.A01.invoke();
        if (jwG != null) {
            C61084JwM jwM = (C61084JwM) jwG.A00;
            if (!C51971G9r.A1b((C62320sa) jwM.A02) && (boostUpsellBannerPayloadSchema = (BoostUpsellBannerPayloadSchema) DbT.A0r(jwM.A00)) != null) {
                String Ago = boostUpsellBannerPayloadSchema.Ago();
                String AnY = boostUpsellBannerPayloadSchema.AnY();
                String actionUrl = boostUpsellBannerPayloadSchema.getActionUrl();
                if (!(Ago == null || AnY == null || actionUrl == null)) {
                    2V1 r5 = r9.A05;
                    Context A0B = C51965G9l.A0B(r5);
                    SpannableStringBuilder A0C = DbS.A0C(Ago);
                    AnonymousClass7AV.A05(A0C, new C48051ESu(A0B, this, actionUrl, AnonymousClass7TF.A03(A0B, R.attr.igds_color_link)), AnY);
                    AnonymousClass3XV r0 = 2WX.A02;
                    Integer num = AnonymousClass05K.A01;
                    2WX A0X = C51971G9r.A0X((2WX) null, num, 1.0f, 1);
                    Integer num2 = AnonymousClass05K.A0C;
                    2WX A0X2 = C51971G9r.A0X(A0X, num2, 1.0f, 1);
                    int A08 = C51969G9p.A08(r9, 2Yu.A07(A0B));
                    long A082 = C244013aV.A08(r9);
                    Typeface create = Typeface.create("sans-serif-medium", 0);
                    0qQ.A07(create);
                    Typeface A03 = 0oh.A03(A0B, create, num);
                    Integer num3 = AnonymousClass05K.A00;
                    long A0D = C51969G9p.A0D();
                    C244103ae A0b = C51971G9r.A0b(r5, (2V5) null, A0C, 0);
                    C51973G9u.A16(r9, A0b, A08, A082);
                    A0b.A0R(0);
                    G9w.A11(A03, r9, A0b, A0D);
                    A0b.A0W(num3);
                    C51974G9v.A18(A0b, num3, false);
                    A0b.A0E();
                    C51973G9u.A19(A0X2, A0b, false);
                    2WW A0A = A0b.A0A();
                    long A06 = C244013aV.A06(r9);
                    2Tp A0B2 = C243563Zg.A0B(G9t.A0v(A0A, r5), r9, AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, 0, A06), AnonymousClass05K.A0F, 0, C244013aV.A06(r9)));
                    2Tp A0L = C243563Zg.A0L(r9, G9t.A10(C51971G9r.A0X(C51973G9u.A0W((2WX) null, r9, num, R.dimen.ads_disclosure_footer_top_divider_height, 0), num2, 100.0f, 0), num3, C51965G9l.A0Y(C51972G9s.A0A(A0B, r9, R.attr.igds_color_elevated_separator))));
                    long A062 = C244013aV.A06(r9);
                    2Tl A032 = C243563Zg.A03(G9t.A0v(A0L, r5), r9, C51973G9u.A0R((2WX) null, C51967G9n.A0U(0, A062), 0, C244013aV.A06(r9)));
                    UserSession userSession = this.A00;
                    String str = (String) DbT.A0r(jwM.A01);
                    WGU A002 = WGU.A00(userSession);
                    C16678UzE uzE = C16678UzE.FEED_CONTEXTUAL_SELF_PROFILE;
                    String obj = C16678UzE.CTD_BOOST_UPSELL_POST_BANNER.toString();
                    if (str == null) {
                        str = "";
                    }
                    A002.A02 = str;
                    A002.A01 = obj;
                    A002.A0H(uzE, obj);
                    2WX A0X3 = C51971G9r.A0X((2WX) null, num3, 100.0f, 0);
                    2Wb A0J = C51973G9u.A0J(A0L, A0B2, r5);
                    A0J.A00(A032);
                    return C243563Zg.A01(A0J, r9, A0X3);
                }
            }
        }
        return null;
    }
}
