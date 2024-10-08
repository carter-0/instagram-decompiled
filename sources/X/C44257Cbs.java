package X;

import com.instagram.api.schemas.ProductArtsLabelInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cbs  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44257Cbs {
    public static Map A00(ProductArtsLabelsDictIntf productArtsLabelsDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productArtsLabelsDictIntf.BKR() != null) {
            List<ProductArtsLabelInformationDict> BKR = productArtsLabelsDictIntf.BKR();
            ArrayList arrayList = null;
            if (BKR != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (ProductArtsLabelInformationDict productArtsLabelInformationDict : BKR) {
                    if (productArtsLabelInformationDict != null) {
                        arrayList.add(productArtsLabelInformationDict.FHC());
                    }
                }
            }
            A1H.put("labels", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
