package androidx.work.multiprocess.parcelable;

import X.002;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public final class ParcelableInterruptRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(71);
    public final int A00;
    public final String A01;

    public ParcelableInterruptRequest(String str, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParcelableInterruptRequest) {
                ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) obj;
                if (!0qQ.A0K(this.A01, parcelableInterruptRequest.A01) || this.A00 != parcelableInterruptRequest.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0l("ParcelableInterruptRequest(id=", this.A01, ", stopReason=", ')', this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }
}
