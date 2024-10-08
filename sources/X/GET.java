package X;

import com.instagram.user.model.User;

public final class GET extends AnonymousClass0T0 implements C59519JMr {
    public final C267324bN A00;
    public final User A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GET) {
                GET get = (GET) obj;
                if (!0qQ.A0K(this.A00, get.A00) || !0qQ.A0K(this.A01, get.A01) || this.A02 != get.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public GET(C267324bN r1, User user, boolean z) {
        this.A00 = r1;
        this.A01 = user;
        this.A02 = z;
    }
}
