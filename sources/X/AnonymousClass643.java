package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.643  reason: invalid class name */
public final class AnonymousClass643 {
    public Integer A00;
    public final AnonymousClass642 A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public AnonymousClass643(AnonymousClass642 r4, String str, String str2, Map map, Set set) {
        Set unmodifiableSet = Collections.unmodifiableSet(set);
        this.A05 = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.A04 = map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r4 == null ? AnonymousClass642.A00 : r4;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("zaa");
        } else {
            this.A06 = Collections.unmodifiableSet(hashSet);
        }
    }
}
