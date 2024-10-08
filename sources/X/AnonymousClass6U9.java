package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6U9  reason: invalid class name */
public final class AnonymousClass6U9 implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AbsSavedState absSavedState = new AbsSavedState(parcel, (ClassLoader) null);
        absSavedState.A00 = parcel.readParcelable(C252553pI.class.getClassLoader());
        return absSavedState;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecyclerView.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        AbsSavedState absSavedState = new AbsSavedState(parcel, classLoader);
        if (classLoader == null) {
            classLoader = C252553pI.class.getClassLoader();
        }
        absSavedState.A00 = parcel.readParcelable(classLoader);
        return absSavedState;
    }
}
