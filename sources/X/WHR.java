package X;

import android.util.SparseArray;
import java.util.Iterator;

public final class WHR implements X9F {
    public final SparseArray A00 = new SparseArray();
    public final VXW A01;
    public final boolean A02;

    public final synchronized C249903kY Afy(int i, int i2, int i3) {
        X0P x0p;
        if (this.A02) {
            VXW vxw = this.A01;
            do {
                synchronized (vxw) {
                    x0p = null;
                    Iterator it = vxw.A01.iterator();
                    if (it.hasNext()) {
                        x0p = (X0P) it.next();
                        it.remove();
                    }
                }
            } while (x0p != null);
        }
        return null;
    }

    public final synchronized C249903kY AjM(int i) {
        return null;
    }

    public final synchronized C249903kY B3s(int i) {
        return null;
    }

    public final synchronized void DGs(C249903kY r4, int i, int i2) {
        C15004UJe uJe = new C15004UJe(r4, C240593Lm.A03);
        C249903kY.A01(C249903kY.A00(C249903kY.A05, C249903kY.A06, uJe));
    }

    public final synchronized void DGy(C249903kY r5, int i, int i2) {
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            C249903kY r0 = (C249903kY) sparseArray.get(i);
            if (r0 != null) {
                sparseArray.delete(i);
                r0.close();
            }
            C15004UJe uJe = new C15004UJe(r5, C240593Lm.A03);
            C249903kY.A01(C249903kY.A00(C249903kY.A05, C249903kY.A06, uJe));
        }
    }

    public final synchronized void clear() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                C249903kY.A01((C249903kY) sparseArray.valueAt(i));
                i++;
            } else {
                sparseArray.clear();
            }
        }
    }

    public final synchronized boolean contains(int i) {
        return false;
    }

    public WHR(VXW vxw, boolean z) {
        this.A01 = vxw;
        this.A02 = z;
    }
}
