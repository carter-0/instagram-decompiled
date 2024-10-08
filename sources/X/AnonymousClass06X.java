package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentManagerState;
import java.util.ArrayList;

/* renamed from: X.06X  reason: invalid class name */
public final class AnonymousClass06X implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.fragment.app.FragmentManagerState, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ? obj = new Object();
        obj.A01 = null;
        obj.A04 = new ArrayList();
        obj.A05 = new ArrayList();
        obj.A02 = parcel.createStringArrayList();
        obj.A03 = parcel.createStringArrayList();
        obj.A07 = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        obj.A00 = parcel.readInt();
        obj.A01 = parcel.readString();
        obj.A04 = parcel.createStringArrayList();
        obj.A05 = parcel.createTypedArrayList(BackStackState.CREATOR);
        obj.A06 = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
