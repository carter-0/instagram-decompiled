package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4J {
    public static Map A00(C66901qt r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (r4.B5Q() != null) {
            MediaCroppingCoordinatesIntf B5Q = r4.B5Q();
            if (B5Q != null) {
                treeUpdaterJNI2 = B5Q.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("feed_preview_crop", treeUpdaterJNI2);
        }
        if (r4.ByW() != null) {
            MediaCroppingCoordinatesIntf ByW = r4.ByW();
            if (ByW != null) {
                treeUpdaterJNI = ByW.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("square_crop", treeUpdaterJNI);
        }
        if (r4.C6q() != null) {
            MediaCroppingCoordinatesIntf C6q = r4.C6q();
            if (C6q != null) {
                treeUpdaterJNI3 = C6q.FHC();
            }
            A1H.put("three_by_four_preview_crop", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
