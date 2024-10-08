package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VEq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C17016VEq {
    public static Map A00(C21021XAa xAa) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (xAa.Ax4() != null) {
            C21023XAc Ax4 = xAa.Ax4();
            if (Ax4 != null) {
                treeUpdaterJNI2 = Ax4.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("dimensional_info", treeUpdaterJNI2);
        }
        if (xAa.BjX() != null) {
            XAO BjX = xAa.BjX();
            if (BjX != null) {
                treeUpdaterJNI = BjX.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("rating_only_info", treeUpdaterJNI);
        }
        if (xAa.C8b() != null) {
            XAW C8b = xAa.C8b();
            if (C8b != null) {
                treeUpdaterJNI3 = C8b.FHC();
            }
            linkedHashMap.put("topics_info", treeUpdaterJNI3);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
