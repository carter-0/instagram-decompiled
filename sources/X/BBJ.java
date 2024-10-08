package X;

import com.instagram.user.model.User;

public final class BBJ extends AnonymousClass0T0 {
    public final int A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final boolean A06;

    public BBJ(User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, boolean z) {
        0qQ.A0B(user, 7);
        this.A00 = i;
        this.A06 = z;
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A05 = bool4;
        this.A01 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBJ) {
                BBJ bbj = (BBJ) obj;
                if (this.A00 != bbj.A00 || this.A06 != bbj.A06 || !0qQ.A0K(this.A02, bbj.A02) || !0qQ.A0K(this.A03, bbj.A03) || !0qQ.A0K(this.A04, bbj.A04) || !0qQ.A0K(this.A05, bbj.A05) || !0qQ.A0K(this.A01, bbj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        return AnonymousClass7TE.A0N(this.A01, (((((((AnonymousClass7TF.A09(this.A06, i) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31);
    }
}
