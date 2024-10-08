package X;

import android.util.LongSparseArray;
import android.util.SparseIntArray;

/* renamed from: X.4u6  reason: invalid class name and case insensitive filesystem */
public final class C276904u6 {
    public static C276904u6 A04;
    public static final C276914u7 A05 = new Object();
    public final LongSparseArray A00 = new LongSparseArray();
    public final LongSparseArray A01 = new LongSparseArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final 04u A03 = new 04u(0);

    public final synchronized void A00(G8K g8k) {
        int markerId = g8k.getMarkerId();
        LongSparseArray longSparseArray = this.A01;
        long j = (long) markerId;
        G8K g8k2 = (G8K) longSparseArray.get(j);
        if (g8k2 != null) {
            g8k.CmG("ttrc_marker_overlap", true);
            g8k2.CmG("ttrc_marker_overlap", true);
        }
        this.A00.put(g8k.CA9(), g8k);
        longSparseArray.put(j, g8k);
        SparseIntArray sparseIntArray = this.A02;
        sparseIntArray.put(markerId, sparseIntArray.get(markerId, 0) + 1);
        this.A03.add(Integer.valueOf(markerId));
    }

    public final synchronized void A01(G8K g8k) {
        int markerId = g8k.getMarkerId();
        this.A01.remove((long) markerId);
        this.A00.remove(g8k.CA9());
        SparseIntArray sparseIntArray = this.A02;
        int i = sparseIntArray.get(markerId);
        sparseIntArray.put(markerId, i - 1);
        if (i == 1) {
            this.A03.remove(Integer.valueOf(markerId));
        }
    }
}
