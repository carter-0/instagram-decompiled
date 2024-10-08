package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class E95 extends 2Ru {
    public final UserSession A00;
    public final EA7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E95(UserSession userSession, User user, List list) {
        super(false);
        AnonymousClass7TF.A1D(list, 3, userSession);
        this.A00 = userSession;
        EA7 ea7 = new EA7(userSession, user);
        this.A01 = ea7;
        DbU.A1Q(this, ea7);
        for (Object addModel : list) {
            addModel(addModel, this.A01);
        }
    }
}
