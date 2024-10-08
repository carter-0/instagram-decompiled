package X;

import com.instagram.user.model.User;

public final class IOT implements C232262tL {
    public final User A00;

    public IOT(User user) {
        0qQ.A0B(user, 1);
        this.A00 = user;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        IOT iot = (IOT) obj;
        User user2 = this.A00;
        if (iot != null) {
            user = iot.A00;
        } else {
            user = null;
        }
        return 0qQ.A0K(user2, user);
    }
}
