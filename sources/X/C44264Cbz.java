package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.ProductDiscountsDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cbz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44264Cbz {
    public static Map A00(ProductDiscountsDict productDiscountsDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productDiscountsDict.Axx() != null) {
            List<ProductDiscountInformationDict> Axx = productDiscountsDict.Axx();
            ArrayList arrayList = null;
            if (Axx != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (ProductDiscountInformationDict productDiscountInformationDict : Axx) {
                    if (productDiscountInformationDict != null) {
                        arrayList.add(productDiscountInformationDict.FHC());
                    }
                }
            }
            A1H.put("discounts", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
