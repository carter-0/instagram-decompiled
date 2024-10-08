package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ce0  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44380Ce0 {
    public static Map A00(C46287DTq dTq) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTq.Ad3() != null) {
            ImageUrl Ad3 = dTq.Ad3();
            if (Ad3 != null) {
                str = Ad3.getUrl();
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(513), str);
        }
        if (dTq.Ad5() != null) {
            A1H.put("attribution_label", dTq.Ad5());
        }
        if (dTq.AgB() != null) {
            A1H.put("bloks_app_id", dTq.AgB());
        }
        if (dTq.AgD() != null) {
            A1H.put("bloks_attribution_type", dTq.AgD());
        }
        return 0Yt.A0B(A1H);
    }
}
