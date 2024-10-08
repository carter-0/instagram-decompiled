package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;

/* renamed from: X.H8b  reason: case insensitive filesystem */
public final class C54329H8b extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String ctaBarType;
        1Xj A0l = C51968G9o.A0l((C267324bN) obj);
        if (A0l != null) {
            UserSession userSession = this.A00;
            ClipsShoppingCTABarIntf A002 = C14064TpC.A00(A0l);
            if (A002 != null && (ctaBarType = A002.getCtaBarType()) != null) {
                AnonymousClass4DU r5 = this.A01;
                String str = this.A02;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_shopping_reels_cta_impression");
                String id = A0l.getId();
                if (id != null) {
                    C51965G9l.A1I(A0e, id);
                    0bb r2 = new 0bb();
                    r2.A06("prior_module", r5.getModuleName());
                    r2.A06("submodule", "shopping_reels_cta");
                    r2.A06("shopping_session_id", str);
                    A0e.AAK(r2, "navigation_info");
                    A0e.AAJ("cta_bar_type", ctaBarType);
                    A0e.Cgf();
                    1Ln A022 = 1Ln.A02(AnonymousClass0kN.A01(r5, userSession));
                    if (DbT.A1Y(A022)) {
                        if (str == null) {
                            str = "";
                        }
                        A022.A0R("shopping_session_id", str);
                        A022.A0R("navigation_chain", DbS.A0k());
                        G9w.A1E(A022, r5, A0l, "instagram_shopping_reels_cta_impression");
                        A022.A0R("cta_bar_type", ctaBarType);
                        A022.Cgf();
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        String ctaBarType;
        1Xj A0l = C51968G9o.A0l((C267324bN) obj);
        if (A0l != null) {
            UserSession userSession = this.A00;
            ClipsShoppingCTABarIntf A002 = C14064TpC.A00(A0l);
            if (A002 != null && (ctaBarType = A002.getCtaBarType()) != null) {
                AnonymousClass4DU r7 = this.A01;
                String str = this.A02;
                1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_shopping_reels_cta_sub_impression"), 320);
                if (DbT.A1Y(A0U)) {
                    String id = A0l.getId();
                    if (id != null) {
                        A0U.A0m(id);
                        0bb r2 = new 0bb();
                        r2.A06("prior_module", r7.getModuleName());
                        r2.A06("submodule", "shopping_reels_cta");
                        r2.A06("shopping_session_id", str);
                        A0U.A0N(r2, "navigation_info");
                        A0U.A0R("cta_bar_type", ctaBarType);
                        A0U.Cgf();
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
    }

    public C54329H8b(UserSession userSession, AnonymousClass4DU r3, String str) {
        super(C51972G9s.A0b(userSession));
        this.A01 = r3;
        this.A00 = userSession;
        this.A02 = str;
    }
}
