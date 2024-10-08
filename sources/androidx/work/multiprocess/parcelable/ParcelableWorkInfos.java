package androidx.work.multiprocess.parcelable;

import X.C11028S6g;
import X.C7216Pzk;
import X.DbS;
import X.Pxf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class ParcelableWorkInfos implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(78);
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        ParcelableWorkInfo[] parcelableWorkInfoArr = new ParcelableWorkInfo[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcelableWorkInfoArr[i2] = new ParcelableWorkInfo((C11028S6g) list.get(i2));
        }
        parcel.writeParcelableArray(parcelableWorkInfoArr, i);
    }

    public ParcelableWorkInfos(Parcel parcel) {
        this.A00 = DbS.A0v(r3);
        for (Parcelable parcelable : parcel.readParcelableArray(Pxf.A0W(this))) {
            this.A00.add(((ParcelableWorkInfo) parcelable).A00);
        }
    }

    public ParcelableWorkInfos(List list) {
        this.A00 = list;
    }
}
