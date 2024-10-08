package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5i2  reason: invalid class name and case insensitive filesystem */
public final class C291885i2 implements C291875i1 {
    public C270284gU A00;

    public C291885i2() {
        C270284gU r0;
        if (C13993Tnu.A09 != null) {
            r0 = A00(this);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public static final C270284gU A00(C291885i2 r5) {
        C270284gU r3;
        C13993Tnu A002 = C13993Tnu.A00();
        if (A002.A01() == 1) {
            r3 = new C291895i3(true);
        } else {
            C284885Or r1 = C284885Or.A00;
            0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            AnonymousClass0eM r0 = C284905Ot.A01;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(r1, false);
            A002.A04(new C14760U7r(parcelableSnapshotMutableState, r5));
            r3 = parcelableSnapshotMutableState;
        }
        return r3;
    }
}
