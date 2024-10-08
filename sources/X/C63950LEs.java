package X;

import com.instagram.user.model.User;

/* renamed from: X.LEs  reason: case insensitive filesystem */
public final class C63950LEs {
    public final User A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.UserSourcePair");
        return 0qQ.A0K(this.A00, ((C63950LEs) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C63950LEs(User user, Integer num) {
        this.A00 = user;
        this.A01 = num;
    }
}
