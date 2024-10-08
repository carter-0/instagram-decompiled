package X;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: X.63f  reason: invalid class name and case insensitive filesystem */
public final class C3024163f {
    public GoogleApiAvailabilityLight A00;
    public final SparseIntArray A01;

    public C3024163f(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.A01 = new SparseIntArray();
        AnonymousClass3Qk.A02(googleApiAvailabilityLight);
        this.A00 = googleApiAvailabilityLight;
    }

    public final int A00(Context context, AnonymousClass647 r6) {
        AnonymousClass3Qk.A02(context);
        AnonymousClass3Qk.A02(r6);
        int minApkVersion = r6.getMinApkVersion();
        SparseIntArray sparseIntArray = this.A01;
        int i = sparseIntArray.get(minApkVersion, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= sparseIntArray.size()) {
                    i = this.A00.A03(context, minApkVersion);
                    break;
                }
                int keyAt = sparseIntArray.keyAt(i2);
                if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            }
            sparseIntArray.put(minApkVersion, i);
        }
        return i;
    }

    public C3024163f() {
        this(GoogleApiAvailability.A00);
    }
}
