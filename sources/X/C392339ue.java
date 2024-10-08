package X;

import android.os.Bundle;
import com.facebook.location.platform.api.Location;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.9ue  reason: invalid class name and case insensitive filesystem */
public abstract class C392339ue {
    public static A7Y[] A00(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        int length = bundleArr.length;
        A7Y[] a7yArr = new A7Y[length];
        for (int i = 0; i < length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet A1F = AnonymousClass7TE.A1F();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    A1F.add(it.next());
                }
            }
            String string = bundle.getString("resultKey");
            a7yArr[i] = new A7Y(bundle.getBundle(Location.EXTRAS), bundle.getCharSequence("label"), string, A1F, bundle.getCharSequenceArray("choices"), 0, bundle.getBoolean("allowFreeFormInput"));
        }
        return a7yArr;
    }
}
