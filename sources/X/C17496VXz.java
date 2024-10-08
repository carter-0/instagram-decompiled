package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.VXz  reason: case insensitive filesystem */
public final class C17496VXz {
    public final C21012X9o A00;
    public final C21017X9t A01;
    public final User A02;
    public final String A03;

    public C17496VXz(C21017X9t x9t) {
        0qQ.A0B(x9t, 1);
        this.A01 = x9t;
        UMz uMz = (UMz) x9t;
        User user = uMz.A01;
        this.A02 = user;
        this.A03 = uMz.A05;
        this.A00 = uMz.A00;
        if (user != null) {
            boolean z = false;
            user.A19(AnonymousClass7TG.A1X(uMz.A03));
            user.A13(false);
            user.A12(AnonymousClass7TG.A1X(uMz.A02));
            Boolean bool = uMz.A04;
            user.A1H(bool != null ? bool.booleanValue() : z);
            if (AnonymousClass7TF.A1Y(bool, true)) {
                user.A0n(FollowStatus.A07);
            }
        }
    }
}
