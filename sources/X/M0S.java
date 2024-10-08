package X;

import com.instagram.user.model.User;
import java.util.List;

public final class M0S implements MVW {
    public String A00;
    public List A01;
    public final User A02;

    public final C62584KiH BNP() {
        return C62584KiH.A0N;
    }

    public final User CCd() {
        return this.A02;
    }

    public final String getText() {
        return this.A00;
    }

    public M0S(User user, String str, List list) {
        AnonymousClass7TG.A1Q(list, str);
        this.A02 = user;
        this.A01 = list;
        this.A00 = str;
    }

    public final long AsD() {
        return JTR.A0L();
    }

    public final String getPk() {
        return String.valueOf(super.hashCode());
    }
}
