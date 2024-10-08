package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.5Q1  reason: invalid class name */
public final class AnonymousClass5Q1 extends AnonymousClass5PL {
    public Set A00;
    public final int A01;
    public final C284945Oz A02;
    public final Set A03 = new LinkedHashSet();
    public final boolean A04;
    public final boolean A05;
    public final C286555Ww A06;
    public final /* synthetic */ C286565Wx A07;

    public AnonymousClass5Q1(C286565Wx r4, C286555Ww r5, int i, boolean z, boolean z2) {
        this.A07 = r4;
        this.A01 = i;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = r5;
        AnonymousClass5RL r2 = AnonymousClass5RL.A00;
        AnonymousClass5QM r1 = AnonymousClass5QM.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A02 = new ParcelableSnapshotMutableState(r1, r2);
    }

    public final void A0E() {
        Set<C286565Wx> set = this.A03;
        if (!set.isEmpty()) {
            Set<Set> set2 = this.A00;
            if (set2 != null) {
                for (C286565Wx r3 : set) {
                    for (Set remove : set2) {
                        remove.remove(r3.A0Y);
                    }
                }
            }
            set.clear();
        }
    }
}
