package X;

import com.instagram.user.model.User;

public final class M0R implements MVW {
    public boolean A00;
    public final User A01;
    public final String A02;

    public M0R(User user, String str) {
        0qQ.A0B(user, 1);
        this.A01 = user;
        this.A02 = str;
    }

    public final C62584KiH BNP() {
        if (this.A00) {
            return C62584KiH.A0E;
        }
        return C62584KiH.A0D;
    }

    public final User CCd() {
        return this.A01;
    }

    public final String getText() {
        return this.A02;
    }

    public final long AsD() {
        return JTR.A0L();
    }

    public final String getPk() {
        return String.valueOf(super.hashCode());
    }
}
