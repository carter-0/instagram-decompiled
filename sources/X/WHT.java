package X;

import android.util.SparseArray;

public final class WHT implements X8H {
    public final int A00;

    public final void E45(XBU xbu, X9F x9f, VZ6 vz6, C62320sa r14, int i) {
        int i2 = this.A00;
        int i3 = 1;
        while (true) {
            XBU xbu2 = xbu;
            int frameCount = (i + i3) % xbu.getFrameCount();
            int A0K = AnonymousClass7TE.A0K(xbu) + frameCount;
            VZ6 vz62 = vz6;
            SparseArray sparseArray = vz6.A01;
            synchronized (sparseArray) {
                if (sparseArray.get(A0K) == null) {
                    X9F x9f2 = x9f;
                    if (!x9f.contains(frameCount)) {
                        C20364Wq3 wq3 = new C20364Wq3(xbu2, x9f2, vz62, frameCount, A0K);
                        sparseArray.put(A0K, wq3);
                        vz6.A04.execute(wq3);
                    }
                }
            }
            if (i3 != i2) {
                i3++;
            } else {
                return;
            }
        }
    }

    public final void onStop() {
    }

    public WHT(int i) {
        this.A00 = i;
    }

    public final C249903kY Afx(int i, int i2, int i3) {
        return null;
    }

    public final void E44(C62320sa r1, int i, int i2) {
    }

    public WHT() {
        this(3);
    }
}
