package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory;
import java.util.HashMap;

public final class SWP implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BloksStringOverrideFactory[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        HashMap A0x = C66582MXn.A0x(parcel);
        int i = Build.VERSION.SDK_INT;
        ClassLoader classLoader = HashMap.class.getClassLoader();
        if (i >= 33) {
            Class<String> cls = String.class;
            parcel.readMap(A0x, classLoader, cls, cls);
        } else {
            parcel.readMap(A0x, classLoader);
        }
        return new BloksStringOverrideFactory(A0x);
    }
}
