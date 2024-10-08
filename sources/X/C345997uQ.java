package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.7uQ  reason: invalid class name and case insensitive filesystem */
public final class C345997uQ {
    public int A00 = 4;
    public final int A01 = 5;
    public final List A02;
    public final Map A03;

    public C345997uQ(List list, Map map) {
        this.A03 = Collections.unmodifiableMap(map);
        this.A02 = list;
    }
}
