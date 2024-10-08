package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.UkM  reason: case insensitive filesystem */
public final class C15898UkM extends C230372pW {
    public final UserSession A00;
    public final W03 A01;
    public final W1W A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        0Aj A0e;
        String str;
        C18001Vjd vjd = (C18001Vjd) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        AnonymousClass7TG.A1Z(vjd, vbr);
        if (this.A03) {
            W03 w03 = this.A01;
            if (w03 != null) {
                Product product = vbr.A04;
                int i = vbr.A02;
                int i2 = vbr.A01;
                C15054ULx A032 = C294165ly.A03(w03.A03, product);
                A0e = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_hero_carousel_impression");
                if (A0e.isSampled()) {
                    C15029UKi uKi = w03.A01;
                    if (uKi == null || (str = uKi.A05) == null) {
                        str = "";
                    }
                    C51965G9l.A1L(A0e, W03.A00(A0e, w03, str));
                    W03.A01(A0e, w03, C15054ULx.A01(A0e, A032));
                    C13991Tnr.A11(A0e, i2);
                    A0e.AAJ("position_in_carousel", String.valueOf(i));
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            W1W w1w = this.A02;
            Product product2 = vbr.A04;
            String A012 = vjd.A01();
            String str2 = vjd.A03;
            int i3 = vbr.A02;
            int i4 = vbr.A01;
            String A002 = C17093VHp.A00(this.A00, vjd);
            A0e = AnonymousClass7TE.A0e(w1w.A04, "instagram_shopping_pdp_hero_carousel_item_impression");
            if (A0e.isSampled()) {
                C13991Tnr.A17(A0e, product2.A0H);
                C13988Tno.A1A(A0e, C13989Tnp.A0q(product2));
                A0e.AAJ("item_id", A012);
                A0e.AAJ("item_type", str2);
                C13991Tnr.A11(A0e, i4);
                C13989Tnp.A1H(A0e, product2);
                A0e.AAJ("position", String.valueOf(i3));
                W1W.A02(A0e, w1w);
                C13988Tno.A1D(A0e, w1w.A0H);
                C51973G9u.A14(A0e, "checkout_session_id", w1w.A0E);
                1Xj r0 = w1w.A00;
                if (r0 != null) {
                    C51965G9l.A1I(A0e, r0.getId());
                }
                if (A002 != null) {
                    A0e.AAE(C263944Ny.A00(A002), "item_media_author_id");
                }
                C13991Tnr.A12(A0e, w1w.A03);
                C13991Tnr.A10(A0e);
            } else {
                return;
            }
        }
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        0Aj A0e;
        String str;
        String str2;
        C18001Vjd vjd = (C18001Vjd) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        AnonymousClass7TG.A1Z(vjd, vbr);
        if (this.A03) {
            W03 w03 = this.A01;
            if (w03 != null) {
                Product product = vbr.A04;
                int i = vbr.A02;
                int i2 = vbr.A01;
                C15054ULx A032 = C294165ly.A03(w03.A03, product);
                A0e = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_hero_carousel_subimpression");
                if (A0e.isSampled()) {
                    C15029UKi uKi = w03.A01;
                    if (uKi == null || (str2 = uKi.A05) == null) {
                        str2 = "";
                    }
                    C51965G9l.A1L(A0e, W03.A00(A0e, w03, str2));
                    W03.A01(A0e, w03, C15054ULx.A01(A0e, A032));
                    C13991Tnr.A11(A0e, i2);
                    A0e.AAJ("position_in_carousel", String.valueOf(i));
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            W1W w1w = this.A02;
            Product product2 = vbr.A04;
            String A012 = vjd.A01();
            String str3 = vjd.A03;
            int i3 = vbr.A02;
            int i4 = vbr.A01;
            String A002 = C17093VHp.A00(this.A00, vjd);
            A0e = AnonymousClass7TE.A0e(w1w.A04, "instagram_shopping_pdp_hero_carousel_item_subimpression");
            C13991Tnr.A17(A0e, product2.A0H);
            User user = product2.A0B;
            String str4 = null;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            } else {
                str = null;
            }
            C13988Tno.A1A(A0e, str);
            A0e.AAJ("item_id", A012);
            A0e.AAJ("item_type", str3);
            C13991Tnr.A11(A0e, i4);
            C13989Tnp.A1H(A0e, product2);
            A0e.AAJ("position", String.valueOf(i3));
            W1W.A02(A0e, w1w);
            C13988Tno.A1D(A0e, w1w.A0H);
            C51973G9u.A14(A0e, "checkout_session_id", w1w.A0E);
            C15029UKi uKi2 = w1w.A01;
            if (uKi2 != null) {
                str4 = uKi2.A06;
            }
            C51965G9l.A1L(A0e, str4);
            1Xj r0 = w1w.A00;
            if (r0 != null) {
                C51965G9l.A1I(A0e, r0.getId());
            }
            if (A002 != null) {
                A0e.AAE(C263944Ny.A00(A002), "item_media_author_id");
            }
            C13991Tnr.A12(A0e, w1w.A03);
            C13991Tnr.A10(A0e);
        }
        A0e.Cgf();
    }

    public C15898UkM(UserSession userSession, W03 w03, W1W w1w, boolean z) {
        super(C13988Tno.A0K(userSession));
        this.A00 = userSession;
        this.A02 = w1w;
        this.A01 = w03;
        this.A03 = z;
    }
}
