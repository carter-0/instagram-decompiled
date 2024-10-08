package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ITh  reason: case insensitive filesystem */
public final class C57220ITh implements AnonymousClass340 {
    public final UserSession A00;
    public final C270414gh A01;

    public final Class C9H(Object obj) {
        0qQ.A0B(obj, 0);
        return obj.getClass();
    }

    public final Object C9G(int i) {
        C250973mM Bky = this.A01.Bky(i);
        if (Bky != null) {
            return Bky.A08(this.A00);
        }
        return null;
    }

    public C57220ITh(UserSession userSession, C270414gh r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
