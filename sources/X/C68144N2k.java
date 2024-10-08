package X;

import com.instagram.user.model.User;

/* renamed from: X.N2k  reason: case insensitive filesystem */
public final class C68144N2k extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final User A04;

    public C68144N2k(User user, float f, float f2, float f3, int i) {
        0qQ.A0B(user, 5);
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A04 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68144N2k) {
                C68144N2k n2k = (C68144N2k) obj;
                if (!(this.A03 == n2k.A03 && Float.compare(this.A00, n2k.A00) == 0 && Float.compare(this.A01, n2k.A01) == 0 && Float.compare(this.A02, n2k.A02) == 0 && 0qQ.A0K(this.A04, n2k.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(this.A03 * 31, this.A00), this.A01), this.A02));
    }
}
