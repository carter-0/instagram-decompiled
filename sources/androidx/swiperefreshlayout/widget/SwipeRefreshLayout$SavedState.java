package androidx.swiperefreshlayout.widget;

import X.AnonymousClass7TF;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class SwipeRefreshLayout$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(65);
    public final boolean A00;

    public SwipeRefreshLayout$SavedState(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.A00 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public SwipeRefreshLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass7TF.A1P(parcel.readByte());
    }
}
