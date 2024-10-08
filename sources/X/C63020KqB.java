package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KqB  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63020KqB {
    public static Map A00(C2815958q r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.Ax1();
        A1H.put("digital_product_id", Long.valueOf(r3.Ax1()));
        if (r3.Bwo() != null) {
            A1H.put("sku", r3.Bwo());
        }
        if (r3.C36() != null) {
            LiveUserPaySupportTier C36 = r3.C36();
            0qQ.A0B(C36, 0);
            A1H.put("support_tier", C36.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
