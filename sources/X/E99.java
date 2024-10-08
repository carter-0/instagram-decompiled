package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class E99 extends 2Ru {
    public final AnonymousClass0iw A00;
    public final C47634EAu A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E99(AnonymousClass0iw r2, UserSession userSession, 0sP r4, 0sP r5) {
        super(false);
        0qQ.A0B(userSession, 1);
        this.A00 = r2;
        C47634EAu eAu = new C47634EAu(r2, userSession, r4, r5);
        this.A01 = eAu;
        DbU.A1Q(this, eAu);
    }

    public final void A00(List list) {
        clear();
        for (Object addModel : list) {
            addModel(addModel, this.A01);
        }
        notifyDataSetChanged();
    }
}
