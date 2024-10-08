package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dt2  reason: case insensitive filesystem */
public final class C47215Dt2 extends AnonymousClass0T0 implements C51940G8j {
    public final User A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47215Dt2) {
                C47215Dt2 dt2 = (C47215Dt2) obj;
                if (!0qQ.A0K(this.A01, dt2.A01) || !0qQ.A0K(this.A00, dt2.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C47215Dt2(User user, List list) {
        AnonymousClass7TG.A1O(list, user);
        this.A01 = list;
        this.A00 = user;
    }
}
