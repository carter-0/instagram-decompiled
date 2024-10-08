package X;

import android.util.SparseArray;

/* renamed from: X.7sJ  reason: invalid class name and case insensitive filesystem */
public final class C344717sJ {
    public final SparseArray A00 = new SparseArray();
    public final C344407ro A01;
    public final SparseArray A02 = new SparseArray();

    public final void A01(C345137sz r13, C345097sv r14) {
        try {
            C349257zq.A03("sendOutputData");
            C345037sp r3 = (C345037sp) this.A00.get(0);
            if (r3 == null) {
                this.A01.A00(C368978td.GL_COPY_RENDERER_SKIP_OUTPUT_NOT_SET);
            } else {
                C345097sv r7 = r14;
                if (r14 != null) {
                    r14.BZY();
                    C345137sz A002 = C345037sp.A00(r3, r13);
                    C345897uG A012 = r3.A01.A01();
                    boolean z = r3.A07;
                    if (r3.A02 == null) {
                        C361218fr r0 = new C361218fr(r3.A05);
                        r3.A02 = r0;
                        r0.ACn(A012);
                    }
                    C361218fr r4 = r3.A02;
                    if (z) {
                        r4.A01(A012, A002, r7, (C345057sr) null, true, false, false);
                        C345037sp.A01(r3);
                    } else {
                        r4.A00(A012, A002, r14);
                    }
                } else {
                    r3.A03(r13);
                }
            }
        } finally {
            C349257zq.A01();
        }
    }

    public static C345037sp A00(C344567s4 r3, C344717sJ r4, int i) {
        SparseArray sparseArray = r4.A00;
        C345037sp r1 = (C345037sp) sparseArray.get(i);
        if (r1 == null) {
            synchronized (sparseArray) {
                r1 = (C345037sp) sparseArray.get(i);
                if (r1 == null) {
                    r1 = new C345037sp(r4.A01);
                    sparseArray.put(i, r1);
                }
            }
        }
        if (!r3.A07.A00.contains(r1)) {
            r3.A03(r1);
        }
        return r1;
    }

    public C344717sJ(C344407ro r2) {
        this.A01 = r2;
    }
}
