package X;

import com.instagram.user.model.User;

/* renamed from: X.Ju7  reason: case insensitive filesystem */
public final class C60949Ju7 extends AnonymousClass0T0 {
    public final User A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60949Ju7) {
                C60949Ju7 ju7 = (C60949Ju7) obj;
                if (!0qQ.A0K(this.A00, ju7.A00) || !0qQ.A0K(this.A02, ju7.A02) || !0qQ.A0K(this.A03, ju7.A03) || !0qQ.A0K(this.A01, ju7.A01) || this.A05 != ju7.A05 || !0qQ.A0K(this.A04, ju7.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A05, (((((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A04);
    }

    public C60949Ju7(User user, Integer num, String str, String str2, String str3, boolean z) {
        this.A00 = user;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A05 = z;
        this.A04 = str3;
    }
}
