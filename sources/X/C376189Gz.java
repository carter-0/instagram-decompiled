package X;

import android.os.Parcelable;
import com.instagram.direct.capabilities.Capabilities;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Gz  reason: invalid class name and case insensitive filesystem */
public abstract class C376189Gz {
    public static final Capabilities A00(List list) {
        0qQ.A0B(list, 0);
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C376179Gx r0 = (C376179Gx) it.next();
            0qQ.A0B(r0, 0);
            int i = r0.A00;
            if (i < 0) {
                bitSet.set(-i);
            } else {
                bitSet2.set(i);
            }
        }
        return new Capabilities(bitSet, bitSet2);
    }

    public static final Capabilities A01(long[] jArr) {
        BitSet bitSet = new BitSet(128);
        int i = 0;
        do {
            long j = jArr[i];
            int i2 = 0;
            do {
                if (((1 << i2) & j) != 0) {
                    bitSet.set((i * 64) + i2);
                }
                i2++;
            } while (i2 < 64);
            i++;
        } while (i < 2);
        Parcelable.Creator creator = Capabilities.CREATOR;
        return new Capabilities(new BitSet(), bitSet);
    }
}
