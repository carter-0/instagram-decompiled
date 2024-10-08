package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.64v  reason: invalid class name and case insensitive filesystem */
public final class C3026764v {
    public long A00 = Long.MIN_VALUE;
    public long A01;
    public C287725af A02;
    public final long A03;
    public final C287805an A04;
    public final C284945Oz A05;
    public final C284945Oz A06;
    public final Object A07;
    public final C62320sa A08;

    public C3026764v(C287725af r6, C287805an r7, Object obj, Object obj2, C62320sa r10, long j, long j2) {
        this.A04 = r7;
        this.A07 = obj2;
        this.A03 = j2;
        this.A08 = r10;
        C284885Or r3 = C284885Or.A00;
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A06 = new ParcelableSnapshotMutableState(r3, obj);
        this.A02 = AnonymousClass6GZ.A00(r6);
        this.A01 = j;
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A05 = new ParcelableSnapshotMutableState(r3, true);
    }

    public final void A00() {
        this.A05.Epw(false);
        this.A08.invoke();
    }
}
