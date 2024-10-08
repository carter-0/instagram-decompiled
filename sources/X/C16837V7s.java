package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.V7s  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16837V7s {
    public static Map A00(C21025XAe xAe) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = null;
        if (xAe.Abh() != null) {
            XAQ Abh = xAe.Abh();
            if (Abh != null) {
                treeUpdaterJNI3 = Abh.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("animation", treeUpdaterJNI3);
        }
        if (xAe.Aeh() != null) {
            C21024XAd Aeh = xAe.Aeh();
            if (Aeh != null) {
                treeUpdaterJNI2 = Aeh.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI2);
        }
        if (xAe.Af0() != null) {
            XAP Af0 = xAe.Af0();
            if (Af0 != null) {
                treeUpdaterJNI = Af0.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("badge", treeUpdaterJNI);
        }
        if (xAe.BcE() != null) {
            List<C21035XAo> BcE = xAe.BcE();
            if (BcE != null) {
                arrayList = new ArrayList();
                for (C21035XAo xAo : BcE) {
                    if (xAo != null) {
                        arrayList.add(xAo.FHC());
                    }
                }
            }
            linkedHashMap.put("photos", arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
