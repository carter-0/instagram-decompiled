package androidx.appcompat.widget;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(11);
    public int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
