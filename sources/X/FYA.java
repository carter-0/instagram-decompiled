package X;

import com.instagram.user.model.User;
import java.util.List;

public final class FYA implements C232262tL {
    public final User A00;
    public final List A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        FYA fya = (FYA) obj;
        User user2 = this.A00;
        if (fya != null) {
            user = fya.A00;
        } else {
            user = null;
        }
        return 0qQ.A0K(user2, user);
    }

    public FYA(User user, List list) {
        AnonymousClass7TG.A1O(user, list);
        this.A00 = user;
        this.A01 = list;
    }
}
