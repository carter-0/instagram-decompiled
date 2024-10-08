package X;

import com.instagram.api.schemas.ThreadHeaderContextType;
import com.instagram.user.model.User;

public final class BBD extends AnonymousClass0T0 {
    public final ThreadHeaderContextType A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBD) {
                BBD bbd = (BBD) obj;
                if (this.A00 != bbd.A00 || !0qQ.A0K(this.A02, bbd.A02) || !0qQ.A0K(this.A03, bbd.A03) || !0qQ.A0K(this.A01, bbd.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BBD(ThreadHeaderContextType threadHeaderContextType, User user, String str, String str2) {
        AnonymousClass7TG.A1O(threadHeaderContextType, str);
        this.A00 = threadHeaderContextType;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = user;
    }
}
