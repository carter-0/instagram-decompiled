package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4Y {
    public static Map A00(C245423cs r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (r4.ApB() != null) {
            C245373cm ApB = r4.ApB();
            if (ApB != null) {
                treeUpdaterJNI3 = ApB.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, treeUpdaterJNI3);
        }
        if (r4.BZd() != null) {
            AnonymousClass5AT BZd = r4.BZd();
            if (BZd != null) {
                treeUpdaterJNI2 = BZd.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("overflow", treeUpdaterJNI2);
        }
        if (r4.BcP() != null) {
            C245403cq BcP = r4.BcP();
            if (BcP != null) {
                treeUpdaterJNI = BcP.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("pill", treeUpdaterJNI);
        }
        if (r4.CB3() != null) {
            AnonymousClass5AV CB3 = r4.CB3();
            if (CB3 != null) {
                treeUpdaterJNI4 = CB3.FHC();
            }
            A1H.put("ufi", treeUpdaterJNI4);
        }
        return 0Yt.A0B(A1H);
    }
}
