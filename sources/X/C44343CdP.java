package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CdP  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44343CdP {
    public static Map A00(AnonymousClass56P r5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (r5.Abc() != null) {
            List Abc = r5.Abc();
            if (Abc != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                Iterator it = Abc.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1V(arrayList3, it);
                }
            } else {
                arrayList3 = null;
            }
            A1H.put("android_links", arrayList3);
        }
        if (r5.ArW() != null) {
            CornerStyle ArW = r5.ArW();
            if (ArW != null) {
                str = ArW.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(4660), str);
        }
        if (r5.BIw() != null) {
            List BIw = r5.BIw();
            if (BIw != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                Iterator it2 = BIw.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1V(arrayList2, it2);
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("ios_links", arrayList2);
        }
        if (r5.BN4() != null) {
            List BN4 = r5.BN4();
            if (BN4 != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it3 = BN4.iterator();
                while (it3.hasNext()) {
                    C41847B3o.A1V(arrayList, it3);
                }
            } else {
                arrayList = null;
            }
            A1H.put("links", arrayList);
        }
        if (r5.Bfu() != null) {
            ProductDetailsProductItemDictIntf Bfu = r5.Bfu();
            if (Bfu != null) {
                treeUpdaterJNI = Bfu.FHC();
            }
            A1H.put("product", treeUpdaterJNI);
        }
        if (r5.BgN() != null) {
            A1H.put("product_name", r5.BgN());
        }
        return 0Yt.A0B(A1H);
    }
}
