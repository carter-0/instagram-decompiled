package androidx.work.multiprocess.parcelable;

import X.C375659En;
import X.C7216Pzk;
import X.DbS;
import X.Pxf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class ParcelableWorkRequests implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(81);
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        ParcelableWorkRequest[] parcelableWorkRequestArr = new ParcelableWorkRequest[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcelableWorkRequestArr[i2] = new ParcelableWorkRequest((C375659En) list.get(i2));
        }
        parcel.writeParcelableArray(parcelableWorkRequestArr, i);
    }

    public ParcelableWorkRequests(Parcel parcel) {
        this.A00 = DbS.A0v(r3);
        for (Parcelable parcelable : parcel.readParcelableArray(Pxf.A0W(this))) {
            this.A00.add(((ParcelableWorkRequest) parcelable).A00);
        }
    }
}
