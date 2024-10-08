package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5Zh  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C287175Zh {
    public static final C284945Oz A00(C286575Wy r3, Object obj) {
        if (0fL.A02()) {
            0fL.A01(202151877, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object ECw = r3.ECw();
        if (ECw == AnonymousClass5XT.A00) {
            C284885Or r2 = C284885Or.A00;
            0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            AnonymousClass0eM r0 = C284905Ot.A01;
            ECw = new ParcelableSnapshotMutableState(r2, obj);
            ((C286565Wx) r3).A0Q(ECw);
        }
        C284945Oz r1 = (C284945Oz) ECw;
        r1.Epw(obj);
        if (0fL.A02()) {
            0fL.A00(-1585011926);
        }
        return r1;
    }
}
