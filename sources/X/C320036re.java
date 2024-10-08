package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.6re  reason: invalid class name and case insensitive filesystem */
public final class C320036re implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AbsSavedState absSavedState = new AbsSavedState(parcel, (ClassLoader) null);
        absSavedState.A01 = parcel.readInt();
        absSavedState.A00 = parcel.readFloat();
        boolean z = false;
        if (parcel.readByte() != 0) {
            z = true;
        }
        absSavedState.A02 = z;
        return absSavedState;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppBarLayout.BaseBehavior.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        AbsSavedState absSavedState = new AbsSavedState(parcel, classLoader);
        absSavedState.A01 = parcel.readInt();
        absSavedState.A00 = parcel.readFloat();
        boolean z = false;
        if (parcel.readByte() != 0) {
            z = true;
        }
        absSavedState.A02 = z;
        return absSavedState;
    }
}
