package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.6Gv  reason: invalid class name and case insensitive filesystem */
public final class C305176Gv implements C270284gU {
    public int A00;
    public final C284945Oz A01;
    public final int A02;
    public final int A03;

    public final void A00(int i) {
        if (i != this.A00) {
            this.A00 = i;
            int i2 = this.A03;
            int i3 = this.A02;
            int i4 = (i / i2) * i2;
            this.A01.Epw(C229632nm.A0C(Math.max(i4 - i3, 0), i4 + i2 + i3));
        }
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A01.getValue();
    }

    public C305176Gv(int i, int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
        int i4 = (i / i2) * i2;
        2HY A0C = C229632nm.A0C(Math.max(i4 - i3, 0), i4 + i2 + i3);
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A01 = new ParcelableSnapshotMutableState(r1, A0C);
        this.A00 = i;
    }
}
