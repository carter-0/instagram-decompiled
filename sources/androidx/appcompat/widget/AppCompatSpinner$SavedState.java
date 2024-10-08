package androidx.appcompat.widget;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(12);
    public boolean A00;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
