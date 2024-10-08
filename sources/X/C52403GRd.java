package X;

import com.instagram.user.model.User;

/* renamed from: X.GRd  reason: case insensitive filesystem */
public final class C52403GRd extends GRC {
    public final User A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52403GRd) {
                C52403GRd gRd = (C52403GRd) obj;
                if (!0qQ.A0K(this.A00, gRd.A00) || this.A01 != gRd.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C52403GRd(User user, int i) {
        super("mac_upsell", "content_type_mac_upsell");
        this.A00 = user;
        this.A01 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A01;
    }
}
