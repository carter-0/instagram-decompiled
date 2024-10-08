package X;

import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.7eb  reason: invalid class name and case insensitive filesystem */
public abstract class C336427eb {
    @Deprecated(message = "Use newer extension method #nameMatchesQuery combine with Iterable#filter")
    public static final void A00(1UV r3, String str, Collection collection, Set set) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            if (C336437ec.A00(user, str) && (r3 == null || r3.apply(user))) {
                set.add(user);
            }
        }
    }
}
