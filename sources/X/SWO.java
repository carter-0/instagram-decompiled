package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.SearchView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;

public final class SWO implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public SWO(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                AbsSavedState absSavedState = new AbsSavedState(parcel, classLoader);
                absSavedState.A00 = AnonymousClass7TE.A1a(parcel.readValue((ClassLoader) null));
                return absSavedState;
            case 1:
                SparseArray sparseArray = new SparseArray();
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
                for (int i = 0; i < readInt; i++) {
                    sparseArray.put(iArr[i], readParcelableArray[i]);
                }
                return sparseArray;
            default:
                return new ExtendableSavedState(parcel, classLoader);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new SearchView.SavedState[i];
            case 1:
                return new ParcelableSparseArray[i];
            default:
                return new ExtendableSavedState[i];
        }
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                AbsSavedState absSavedState = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState.A00 = AnonymousClass7TE.A1a(parcel.readValue((ClassLoader) null));
                return absSavedState;
            case 1:
                SparseArray sparseArray = new SparseArray();
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                Parcelable[] readParcelableArray = parcel.readParcelableArray((ClassLoader) null);
                for (int i = 0; i < readInt; i++) {
                    sparseArray.put(iArr[i], readParcelableArray[i]);
                }
                return sparseArray;
            default:
                return new ExtendableSavedState(parcel, (ClassLoader) null);
        }
    }
}
