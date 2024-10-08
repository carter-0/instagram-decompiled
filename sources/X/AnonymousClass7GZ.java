package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7GZ  reason: invalid class name */
public final class AnonymousClass7GZ implements 2YM {
    public final UserSession A00;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.isAssignableFrom(C328737Ga.class)) {
            UserSession userSession = this.A00;
            return new C328737Ga(userSession, C294695ms.A00(userSession));
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }

    public AnonymousClass7GZ(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        0qQ.A0B(cls, 1);
        return create(cls);
    }
}
