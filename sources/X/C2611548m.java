package X;

import java.util.BitSet;
import java.util.Iterator;

/* renamed from: X.48m  reason: invalid class name and case insensitive filesystem */
public abstract class C2611548m {
    public static final void A00(Iterable iterable, BitSet bitSet) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bitSet.set(Character.toLowerCase(((String) it.next()).charAt(0)) % 30);
        }
    }
}
