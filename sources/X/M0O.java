package X;

import com.instagram.user.model.User;

public final class M0O implements MVW {
    public final User A00;
    public final String A01;

    public M0O(User user, String str) {
        0qQ.A0B(user, 1);
        this.A00 = user;
        this.A01 = str;
    }

    public final C62584KiH BNP() {
        return C62584KiH.A0F;
    }

    public final User CCd() {
        return this.A00;
    }

    public final String getText() {
        return this.A01;
    }

    public final long AsD() {
        return JTR.A0L();
    }

    public final String getPk() {
        return String.valueOf(super.hashCode());
    }
}
