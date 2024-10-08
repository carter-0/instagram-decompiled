package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class E93 extends 2Ru {
    public final EA6 A00;
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E93(UserSession userSession, E35 e35, List list) {
        super(false);
        AnonymousClass7TG.A1Q(list, userSession);
        this.A01 = userSession;
        EA6 ea6 = new EA6(userSession, e35);
        this.A00 = ea6;
        DbU.A1Q(this, ea6);
        for (Object addModel : list) {
            addModel(addModel, this.A00);
        }
    }
}
