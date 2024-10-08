package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.List;

public final class QQ1 extends C249833kR {
    public final boolean A00;

    public final void A00(int i, List list) {
        if (i >= 0 && i <= 100) {
            double d = ((double) i) / 100.0d;
            int i2 = 800;
            boolean z = false;
            if (i >= 50) {
                i2 = IgNetworkConsentStorage.MAX_ENTRIES;
                z = true;
            }
            15B r6 = this.A00;
            int[] iArr = r6.A0B;
            int i3 = iArr[1];
            int i4 = iArr[0];
            int max = Math.max((i4 + ((int) (((double) (i3 - i4)) * d))) / IgNetworkConsentStorage.MAX_ENTRIES, i2);
            int i5 = r6.A02;
            int[] iArr2 = C9938Rjr.A00;
            int min = Math.min(i5, 8);
            int i6 = (max - 1000) / 100;
            if (i6 < 0) {
                i6 = 0;
            }
            for (int i7 = 0; i7 < min; i7++) {
                G9w.A0x(iArr2[i7] + i6, list);
            }
            G9w.A0x(7681, list);
            if (z) {
                G9w.A0x(15873, list);
                G9w.A0x(1795, list);
            }
        }
    }

    public final String toString() {
        if (this.A00) {
            return "snapdragon_v2_auto";
        }
        return "snapdragon_v2";
    }

    public QQ1(15B r1, boolean z) {
        super(r1);
        this.A00 = z;
    }
}
