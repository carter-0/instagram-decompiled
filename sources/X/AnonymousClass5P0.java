package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5P0  reason: invalid class name */
public final class AnonymousClass5P0 implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    /* renamed from: A00 */
    public final ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        C284895Os r1;
        String str;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            r1 = C305206Gy.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>";
        } else if (readInt == 1) {
            r1 = C284885Or.A00;
            0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            return new ParcelableSnapshotMutableState(r1, readValue);
        } else if (readInt == 2) {
            r1 = AnonymousClass5QM.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>";
        } else {
            throw new IllegalStateException(002.A0c("Unsupported MutableState policy ", " was restored", readInt));
        }
        0qQ.A0C(r1, str);
        return new ParcelableSnapshotMutableState(r1, readValue);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }
}
