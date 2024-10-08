package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.BackStackRecordState;

/* renamed from: X.05b  reason: invalid class name */
public final class AnonymousClass05b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BackStackRecordState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BackStackRecordState[i];
    }
}
