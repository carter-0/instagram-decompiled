package X;

import com.instagram.api.schemas.ProfileBannerType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CcN  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44279CcN {
    public static Map A00(C46258DSn dSn) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSn.AfC() != null) {
            A1H.put("banner_id", dSn.AfC());
        }
        if (dSn.AfI() != null) {
            ProfileBannerType AfI = dSn.AfI();
            0qQ.A0B(AfI, 0);
            A1H.put("banner_type", AfI.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
