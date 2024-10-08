package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class E96 extends 2Ru {
    public final EAM A00;
    public final List A01;
    public final List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E96(UserSession userSession, C319866rM r3, User user, List list, List list2) {
        super(false);
        AnonymousClass7TG.A1O(list, list2);
        0qQ.A0B(userSession, 5);
        this.A01 = list;
        this.A02 = list2;
        EAM eam = new EAM(userSession, r3, user);
        this.A00 = eam;
        DbU.A1Q(this, eam);
    }
}
