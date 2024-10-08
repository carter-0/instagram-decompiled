package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LZy  reason: case insensitive filesystem */
public final class C64323LZy implements 2YM {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C3499582p A01;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public C64323LZy(UserSession userSession, C3499582p r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final 2YL create(Class cls) {
        return new QDV(this.A00, this.A01);
    }
}
