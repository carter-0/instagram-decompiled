package X;

import com.instagram.api.schemas.SoundPlatformProduct;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HTN {
    public static Map A00(JSF jsf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (jsf.Ago() != null) {
            A1H.put("body_text", jsf.Ago());
        }
        if (jsf.Bxd() != null) {
            SoundPlatformProduct Bxd = jsf.Bxd();
            0qQ.A0B(Bxd, 0);
            A1H.put("sound_platform_product", Bxd.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
