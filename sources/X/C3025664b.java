package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1;

/* renamed from: X.64b  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C3025664b {
    public static final AnonymousClass05E A02(C62320sa r2) {
        return new AnonymousClass05E(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1((AnonymousClass4D7) null, r2));
    }

    public static final C284945Oz A00(C286575Wy r6, Object obj, 19B r8, AnonymousClass0r6 r9, int i) {
        if ((i & 2) != 0) {
            r8 = 19B.A00;
        }
        if (0fL.A02()) {
            0fL.A01(-556827611, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean AGw = r6.AGw(r8) | r6.AGw(r9);
        Object ECw = r6.ECw();
        if (AGw || ECw == AnonymousClass5XT.A00) {
            ECw = new MHP((Object) r8, (Object) r9, (AnonymousClass4D7) null, 18);
            r6.FLL(ECw);
        }
        if (0fL.A02()) {
            0fL.A01(473502065, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object ECw2 = r6.ECw();
        Object obj2 = AnonymousClass5XT.A00;
        if (ECw2 == obj2) {
            C284885Or r1 = C284885Or.A00;
            0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            AnonymousClass0eM r0 = C284905Ot.A01;
            ECw2 = new ParcelableSnapshotMutableState(r1, obj);
            ((C286565Wx) r6).A0Q(ECw2);
        }
        C284945Oz r2 = (C284945Oz) ECw2;
        boolean AGw2 = r6.AGw(ECw);
        Object ECw3 = r6.ECw();
        if (AGw2 || ECw3 == obj2) {
            ECw3 = new MHP(ECw, (Object) r2, (AnonymousClass4D7) null, 16);
            r6.FLL(ECw3);
        }
        C286645Xf.A02(r6, r9, r8, (0sL) ECw3);
        if (0fL.A02()) {
            0fL.A00(-652149609);
        }
        if (0fL.A02()) {
            0fL.A00(1281785150);
        }
        return r2;
    }

    public static final C270284gU A01(C286575Wy r3, AnonymousClass0Ud r4) {
        19B r2 = 19B.A00;
        if (0fL.A02()) {
            0fL.A01(-2088893856, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        C284945Oz A00 = A00(r3, r4.getValue(), r2, r4, 0);
        if (0fL.A02()) {
            0fL.A00(955441152);
        }
        return A00;
    }
}
