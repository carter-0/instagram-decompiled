package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V8e  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16849V8e {
    public static Map A00(C21027XAg xAg) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (xAg.Aeh() != null) {
            C21024XAd Aeh = xAg.Aeh();
            if (Aeh != null) {
                treeUpdaterJNI3 = Aeh.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI3);
        }
        if (xAg.ApC() != null) {
            C21030XAj ApC = xAg.ApC();
            if (ApC != null) {
                treeUpdaterJNI2 = ApC.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, treeUpdaterJNI2);
        }
        if (xAg.BaH() != null) {
            C21032XAl BaH = xAg.BaH();
            if (BaH != null) {
                treeUpdaterJNI = BaH.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("page_name", treeUpdaterJNI);
        }
        if (xAg.C6r() != null) {
            XAX C6r = xAg.C6r();
            if (C6r != null) {
                treeUpdaterJNI4 = C6r.FHC();
            }
            linkedHashMap.put("thumbnail", treeUpdaterJNI4);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
