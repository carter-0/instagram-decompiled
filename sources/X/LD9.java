package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public final class LD9 {
    public final UserSession A00;
    public final LinkedList A01;
    public final Set A02;

    public /* synthetic */ LD9(UserSession userSession) {
        LinkedList linkedList = new LinkedList();
        LinkedHashSet A0y = DbS.A0y();
        this.A01 = linkedList;
        this.A02 = A0y;
        this.A00 = userSession;
    }

    public final void A00(Collection collection) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : collection) {
            DbV.A1U(next, A1C, this.A02.contains(next) ? 1 : 0);
        }
        if (AnonymousClass7TE.A1b(A1C)) {
            this.A02.addAll(A1C);
            this.A01.addAll(0, A1C);
        }
    }
}
