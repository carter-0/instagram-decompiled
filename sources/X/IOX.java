package X;

import com.instagram.user.model.User;

public final class IOX implements C232262tL {
    public final User A00;
    public final String A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String A002 = AnonymousClass3ZA.A00(this.A00);
        if (A002 == null) {
            return "";
        }
        return A002;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        IOX iox = (IOX) obj;
        0qQ.A0B(iox, 0);
        if (!0qQ.A0K(this.A00, iox.A00) || !0qQ.A0K(this.A01, iox.A01) || this.A02 != iox.A02) {
            return false;
        }
        return true;
    }

    public IOX(User user, String str, boolean z) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = z;
    }
}
