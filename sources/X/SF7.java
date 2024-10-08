package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import java.io.Serializable;
import java.util.Map;

public final class SF7 {
    public final SE0 A00 = SE0.A01.A00();
    public final C307786Rm A01;
    public final C307896Rx A02;
    public final C277014uI A03;

    public SF7(C307786Rm r2, C307896Rx r3, C277014uI r4) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static final void A00(Bundle bundle, String str, String str2, String str3, Map map, Map map2) {
        Serializable serializable;
        String string = bundle.getString(str2);
        if (string != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable(str3, AuthenticityUploadMedium.class);
            } else {
                serializable = bundle.getSerializable(str3);
                if (!(serializable instanceof AuthenticityUploadMedium)) {
                    return;
                }
            }
            AuthenticityUploadMedium authenticityUploadMedium = (AuthenticityUploadMedium) serializable;
            if (authenticityUploadMedium != null) {
                map.put(str, string);
                map2.put(str, authenticityUploadMedium.getValue());
            }
        }
    }
}
