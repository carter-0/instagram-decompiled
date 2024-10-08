package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.7gc  reason: invalid class name and case insensitive filesystem */
public abstract class C337607gc {
    public static void A00(BitSet bitSet, String[] strArr, int i) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException(002.A0R(AnonymousClass000.A00(1036), Arrays.toString(arrayList.toArray())));
        }
    }
}
