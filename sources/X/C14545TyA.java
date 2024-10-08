package X;

import android.util.LongSparseArray;

/* renamed from: X.TyA  reason: case insensitive filesystem */
public final class C14545TyA {
    public final LongSparseArray A00;
    public final LongSparseArray A01;
    public final C244943c0 A02;

    public C14545TyA(C244943c0 r6, C276544tV r7) {
        this.A02 = r6;
        int i = r7.A03;
        LongSparseArray longSparseArray = new LongSparseArray(r7.A0L().size());
        AnonymousClass0eM r3 = r6.A06;
        Long valueOf = Long.valueOf((long) i);
        ((C244933bz) r3.getValue()).A01(valueOf, longSparseArray);
        this.A01 = longSparseArray;
        this.A00 = (LongSparseArray) ((C244933bz) r3.getValue()).A00(valueOf);
    }
}
