package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.6JE  reason: invalid class name */
public final class AnonymousClass6JE implements AnonymousClass6JF, AnonymousClass6JG, AnonymousClass6JH {
    public final C289495dh A00 = new ParcelableSnapshotMutableIntState(-1);
    public final C289495dh A01 = new ParcelableSnapshotMutableIntState(0);
    public final C284945Oz A02;
    public final C284945Oz A03;
    public final Object A04;
    public final AnonymousClass6HC A05;

    public final AnonymousClass6JE E2i() {
        AnonymousClass6JE r1;
        C289495dh r2 = this.A01;
        if (r2.BI6() == 0) {
            this.A05.A00.add(this);
            AnonymousClass6JG r0 = (AnonymousClass6JG) this.A02.getValue();
            if (r0 != null) {
                r1 = r0.E2i();
            } else {
                r1 = null;
            }
            this.A03.Epw(r1);
        }
        r2.EZz(r2.BI6() + 1);
        return this;
    }

    public final void release() {
        C289495dh r1 = this.A01;
        if (r1.BI6() > 0) {
            r1.EZz(r1.BI6() - 1);
            if (r1.BI6() == 0) {
                this.A05.A00.remove(this);
                C284945Oz r12 = this.A03;
                AnonymousClass6JF r0 = (AnonymousClass6JF) r12.getValue();
                if (r0 != null) {
                    r0.release();
                }
                r12.Epw((Object) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once");
    }

    public AnonymousClass6JE(AnonymousClass6HC r5, Object obj) {
        this.A04 = obj;
        this.A05 = r5;
        AnonymousClass0eM r0 = C284905Ot.A01;
        C284885Or r2 = C284885Or.A00;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = new ParcelableSnapshotMutableState(r2, (Object) null);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = new ParcelableSnapshotMutableState(r2, (Object) null);
    }
}
