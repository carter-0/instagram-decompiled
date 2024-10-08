package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cbg  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44245Cbg {
    public static Map A00(C279644yz r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.An9() != null) {
            A1H.put("checkout_style", r3.An9());
        }
        if (r3.getCurrentPrice() != null) {
            A1H.put("current_price", r3.getCurrentPrice());
        }
        if (r3.getExternalUrl() != null) {
            A1H.put("external_url", r3.getExternalUrl());
        }
        if (r3.getFullPrice() != null) {
            A1H.put("full_price", r3.getFullPrice());
        }
        User BRo = r3.BRo();
        if (BRo != null) {
            C41847B3o.A1S(BRo, A1H);
        }
        if (r3.getName() != null) {
            C41845B3m.A0z(r3.getName(), A1H);
        }
        if (r3.getProductId() != null) {
            A1H.put("product_id", r3.getProductId());
        }
        return 0Yt.A0B(A1H);
    }
}
