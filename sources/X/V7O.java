package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7O {
    public static Map A00(C21034XAn xAn) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (xAn.ArL() != null) {
            C21022XAb ArL = xAn.ArL();
            if (ArL != null) {
                treeUpdaterJNI2 = ArL.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("coordinates", treeUpdaterJNI2);
        }
        if (xAn.BIh() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1490), xAn.BIh());
        }
        if (xAn.getText() != null) {
            linkedHashMap.put("text", xAn.getText());
        }
        if (xAn.C5i() != null) {
            C21038XAr C5i = xAn.C5i();
            if (C5i != null) {
                treeUpdaterJNI = C5i.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("text_styling", treeUpdaterJNI);
        }
        if (xAn.C7O() != null) {
            XAN C7O = xAn.C7O();
            if (C7O != null) {
                treeUpdaterJNI3 = C7O.FHC();
            }
            linkedHashMap.put("time_stamp", treeUpdaterJNI3);
        }
        if (xAn.CA1() != null) {
            linkedHashMap.put("truncation_text", xAn.CA1());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
