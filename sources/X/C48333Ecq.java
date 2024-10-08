package X;

import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTATextVariantSource;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ecq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48333Ecq {
    public static Map A00(IGCTATextVariant iGCTATextVariant) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGCTATextVariant.AtR() != null) {
            A1H.put(AnonymousClass000.A00(1254), iGCTATextVariant.AtR());
        }
        if (iGCTATextVariant.BAz() != null) {
            A1H.put("has_emoji", iGCTATextVariant.BAz());
        }
        if (iGCTATextVariant.BKV() != null) {
            A1H.put("language", iGCTATextVariant.BKV());
        }
        if (iGCTATextVariant.C5d() != null) {
            IGCTATextVariantSource C5d = iGCTATextVariant.C5d();
            if (C5d != null) {
                str = C5d.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(1883), str);
        }
        return 0Yt.A0B(A1H);
    }
}
