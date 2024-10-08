package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.6Gz  reason: invalid class name and case insensitive filesystem */
public final class C305216Gz implements C305096Gn {
    public final AnonymousClass6H2 A00 = new AnonymousClass6H2();
    public final AnonymousClass6H1 A01 = new AnonymousClass6H0(this);
    public final C284945Oz A02;
    public final C284945Oz A03;
    public final C284945Oz A04;
    public final 0sP A05;

    public final Object EKT(C54609HKs hKs, AnonymousClass4D7 r8, 0sL r9) {
        Object A002 = 19E.A00(r8, new AnonymousClass9KF(this, hKs, r9, (AnonymousClass4D7) null, 1));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final float APi(float f) {
        return ((Number) this.A05.invoke(Float.valueOf(f))).floatValue();
    }

    public final /* synthetic */ boolean AkV() {
        return true;
    }

    public final /* synthetic */ boolean AkW() {
        return true;
    }

    public final boolean CbH() {
        return ((Boolean) this.A04.getValue()).booleanValue();
    }

    public C305216Gz(0sP r5) {
        this.A05 = r5;
        C284885Or r2 = C284885Or.A00;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A04 = new ParcelableSnapshotMutableState(r2, false);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = new ParcelableSnapshotMutableState(r2, false);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = new ParcelableSnapshotMutableState(r2, false);
    }
}
