package X;

import com.instagram.user.model.User;

/* renamed from: X.NVw  reason: case insensitive filesystem */
public final class C68761NVw extends C69587NoV {
    public final User A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68761NVw) {
                C68761NVw nVw = (C68761NVw) obj;
                if (!0qQ.A0K(this.A00, nVw.A00) || !0qQ.A0K(this.A01, nVw.A01) || this.A02 != nVw.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31);
    }

    public C68761NVw(User user, String str, boolean z) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = z;
    }
}
