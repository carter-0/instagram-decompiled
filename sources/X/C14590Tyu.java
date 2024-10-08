package X;

import android.util.SparseArray;

/* renamed from: X.Tyu  reason: case insensitive filesystem */
public final class C14590Tyu implements C13669Ted {
    public final /* synthetic */ C244943c0 A00;
    public final /* synthetic */ C276544tV A01;

    public C14590Tyu(C244943c0 r1, C276544tV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean FN7(C276544tV r6) {
        C244943c0 r0 = this.A00;
        0qQ.A0B(r6, 0);
        C244933bz r3 = (C244933bz) r0.A06.getValue();
        Integer valueOf = Integer.valueOf(r6.A03);
        Object A002 = r3.A00(valueOf);
        if ((A002 instanceof SparseArray) && A002 != null) {
            r3.A01(valueOf, A002);
        }
        Object A003 = r3.A00(r6);
        if (A003 != null) {
            r3.A01(r6, A003);
        }
        return false;
    }
}
