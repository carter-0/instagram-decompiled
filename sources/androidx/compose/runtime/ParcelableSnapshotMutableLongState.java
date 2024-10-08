package androidx.compose.runtime;

import X.0qQ;
import X.AnonymousClass5Ow;
import X.AnonymousClass5P2;
import X.AnonymousClass5P3;
import X.AnonymousClass5PH;
import X.AnonymousClass6G2;
import X.C284885Or;
import X.C284895Os;
import X.C284935Oy;
import X.C3017960c;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

public final class ParcelableSnapshotMutableLongState extends AnonymousClass5Ow implements Parcelable, AnonymousClass6G2, C284935Oy {
    public static final Parcelable.Creator CREATOR = new C376409Hw(2);
    public C3017960c A00;

    public final int describeContents() {
        return 0;
    }

    public final AnonymousClass5P2 B6D() {
        return this.A00;
    }

    public final long BOX() {
        return ((C3017960c) AnonymousClass5P3.A07(this, this.A00)).A00;
    }

    public final C284895Os BdR() {
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return r1;
    }

    public final void E4K(AnonymousClass5P2 r2) {
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.A00 = (C3017960c) r2;
    }

    public final void Ecf(long j) {
        Snapshot A002;
        C3017960c r3 = (C3017960c) AnonymousClass5P3.A08(this.A00);
        if (r3.A00 != j) {
            C3017960c r0 = this.A00;
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                ((C3017960c) AnonymousClass5P3.A03(A002, this, r0, r3)).A00 = j;
            }
            AnonymousClass5P3.A0H(A002, this);
        }
    }

    public final /* bridge */ /* synthetic */ void Epw(Object obj) {
        Ecf(((Number) obj).longValue());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MutableLongState(value=");
        sb.append(((C3017960c) AnonymousClass5P3.A08(this.A00)).A00);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5P2, X.60c] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.5P2, X.60c] */
    public ParcelableSnapshotMutableLongState(long j) {
        ? r2 = new AnonymousClass5P2();
        r2.A00 = j;
        if (AnonymousClass5PH.A07()) {
            ? r1 = new AnonymousClass5P2();
            r1.A00 = j;
            r1.A00 = 1;
            r2.A01 = r1;
        }
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(BOX());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(BOX());
    }
}
