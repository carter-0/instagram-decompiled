package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class FFJ {
    public static final ArrayList A00(UserSession userSession, List list) {
        User A00;
        ArrayList A0q = AnonymousClass7TF.A0q(userSession, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            if (A0f.A0S()) {
                if (A0f.A0T()) {
                    A00 = AnonymousClass7TF.A0Q(userSession);
                } else {
                    PendingRecipient A0W = DbY.A0W(A0f, 0);
                    0qQ.A0A(A0W);
                    A00 = AnonymousClass48M.A00(userSession, A0W);
                }
                A0q.add(A00);
            }
        }
        return A0q;
    }

    public static final ArrayList A01(List list) {
        0qQ.A0B(list, 0);
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            if (!A0f.A0T()) {
                A0y.addAll(DbW.A0m(A0f));
            }
        }
        return AnonymousClass7TE.A1D(A0y);
    }

    public static final ArrayList A02(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            if (A0f.A0S()) {
                String A09 = A0f.A09();
                0qQ.A07(A09);
                A0q.add(A09);
            }
        }
        return A0q;
    }

    public static final List A03(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new DirectShareTarget(DbT.A0k(it)));
        }
        return A0r;
    }
}
