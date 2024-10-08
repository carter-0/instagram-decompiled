package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dsm  reason: case insensitive filesystem */
public final class C47200Dsm extends AnonymousClass0T0 implements MWF {
    public final User A00;
    public final List A01;
    public final List A02;
    public final int A03;

    public C47200Dsm(User user, List list, List list2, int i) {
        0qQ.A0B(list, 3);
        this.A03 = i;
        this.A00 = user;
        this.A01 = list;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47200Dsm) {
                C47200Dsm dsm = (C47200Dsm) obj;
                if (this.A03 != dsm.A03 || !0qQ.A0K(this.A00, dsm.A00) || !0qQ.A0K(this.A01, dsm.A01) || !0qQ.A0K(this.A02, dsm.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, ((this.A03 * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
