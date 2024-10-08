package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.proxygen.LigerSamplePolicy;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.4Sl  reason: invalid class name and case insensitive filesystem */
public class C265074Sl implements C265084Sm {
    public final int A00;

    public final long Bo4(XDS xds) {
        int i;
        if (this instanceof C265134Sr) {
            IOException iOException = xds.A03;
            int i2 = xds.A00;
            if (iOException instanceof C2609447q) {
                C2609447q r2 = (C2609447q) iOException;
                Map map = r2.A01;
                if (C21993XpG.A02(map)) {
                    return C21993XpG.A00(map, r2.A00, i2);
                }
            }
            if ((iOException instanceof C2609347p) || (iOException instanceof FileNotFoundException) || (iOException instanceof C390609rY)) {
                return -9223372036854775807L;
            }
            i = (int) Math.min((((long) (i2 - 1)) * 1000) + 500, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        } else {
            Throwable th = xds.A03;
            if ((th instanceof C2609347p) || (th instanceof FileNotFoundException) || (th instanceof C68388NEu) || (th instanceof C390609rY)) {
                return -9223372036854775807L;
            }
            while (th != null) {
                if ((th instanceof C2609647s) && ((C2609647s) th).A00 == 2008) {
                    return -9223372036854775807L;
                }
                th = th.getCause();
            }
            i = Math.min((xds.A00 - 1) * IgNetworkConsentStorage.MAX_ENTRIES, 5000);
        }
        return (long) i;
    }

    public C265074Sl(int i) {
        this.A00 = i;
    }

    public C265074Sl() {
        this(-1);
    }
}
