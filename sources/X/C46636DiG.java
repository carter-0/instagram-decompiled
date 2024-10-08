package X;

import android.util.SparseArray;

/* renamed from: X.DiG  reason: case insensitive filesystem */
public final class C46636DiG implements AnonymousClass0lh {
    public int A00 = 0;
    public final SparseArray A01 = new SparseArray();
    public final Object A02 = new Object();

    public static C46636DiG A00(0lg r3) {
        return (C46636DiG) r3.A01(C46636DiG.class, new C51585FwZ(0));
    }

    public final int A01(Object obj) {
        int i;
        synchronized (this.A02) {
            SparseArray sparseArray = this.A01;
            i = this.A00;
            sparseArray.put(i, obj);
            this.A00 = i + 1;
        }
        return i;
    }

    public final Object A02(int i) {
        Object obj;
        synchronized (this.A02) {
            obj = this.A01.get(i);
        }
        return obj;
    }

    public final void A03(int i) {
        synchronized (this.A02) {
            this.A01.remove(i);
        }
    }

    public final void onSessionWillEnd() {
        synchronized (this.A02) {
            this.A01.clear();
        }
    }
}
