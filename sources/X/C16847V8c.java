package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.V8c  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16847V8c {
    public static Map A00(XAS xas) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = null;
        if (xas.Aeh() != null) {
            C21024XAd Aeh = xas.Aeh();
            if (Aeh != null) {
                treeUpdaterJNI = Aeh.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI);
        }
        if (xas.ApR() != null) {
            List<C21030XAj> ApR = xas.ApR();
            if (ApR != null) {
                arrayList = new ArrayList();
                for (C21030XAj xAj : ApR) {
                    if (xAj != null) {
                        arrayList.add(xAj.FHC());
                    }
                }
            }
            linkedHashMap.put("comments", arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
