package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.List;

/* renamed from: X.KvW  reason: case insensitive filesystem */
public abstract class C63349KvW {
    public static final int A00(int i, int i2, List list) {
        int A00 = C63348KvV.A00(i, i2, list);
        if (list == null || !list.contains(Integer.valueOf(A00))) {
            return A00;
        }
        int i3 = i2 / 15;
        int i4 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i3) {
            i4 = i3;
        }
        int i5 = A00 / i4;
        int i6 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i3) {
            i6 = i3;
        }
        return i5 * i6;
    }
}
