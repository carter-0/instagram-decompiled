package androidx.work.multiprocess.parcelable;

import X.C41847B3o;
import X.C7216Pzk;
import X.C7325Q4b;
import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableForegroundRequestInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(70);
    public final C7325Q4b A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        C7325Q4b q4b = this.A00;
        parcel.writeInt(q4b.A01);
        parcel.writeInt(q4b.A00);
        parcel.writeParcelable(q4b.A02, i);
    }

    public ParcelableForegroundRequestInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new C7325Q4b(parcel.readInt(), (Notification) C41847B3o.A03(parcel, getClass()), parcel.readInt());
    }
}
