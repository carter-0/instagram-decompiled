package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Bh  reason: invalid class name and case insensitive filesystem */
public abstract class C327567Bh extends C327577Bi {
    public final C327607Bl A00;

    public final boolean A03(AnonymousClass9J6 r5) {
        if (super.A03(r5)) {
            return this.A00.A04(r5.A01, System.currentTimeMillis());
        }
        return false;
    }

    public C327567Bh(UserSession userSession, C327607Bl r2) {
        super(userSession);
        this.A00 = r2;
    }
}
