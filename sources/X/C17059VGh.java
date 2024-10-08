package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;

/* renamed from: X.VGh  reason: case insensitive filesystem */
public abstract class C17059VGh {
    public static final 1OC A00(UserSession userSession, FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, C62320sa r9, 0sP r10) {
        0qQ.A0B(str, 1);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("commerce/community/featured_products/permission_update/");
        A0a.A9m("permission_id", str);
        A0a.A9m("permission_status", featuredProductPermissionStatus.A00);
        1OC A0S = DbU.A0S(A0a, UXO.class, C18258VoP.class);
        C62320sa r2 = r9;
        A0S.A00 = new EDU(r2, userSession, r10, str, 2);
        return A0S;
    }
}
