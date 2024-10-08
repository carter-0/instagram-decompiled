package X;

import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.Jva  reason: case insensitive filesystem */
public final class C61036Jva extends AnonymousClass0T0 {
    public boolean A00;
    public boolean A01;
    public final User A02;

    public C61036Jva(User user, boolean z, boolean z2) {
        0qQ.A0B(user, 1);
        this.A02 = user;
        this.A01 = z;
        this.A00 = z2;
    }

    public static void A00(K9H k9h, Iterator it) {
        C61036Jva jva = (C61036Jva) it.next();
        boolean z = k9h.A04;
        User user = jva.A02;
        boolean z2 = jva.A01;
        0qQ.A0B(user, 0);
        k9h.addModel(new C61036Jva(user, z2, z), k9h.A08);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61036Jva)) {
            return false;
        }
        return 0qQ.A0K(this.A02, ((C61036Jva) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C61036Jva) it.next()).A02.getId());
    }

    public static void A02(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C61036Jva) it.next()).A02);
    }
}
