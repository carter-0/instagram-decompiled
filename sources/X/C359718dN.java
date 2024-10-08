package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.8dN  reason: invalid class name and case insensitive filesystem */
public abstract class C359718dN {
    public static void A00(BitSet bitSet, String[] strArr) {
        int i = 0;
        if (bitSet.nextClearBit(0) < 2) {
            ArrayList arrayList = new ArrayList();
            do {
                if (!bitSet.get(i)) {
                    arrayList.add(strArr[i]);
                }
                i++;
            } while (i < 2);
            throw new IllegalStateException(002.A0R(AnonymousClass000.A00(1036), Arrays.toString(arrayList.toArray())));
        }
    }
}
