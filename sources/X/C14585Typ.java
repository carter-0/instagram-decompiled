package X;

import android.util.LongSparseArray;

/* renamed from: X.Typ  reason: case insensitive filesystem */
public final class C14585Typ {
    public final LongSparseArray A00;
    public final C244933bz A01;

    public final C307996Sh A00(C276544tV r5, boolean z) {
        0qQ.A0B(r5, 0);
        long A0A = (long) Pxf.A0A(Integer.valueOf(r5.A03), Boolean.valueOf(z));
        C307996Sh r0 = (C307996Sh) this.A00.get(A0A);
        if (r0 != null) {
            return r0;
        }
        C307996Sh r02 = (C307996Sh) this.A01.A00(Long.valueOf(A0A));
        if (r02 == null) {
            return null;
        }
        return r02;
    }

    public C14585Typ(C244943c0 r3, C276544tV r4) {
        this.A00 = new LongSparseArray(r4.A0L().size());
        this.A01 = (C244933bz) r3.A06.getValue();
    }

    public final void A01(C307996Sh r5, C276544tV r6, boolean z) {
        AnonymousClass7TG.A1N(r6, r5);
        long A0A = (long) Pxf.A0A(Integer.valueOf(r6.A03), Boolean.valueOf(z));
        this.A00.put(A0A, r5);
        this.A01.A01(Long.valueOf(A0A), r5);
    }
}
