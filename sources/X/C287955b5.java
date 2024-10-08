package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5b5  reason: invalid class name and case insensitive filesystem */
public final class C287955b5 implements C270284gU {
    public long A00;
    public long A01;
    public C287725af A02;
    public boolean A03;
    public final C287805an A04;
    public final C284945Oz A05;

    public final Object A00() {
        return ((C287795am) this.A04).A00.invoke(this.A02);
    }

    public final Object getValue() {
        return this.A05.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationState(value=");
        sb.append(this.A05.getValue());
        sb.append(", velocity=");
        sb.append(A00());
        sb.append(", isRunning=");
        sb.append(this.A03);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.A01);
        sb.append(", finishedTimeNanos=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C287955b5(C287725af r3, C287805an r4, Object obj, long j, long j2, boolean z) {
        C287725af r0;
        this.A04 = r4;
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r02 = C284905Ot.A01;
        this.A05 = new ParcelableSnapshotMutableState(r1, obj);
        if (r3 != null) {
            r0 = AnonymousClass6GZ.A00(r3);
        } else {
            r0 = (C287725af) ((C287795am) r4).A01.invoke(obj);
            r0.A02();
        }
        this.A02 = r0;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }
}
