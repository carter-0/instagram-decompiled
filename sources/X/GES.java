package X;

import com.instagram.user.model.User;

public final class GES extends AnonymousClass0T0 implements C59518JMq {
    public final C267324bN A00;
    public final User A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GES) {
                GES ges = (GES) obj;
                if (!0qQ.A0K(this.A00, ges.A00) || !0qQ.A0K(this.A01, ges.A01) || this.A02 != ges.A02) {
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

    public GES(C267324bN r1, User user, boolean z) {
        this.A00 = r1;
        this.A01 = user;
        this.A02 = z;
    }
}
