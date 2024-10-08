package androidx.compose.runtime;

import X.0qQ;
import X.AnonymousClass5Ow;
import X.AnonymousClass5P0;
import X.AnonymousClass5P1;
import X.AnonymousClass5P2;
import X.AnonymousClass5P3;
import X.AnonymousClass5PH;
import X.AnonymousClass5QM;
import X.C284885Or;
import X.C284895Os;
import X.C284935Oy;
import X.C305206Gy;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

public final class ParcelableSnapshotMutableState extends AnonymousClass5Ow implements Parcelable, C284935Oy {
    public static final Parcelable.Creator CREATOR = new AnonymousClass5P0();
    public AnonymousClass5P1 A00;
    public final C284895Os A01;

    public final int describeContents() {
        return 0;
    }

    public final AnonymousClass5P2 B6D() {
        return this.A00;
    }

    public final C284895Os BdR() {
        return this.A01;
    }

    public final void E4K(AnonymousClass5P2 r2) {
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.A00 = (AnonymousClass5P1) r2;
    }

    public final void Epw(Object obj) {
        Snapshot A002;
        AnonymousClass5P1 r3 = (AnonymousClass5P1) AnonymousClass5P3.A08(this.A00);
        if (!this.A01.ASs(r3.A00, obj)) {
            AnonymousClass5P1 r0 = this.A00;
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                ((AnonymousClass5P1) AnonymousClass5P3.A03(A002, this, r0, r3)).A00 = obj;
            }
            AnonymousClass5P3.A0H(A002, this);
        }
    }

    public final Object getValue() {
        return ((AnonymousClass5P1) AnonymousClass5P3.A07(this, this.A00)).A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MutableState(value=");
        sb.append(((AnonymousClass5P1) AnonymousClass5P3.A08(this.A00)).A00);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5P2, X.5P1] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.5P2, X.5P1] */
    public ParcelableSnapshotMutableState(C284895Os r4, Object obj) {
        this.A01 = r4;
        ? r2 = new AnonymousClass5P2();
        r2.A00 = obj;
        if (AnonymousClass5PH.A07()) {
            ? r1 = new AnonymousClass5P2();
            r1.A00 = obj;
            r1.A00 = 1;
            r2.A01 = r1;
        }
        this.A00 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C284895Os r2 = this.A01;
        C305206Gy r1 = C305206Gy.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        if (0qQ.A0K(r2, r1)) {
            i2 = 0;
        } else {
            C284885Or r12 = C284885Or.A00;
            0qQ.A0C(r12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            if (0qQ.A0K(r2, r12)) {
                i2 = 1;
            } else {
                AnonymousClass5QM r13 = AnonymousClass5QM.A00;
                0qQ.A0C(r13, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                if (0qQ.A0K(r2, r13)) {
                    i2 = 2;
                } else {
                    throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
                }
            }
        }
        parcel.writeInt(i2);
    }
}
