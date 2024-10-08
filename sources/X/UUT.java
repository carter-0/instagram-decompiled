package X;

import java.util.ArrayList;
import java.util.List;

public final class UUT extends C69677Npz {
    public int A00 = 3;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    public static final V1U A00(int i) {
        if (i != 0) {
            if (i == 1) {
                return V1U.CELLULAR;
            }
            if (i == 2) {
                return V1U.WIFI_BAND_2_4GHZ;
            }
            if (i == 3) {
                return V1U.WIFI_BAND_5GHZ;
            }
        }
        return V1U.UNKNOWN;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04(long j) {
        List list;
        0bb r2;
        if (this.A00 == 4) {
            list = this.A01;
            r2 = new 0bb();
        } else {
            list = this.A02;
            r2 = new 0bb();
        }
        r2.A01(A00(this.A00), "uplink_type");
        r2.A05("duration_ms", Long.valueOf(j));
        list.add(r2);
    }
}
