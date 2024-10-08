package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.HashMap;
import java.util.Map;

public final class SBS {
    public static final Map A00;

    static {
        Integer valueOf = Integer.valueOf(IgNetworkConsentStorage.MAX_ENTRIES);
        Integer A0k = C51967G9n.A0k();
        HashMap A0f = Dba.A0f("major", valueOf);
        A0f.put("minor", A0k);
        A0f.put("patch", A0k);
        A0f.put("prerelease", (Object) null);
        A00 = A0f;
    }
}
