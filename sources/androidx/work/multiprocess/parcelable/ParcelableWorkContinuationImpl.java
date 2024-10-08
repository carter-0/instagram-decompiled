package androidx.work.multiprocess.parcelable;

import X.AnonymousClass05K;
import X.C375659En;
import X.C7216Pzk;
import X.Pxf;
import X.SF3;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public class ParcelableWorkContinuationImpl implements Parcelable {
    public static final Integer[] A01 = AnonymousClass05K.A00(4);
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(76);
    public SF3 A00;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.os.Parcelable, java.lang.Object, androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl] */
    public final void writeToParcel(Parcel parcel, int i) {
        SF3 sf3 = this.A00;
        String str = sf3.A02;
        int i2 = 1;
        boolean z = !TextUtils.isEmpty(str);
        parcel.writeInt(z ? 1 : 0);
        if (z) {
            parcel.writeString(str);
        }
        Pxf.A19(parcel, sf3.A01);
        List list = sf3.A03;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                parcel.writeParcelable(new ParcelableWorkRequest((C375659En) list.get(i3)), i);
            }
        }
        List list2 = sf3.A00;
        if (list2 == null || list2.isEmpty()) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeInt(list2.size());
            for (int i4 = 0; i4 < list2.size(); i4++) {
                ? obj = new Object();
                obj.A00 = (SF3) list2.get(i4);
                parcel.writeParcelable(obj, i);
            }
        }
    }
}
