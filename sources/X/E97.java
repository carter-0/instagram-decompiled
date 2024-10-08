package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class E97 extends 2Ru {
    public final EAN A00;
    public final UserSession A01;
    public final 0sL A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E97(UserSession userSession, List list, 0sL r6) {
        super(false);
        AnonymousClass7TG.A1Q(list, userSession);
        this.A01 = userSession;
        this.A02 = r6;
        EAN ean = new EAN(userSession, r6, list.size() <= 1);
        this.A00 = ean;
        DbU.A1Q(this, ean);
        for (Object addModel : list) {
            addModel(addModel, this.A00);
        }
    }
}
