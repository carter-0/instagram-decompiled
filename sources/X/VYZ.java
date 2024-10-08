package X;

import com.instagram.common.session.UserSession;

public final class VYZ {
    public final C254463sW A00;
    public final C14929UFq A01;
    public final AnonymousClass327 A02;
    public final 0wc A03;

    public VYZ(UserSession userSession, 1Xj r8, AnonymousClass4DU r9, AnonymousClass57K r10, String str, String str2, String str3, String str4) {
        0bb r5;
        0wc A012 = AnonymousClass0kN.A01(r9, userSession);
        AnonymousClass327 A0Q = C13989Tnp.A0Q(str);
        A0Q.A06("prior_submodule", str2);
        C13989Tnp.A1K(A0Q, "shopping_session_id", str3);
        0bb r2 = null;
        if (str4 == null || r10 == null) {
            r5 = null;
        } else {
            r5 = new 0bb();
            r5.A06("product_collection_id", str4);
            r5.A06("product_collection_type", r10.toString());
        }
        if (r8 != null) {
            r2 = new 0bb();
            r2.A06("m_pk", r8.getId());
            r2.A06("tracking_token", C231122qu.A0F(userSession, r8));
        }
        this.A03 = A012;
        this.A02 = A0Q;
        this.A00 = r5;
        this.A01 = r2;
    }
}
