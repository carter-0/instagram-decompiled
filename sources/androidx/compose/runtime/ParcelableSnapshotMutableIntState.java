package androidx.compose.runtime;

import X.002;
import X.0qQ;
import X.AnonymousClass5Ow;
import X.AnonymousClass5P2;
import X.AnonymousClass5P3;
import X.AnonymousClass5PH;
import X.AnonymousClass5XI;
import X.C284885Or;
import X.C284895Os;
import X.C284935Oy;
import X.C289495dh;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

public final class ParcelableSnapshotMutableIntState extends AnonymousClass5Ow implements C289495dh, Parcelable, C284935Oy {
    public static final Parcelable.Creator CREATOR = new C376409Hw(1);
    public AnonymousClass5XI A00;

    public final int describeContents() {
        return 0;
    }

    public final AnonymousClass5P2 B6D() {
        return this.A00;
    }

    public final int BI6() {
        return ((AnonymousClass5XI) AnonymousClass5P3.A07(this, this.A00)).A00;
    }

    public final C284895Os BdR() {
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return r1;
    }

    public final void E4K(AnonymousClass5P2 r2) {
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.A00 = (AnonymousClass5XI) r2;
    }

    public final void EZz(int i) {
        Snapshot A002;
        AnonymousClass5XI r3 = (AnonymousClass5XI) AnonymousClass5P3.A08(this.A00);
        if (r3.A00 != i) {
            AnonymousClass5XI r0 = this.A00;
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                ((AnonymousClass5XI) AnonymousClass5P3.A03(A002, this, r0, r3)).A00 = i;
            }
            AnonymousClass5P3.A0H(A002, this);
        }
    }

    public final /* bridge */ /* synthetic */ void Epw(Object obj) {
        EZz(((Number) obj).intValue());
    }

    public final String toString() {
        return 002.A02(((AnonymousClass5XI) AnonymousClass5P3.A08(this.A00)).A00, hashCode(), "MutableIntState(value=", ")@");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5P2, X.5XI] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.5P2, X.5XI] */
    public ParcelableSnapshotMutableIntState(int i) {
        ? r2 = new AnonymousClass5P2();
        r2.A00 = i;
        if (AnonymousClass5PH.A07()) {
            ? r1 = new AnonymousClass5P2();
            r1.A00 = i;
            r1.A00 = 1;
            r2.A01 = r1;
        }
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(BI6());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(BI6());
    }
}
