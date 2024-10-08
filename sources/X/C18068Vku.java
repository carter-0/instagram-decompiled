package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vku  reason: case insensitive filesystem */
public final class C18068Vku {
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();

    public final void A03(User user) {
        User user2;
        this.A00.add(new C17966Vj0(user, false));
        List list = this.A01;
        Iterator it = list.iterator();
        while (true) {
            user2 = null;
            if (it.hasNext()) {
                User user3 = (C17966Vj0) it.next();
                if (user3 != null) {
                    user2 = user3.A01;
                }
                if (0qQ.A0K(user2, user)) {
                    user2 = user3;
                    break;
                }
            } else {
                break;
            }
        }
        list.remove(user2);
    }

    public final void A04(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            this.A01.add(new C17966Vj0(A0k, true));
            this.A00.remove(new C17966Vj0(A0k, false));
        }
    }

    public final ImmutableList A00() {
        return DbU.A0K(C256393vh.A02(new C19130WMl(0), this.A01));
    }

    public final void A01() {
        List<C17966Vj0> list = this.A01;
        for (C17966Vj0 vj0 : list) {
            if (vj0 != null) {
                vj0.A00 = false;
            }
            this.A00.add(vj0);
        }
        list.clear();
    }

    public final void A02(User user) {
        User user2;
        this.A01.add(new C17966Vj0(user, true));
        List list = this.A00;
        Iterator it = list.iterator();
        while (true) {
            user2 = null;
            if (it.hasNext()) {
                User user3 = (C17966Vj0) it.next();
                if (user3 != null) {
                    user2 = user3.A01;
                }
                if (0qQ.A0K(user2, user)) {
                    user2 = user3;
                    break;
                }
            } else {
                break;
            }
        }
        list.remove(user2);
    }
}
