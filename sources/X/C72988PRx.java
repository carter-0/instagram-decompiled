package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PRx  reason: case insensitive filesystem */
public final class C72988PRx implements C315766kW {
    public Long A00;
    public final UserSession A01;
    public final AnonymousClass6WO A02;

    public final void Ew2(String str, String str2, Throwable th) {
        0qQ.A0B(str2, 1);
        ORW.A01(this.A01, (Long) null, "render_error", ORW.A00(this.A02), str2);
    }

    public final void Ew0(String str, String str2) {
        ORW.A01(this.A01, (Long) null, "render_error", ORW.A00(this.A02), str2);
    }

    public C72988PRx(UserSession userSession, AnonymousClass6WO r2) {
        this.A01 = userSession;
        this.A02 = r2;
    }
}
