package X;

import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.A8h  reason: case insensitive filesystem */
public abstract class C39767A8h {
    public final C333937aO A00;

    public final void A00(User user) {
        boolean z = this instanceof C390189qs;
        0qQ.A0B(user, 0);
        if (z) {
            this.A00.A01(user);
            return;
        }
        C333937aO r2 = this.A00;
        Set set = r2.A02;
        if (!set.contains(user.getId())) {
            set.add(user.getId());
            r2.A01.push(user);
            r2.A00();
        }
    }

    public C39767A8h(C333937aO r1) {
        this.A00 = r1;
    }
}
