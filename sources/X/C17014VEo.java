package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsRrFormatEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VEo  reason: case insensitive filesystem */
public abstract /* synthetic */ class C17014VEo {
    public static Map A00(C2804351v r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = null;
        if (r4.ArS() != null) {
            XAV ArS = r4.ArS();
            if (ArS != null) {
                treeUpdaterJNI2 = ArS.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("core_rating_info", treeUpdaterJNI2);
        }
        if (r4.Bgi() != null) {
            C21021XAa Bgi = r4.Bgi();
            if (Bgi != null) {
                treeUpdaterJNI = Bgi.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(C273654mx.A00(895), treeUpdaterJNI);
        }
        if (r4.Boq() != null) {
            IGAdsRrFormatEnum Boq = r4.Boq();
            if (Boq != null) {
                str = Boq.A00;
            }
            linkedHashMap.put("rr_format", str);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
