package androidx.compose.runtime;

import X.0qQ;
import X.AnonymousClass5Ow;
import X.AnonymousClass5P2;
import X.AnonymousClass5P3;
import X.AnonymousClass7TE;
import X.C270284gU;
import X.C284895Os;
import X.C284935Oy;
import X.C284945Oz;
import X.C289465dd;
import X.C7216Pzk;
import X.JTO;
import X.Pxe;
import X.QAZ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

public final class ParcelableSnapshotMutableDoubleState extends AnonymousClass5Ow implements C284945Oz, C270284gU, Parcelable, C284935Oy {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(14);
    public QAZ A00;

    public final int describeContents() {
        return 0;
    }

    public final AnonymousClass5P2 B6D() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return Double.valueOf(((QAZ) AnonymousClass5P3.A07(this, this.A00)).A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MutableDoubleState(value=");
        A1A.append(((QAZ) AnonymousClass5P3.A08(this.A00)).A00);
        A1A.append(")@");
        return Pxe.A0z(A1A, hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(((QAZ) AnonymousClass5P3.A07(this, this.A00)).A00);
    }

    public final C284895Os BdR() {
        return C289465dd.A00();
    }

    public final AnonymousClass5P2 CoB(AnonymousClass5P2 r6, AnonymousClass5P2 r7, AnonymousClass5P2 r8) {
        0qQ.A0C(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        0qQ.A0C(r8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((QAZ) r7).A00 != ((QAZ) r8).A00) {
            return null;
        }
        return r7;
    }

    public final void E4K(AnonymousClass5P2 r2) {
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.A00 = (QAZ) r2;
    }

    public final /* bridge */ /* synthetic */ void Epw(Object obj) {
        Snapshot A002;
        double A003 = JTO.A00(obj);
        QAZ qaz = (QAZ) AnonymousClass5P3.A08(this.A00);
        if (qaz.A00 != A003) {
            QAZ qaz2 = this.A00;
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                ((QAZ) AnonymousClass5P3.A03(A002, this, qaz2, qaz)).A00 = A003;
            }
            AnonymousClass5P3.A0H(A002, this);
        }
    }
}
