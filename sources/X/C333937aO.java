package X;

import com.instagram.user.model.User;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7aO  reason: invalid class name and case insensitive filesystem */
public final class C333937aO {
    public boolean A00;
    public final Deque A01 = new LinkedList();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public final void A01(User user) {
        0qQ.A0B(user, 0);
        Set set = this.A02;
        if (set.contains(user.getId())) {
            set.remove(user.getId());
            this.A01.remove(user);
            A00();
        }
    }

    public final void A02(C41800B1f b1f) {
        0qQ.A0B(b1f, 0);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null || obj == b1f) {
                it.remove();
            }
        }
    }

    public final void A03(List list) {
        this.A00 = true;
        Deque deque = this.A01;
        deque.clear();
        Set set = this.A02;
        set.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            deque.add(user);
            set.add(user.getId());
        }
        A00();
    }

    public final void A00() {
        for (Reference reference : this.A03) {
            C41800B1f b1f = (C41800B1f) reference.get();
            if (b1f != null) {
                b1f.Dwk(new ArrayList(this.A01));
            }
        }
    }
}
