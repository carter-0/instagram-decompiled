package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.6U4  reason: invalid class name */
public final class AnonymousClass6U4 implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CoordinatorLayout.SavedState(parcel, (ClassLoader) null);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CoordinatorLayout.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CoordinatorLayout.SavedState(parcel, classLoader);
    }
}
