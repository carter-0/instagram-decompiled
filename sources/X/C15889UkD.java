package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.UkD  reason: case insensitive filesystem */
public final class C15889UkD extends C230372pW {
    public final C15329Uae A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15889UkD(UserSession userSession, C15329Uae uae) {
        super(C13988Tno.A0K(userSession));
        if (userSession != null) {
            this.A00 = uae;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C18001Vjd vjd = (C18001Vjd) obj;
        String str = null;
        0qQ.A0B(vjd, 0);
        C15329Uae uae = this.A00;
        C18778W1d w1d = (C18778W1d) uae.A0C.getValue();
        String A01 = vjd.A01();
        String str2 = vjd.A03;
        int indexOf = uae.A04.indexOf(vjd);
        int size = uae.A04.size();
        boolean A04 = C15329Uae.A04(uae, vjd);
        boolean z = uae.A05;
        0Aj A0e = AnonymousClass7TE.A0e(w1d.A02, "instagram_shopping_lightbox_item_impression");
        if (A0e.isSampled()) {
            Product product = w1d.A05;
            C13991Tnr.A17(A0e, product.A0H);
            User user = product.A0B;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            }
            if (str == null) {
                str = "";
            }
            A0e.AAJ("merchant_id", str);
            C13989Tnp.A1H(A0e, product);
            C13992Tns.A0j(A0e, A01, str2, indexOf);
            C18778W1d.A02(A0e, w1d, size, A04, z);
            1Xj r2 = w1d.A04;
            if (r2 != null) {
                UserSession userSession = w1d.A03;
                if (r2.A2A(userSession) != null) {
                    A0e.AAJ("media_owner_id", C13992Tns.A0G(A0e, userSession, r2));
                }
            }
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C18001Vjd vjd = (C18001Vjd) obj;
        String str = null;
        0qQ.A0B(vjd, 0);
        C15329Uae uae = this.A00;
        C18778W1d w1d = (C18778W1d) uae.A0C.getValue();
        String A01 = vjd.A01();
        String str2 = vjd.A03;
        int indexOf = uae.A04.indexOf(vjd);
        int size = uae.A04.size();
        boolean A04 = C15329Uae.A04(uae, vjd);
        boolean z = uae.A05;
        0Aj A0e = AnonymousClass7TE.A0e(w1d.A02, "instagram_shopping_lightbox_item_subimpression");
        if (A0e.isSampled()) {
            Product product = w1d.A05;
            C13991Tnr.A17(A0e, product.A0H);
            User user = product.A0B;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            }
            if (str == null) {
                str = "";
            }
            A0e.AAJ("merchant_id", str);
            C13989Tnp.A1H(A0e, product);
            C13992Tns.A0j(A0e, A01, str2, indexOf);
            C18778W1d.A02(A0e, w1d, size, A04, z);
            1Xj r2 = w1d.A04;
            if (r2 != null) {
                UserSession userSession = w1d.A03;
                if (r2.A2A(userSession) != null) {
                    A0e.AAJ("media_owner_id", C13992Tns.A0G(A0e, userSession, r2));
                }
            }
            A0e.Cgf();
        }
    }
}
