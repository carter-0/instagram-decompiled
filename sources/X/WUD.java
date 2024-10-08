package X;

import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.Map;

public final class WUD implements C250603lj {
    public Product A00;
    public Map A01 = new HashMap();
    public final W03 A02;
    public final W1W A03;
    public final AdsProductPageFragment A04;

    public final void ATF(AnonymousClass30Y r10, C252093oY r11) {
        C15054ULx uLx;
        String str;
        boolean A1U = AnonymousClass7TF.A1U(0, r10, r11);
        Map map = this.A01;
        String str2 = r10.A05;
        boolean z = map.get(str2);
        if (z == null) {
            z = false;
            map.put(str2, false);
        }
        if (!AnonymousClass7TE.A1a(z) && r11.CEk(r10) == AnonymousClass05K.A00 && this.A04.isScrolledToTop()) {
            W03 w03 = this.A02;
            if (w03 != null) {
                Product product = this.A00;
                C263944Ny r8 = null;
                if (product != null) {
                    uLx = C294165ly.A03(w03.A03, product);
                } else {
                    uLx = null;
                }
                0Aj A0e = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_cta_visible");
                if (A0e.isSampled()) {
                    C15029UKi uKi = w03.A01;
                    if (uKi == null || (str = uKi.A05) == null) {
                        str = "";
                    }
                    C51965G9l.A1L(A0e, W03.A00(A0e, w03, str));
                    if (uLx != null) {
                        r8 = uLx.A01;
                    }
                    W03.A01(A0e, w03, C13992Tns.A0E(r8, A0e, uLx));
                    A0e.Cgf();
                }
            }
            JTP.A1R(str2, map, A1U);
        }
    }

    public WUD(W03 w03, W1W w1w, AdsProductPageFragment adsProductPageFragment) {
        this.A03 = w1w;
        this.A02 = w03;
        this.A04 = adsProductPageFragment;
    }
}
