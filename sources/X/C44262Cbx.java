package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cbx  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44262Cbx {
    public static Map A00(ProductDiscountInformationDict productDiscountInformationDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productDiscountInformationDict.getCtaText() != null) {
            A1H.put("cta_text", productDiscountInformationDict.getCtaText());
        }
        if (productDiscountInformationDict.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, productDiscountInformationDict.getDescription());
        }
        if (productDiscountInformationDict.getId() != null) {
            C41845B3m.A0x(productDiscountInformationDict.getId(), A1H);
        }
        if (productDiscountInformationDict.getName() != null) {
            C41845B3m.A0z(productDiscountInformationDict.getName(), A1H);
        }
        if (productDiscountInformationDict.getSeeDetailsText() != null) {
            A1H.put("see_details_text", productDiscountInformationDict.getSeeDetailsText());
        }
        return 0Yt.A0B(A1H);
    }
}
