package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.QKu  reason: case insensitive filesystem */
public final class C7579QKu extends C11364SPc implements B3J, C13923TlR, C13922TlQ {
    public boolean A00;
    public final IgPromoAdsExtension A01;
    public final UserSession A02;
    public final String A03;
    public final String A04 = C2818159r.A01();
    public final String A05;
    public final HashMap A06 = AnonymousClass7TE.A1E();

    public static final void A00(C7579QKu qKu, String str) {
        C10663Rvx rvx;
        if (str != null && str.length() != 0) {
            C340027ka r1 = qKu.A03;
            if (r1 != null) {
                rvx = new C10663Rvx(r1.getActivity(), r1);
            } else {
                rvx = null;
            }
            AnonymousClass7TF.A0D().post(new C12942TFb(rvx, str));
        }
    }

    public final String A01() {
        return ((IgPromoAdsPromoCode) AnonymousClass7TE.A13(this.A01.A02)).A01;
    }

    public final void destroy() {
        this.A06.clear();
        super.destroy();
    }

    public C7579QKu(IgPromoAdsExtension igPromoAdsExtension, UserSession userSession, String str, String str2) {
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = igPromoAdsExtension;
        this.A05 = str2;
        this.A00 = 0qQ.A0K(igPromoAdsExtension.A01, NetInfoModule.CONNECTION_TYPE_NONE);
    }
}
