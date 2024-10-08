package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;

/* renamed from: X.UkI  reason: case insensitive filesystem */
public final class C15894UkI extends C230372pW {
    public final W03 A00;
    public final W1W A01;
    public final AdsProductPageFragment A02;

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        W03 w03;
        C15054ULx uLx;
        String str;
        C17388VTp vTp = (C17388VTp) obj;
        0qQ.A0B(vTp, 0);
        if (vTp.A00.A01 != AnonymousClass05K.A04 && (w03 = this.A00) != null) {
            String str2 = vTp.A01;
            Product product = w03.A04.Bz5().A09;
            C263944Ny r0 = null;
            if (product != null) {
                uLx = C294165ly.A03(w03.A03, product);
            } else {
                uLx = null;
            }
            0Aj A0e = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_section_impression");
            if (A0e.isSampled()) {
                C15029UKi uKi = w03.A01;
                if (uKi == null || (str = uKi.A05) == null) {
                    str = "";
                }
                C51965G9l.A1L(A0e, W03.A00(A0e, w03, str));
                if (uLx != null) {
                    r0 = uLx.A01;
                }
                W03.A01(A0e, w03, C13992Tns.A0E(r0, A0e, uLx));
                A0e.AAJ("submodule", str2);
                A0e.Cgf();
            }
        }
    }

    public C15894UkI(UserSession userSession, W03 w03, W1W w1w, AdsProductPageFragment adsProductPageFragment) {
        super(C13988Tno.A0K(userSession));
        this.A01 = w1w;
        this.A00 = w03;
        this.A02 = adsProductPageFragment;
    }
}
