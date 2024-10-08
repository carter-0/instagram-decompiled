package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OsA  reason: case insensitive filesystem */
public final class C71868OsA implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "ImagineCreateLogger";
    public final 0wc A00;
    public final UserSession A01;

    public C71868OsA(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final String getModuleName() {
        return "ig_direct_imagine_create";
    }

    public final long A00() {
        String fbidV2 = AnonymousClass0t1.A01.A01(this.A01).A03.getFbidV2();
        if (fbidV2 == null) {
            return 0;
        }
        return Long.parseLong(fbidV2);
    }
}
