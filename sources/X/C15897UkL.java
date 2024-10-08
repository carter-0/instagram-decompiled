package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.UkL  reason: case insensitive filesystem */
public final class C15897UkL extends C230372pW {
    public final 0wc A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Long l;
        String str;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        User user;
        C68282N8v n8v;
        0eP r8 = (0eP) obj;
        0qQ.A0B(r8, 0);
        1Xj r4 = (1Xj) r8.A00;
        C42130BIj bIj = (C42130BIj) r8.A01;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, AnonymousClass000.A00(3380));
        String str2 = null;
        if (bIj == null || (n8v = bIj.A00) == null || (l = n8v.A02) == null) {
            l = null;
        }
        A0e.A9F("permission_id", l);
        ProductDetailsProductItemDict productDetailsProductItemDict = bIj.A01;
        if (productDetailsProductItemDict == null || (user = productDetailsProductItemDict.A0G) == null) {
            str = null;
        } else {
            str = AnonymousClass3ZA.A00(user);
        }
        C13988Tno.A1A(A0e, str);
        0bb r2 = new 0bb();
        r2.A06("shopping_session_id", this.A03);
        r2.A06("prior_module", this.A01);
        r2.A06("prior_submodule", this.A02);
        C68282N8v n8v2 = bIj.A00;
        if (!(n8v2 == null || (featuredProductPermissionStatus = n8v2.A00) == null)) {
            str2 = featuredProductPermissionStatus.A00;
        }
        C13988Tno.A19(A0e, r2, "submodule", 002.A0R(str2, "_featured_product_pivot"));
        0bb r22 = new 0bb();
        r22.A06("m_pk", r4.getId());
        A0e.AAK(r22, "pivots_logging_info");
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        Long l;
        String str;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        User user;
        C68282N8v n8v;
        0eP r8 = (0eP) obj;
        0qQ.A0B(r8, 0);
        1Xj r4 = (1Xj) r8.A00;
        C42130BIj bIj = (C42130BIj) r8.A01;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, AnonymousClass000.A00(3381));
        String str2 = null;
        if (bIj == null || (n8v = bIj.A00) == null || (l = n8v.A02) == null) {
            l = null;
        }
        A0e.A9F("permission_id", l);
        ProductDetailsProductItemDict productDetailsProductItemDict = bIj.A01;
        if (productDetailsProductItemDict == null || (user = productDetailsProductItemDict.A0G) == null) {
            str = null;
        } else {
            str = AnonymousClass3ZA.A00(user);
        }
        C13988Tno.A1A(A0e, str);
        0bb r2 = new 0bb();
        r2.A06("shopping_session_id", this.A03);
        r2.A06("prior_module", this.A01);
        r2.A06("prior_submodule", this.A02);
        C68282N8v n8v2 = bIj.A00;
        if (!(n8v2 == null || (featuredProductPermissionStatus = n8v2.A00) == null)) {
            str2 = featuredProductPermissionStatus.A00;
        }
        C13988Tno.A19(A0e, r2, "submodule", 002.A0R(str2, "_featured_product_pivot"));
        0bb r22 = new 0bb();
        r22.A06("m_pk", r4.getId());
        A0e.AAK(r22, "pivots_logging_info");
        A0e.Cgf();
    }

    public C15897UkL(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        super(C13988Tno.A0K(userSession));
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
