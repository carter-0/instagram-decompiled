package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dsj  reason: case insensitive filesystem */
public final class C47197Dsj extends AnonymousClass0T0 implements G8X {
    public final List A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public C47197Dsj(User user, String str, String str2, List list) {
        AnonymousClass7TG.A0w(2, str, list, str2);
        this.A01 = user;
        this.A02 = str;
        this.A00 = list;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47197Dsj) {
                C47197Dsj dsj = (C47197Dsj) obj;
                if (!0qQ.A0K(this.A01, dsj.A01) || !0qQ.A0K(this.A02, dsj.A02) || !0qQ.A0K(this.A00, dsj.A00) || !0qQ.A0K(this.A03, dsj.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0C(this.A01) * 31)));
    }
}
