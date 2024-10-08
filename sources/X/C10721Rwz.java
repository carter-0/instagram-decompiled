package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.Rwz  reason: case insensitive filesystem */
public final class C10721Rwz {
    public final ST1 A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final long[] A04;

    public C10721Rwz(ST1 st1, Map map, Map map2, Map map3) {
        this.A00 = st1;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ST1.A04(st1, treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = Pxg.A0H(it);
            i++;
        }
        this.A04 = jArr;
    }
}
