package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Rpd  reason: case insensitive filesystem */
public final class C10279Rpd {
    public final Map A00 = AnonymousClass7TE.A1E();

    public C10279Rpd(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("zzc");
        }
    }
}
