package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3PX  reason: invalid class name */
public final class AnonymousClass3PX {
    public static final C61480nO A01;
    public static final AnonymousClass3PY A02 = new Object();
    public final C252103oZ A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3PY] */
    static {
        C61620nx A002 = C61610nw.A00();
        A002.A01 = AnonymousClass3PZ.A00;
        A01 = new AnonymousClass0vF(A002);
    }

    public AnonymousClass3PX(UserSession userSession, int i, int i2, long j) {
        this.A00 = new C252103oZ(userSession, i2, ((long) i) * 3600000, j);
    }
}
