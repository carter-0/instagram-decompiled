package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CYP {
    public static Map A00(DUM dum) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dum.BRr() != null) {
            A1H.put("merchant_id", dum.BRr());
        }
        if (dum.Bbz() != null) {
            A1H.put("photo", dum.Bbz().FHC());
        }
        if (dum.Bfu() != null) {
            A1H.put("product", C41846B3n.A0Q(dum.Bfu()));
        }
        if (dum.getProductId() != null) {
            A1H.put("product_id", dum.getProductId());
        }
        if (dum.BgF() != null) {
            A1H.put("product_image_id", dum.BgF());
        }
        return 0Yt.A0B(A1H);
    }
}
