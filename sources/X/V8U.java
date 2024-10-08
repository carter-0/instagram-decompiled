package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppTextFragmentType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8U {
    public static Map A00(C21037XAq xAq) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (xAq.B53() != null) {
            XAJ B53 = xAq.B53();
            if (B53 != null) {
                treeUpdaterJNI3 = B53.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put(C273654mx.A00(693), treeUpdaterJNI3);
        }
        if (xAq.B7y() != null) {
            TextAppTextFragmentType B7y = xAq.B7y();
            if (B7y != null) {
                str = B7y.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("fragment_type", str);
        }
        if (xAq.BMl() != null) {
            XAR BMl = xAq.BMl();
            if (BMl != null) {
                treeUpdaterJNI2 = BMl.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("link_fragment", treeUpdaterJNI2);
        }
        if (xAq.BRe() != null) {
            C51955G8y BRe = xAq.BRe();
            if (BRe != null) {
                treeUpdaterJNI = BRe.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("mention_fragment", treeUpdaterJNI);
        }
        if (xAq.Bcv() != null) {
            linkedHashMap.put("plaintext", xAq.Bcv());
        }
        if (xAq.C3t() != null) {
            XAK C3t = xAq.C3t();
            if (C3t != null) {
                treeUpdaterJNI4 = C3t.FHC();
            }
            linkedHashMap.put("tag_fragment", treeUpdaterJNI4);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
