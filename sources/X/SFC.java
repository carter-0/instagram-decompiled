package X;

import com.google.android.gms.common.Feature;

public final class SFC {
    public final int A00;
    public final boolean A01;
    public final Feature[] A02;
    public final /* synthetic */ SHO A03;

    public SFC(SHO sho, Feature[] featureArr, int i, boolean z) {
        this.A03 = sho;
        this.A02 = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.A01 = z2;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.SHO] */
    public static SHO A00() {
        ? obj = new Object();
        obj.A02 = true;
        obj.A00 = 0;
        return obj;
    }
}
