package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;

/* renamed from: X.69k  reason: invalid class name and case insensitive filesystem */
public abstract class C3035269k implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        TreeJNI A00 = TreeParcelable.A00(parcel);
        if (A00 != null) {
            return A00;
        }
        throw new RuntimeException("Unable to read parcel");
    }
}
