package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7m  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16831V7m {
    public static Map A00(C275664qi r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (r4.BSl() != null) {
            XAS BSl = r4.BSl();
            if (BSl != null) {
                treeUpdaterJNI3 = BSl.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("metadata_multi_comment_card_payload_v1", treeUpdaterJNI3);
        }
        if (r4.BSm() != null) {
            C21036XAp BSm = r4.BSm();
            if (BSm != null) {
                treeUpdaterJNI2 = BSm.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("metadata_payload_v1", treeUpdaterJNI2);
        }
        if (r4.BSn() != null) {
            C21025XAe BSn = r4.BSn();
            if (BSn != null) {
                treeUpdaterJNI = BSn.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("metadata_photo_card_payload_v1", treeUpdaterJNI);
        }
        if (r4.BSp() != null) {
            C21027XAg BSp = r4.BSp();
            if (BSp != null) {
                treeUpdaterJNI4 = BSp.FHC();
            }
            linkedHashMap.put("metadata_single_comment_card_payload_v1", treeUpdaterJNI4);
        }
        if (r4.BYa() != null) {
            linkedHashMap.put("option_value", r4.BYa());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
