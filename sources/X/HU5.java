package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HU5 {
    public static Map A00(C274544oX r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (r4.BPy() != null) {
            C274524oV BPy = r4.BPy();
            if (BPy != null) {
                treeUpdaterJNI4 = BPy.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put(AnonymousClass000.A00(3567), treeUpdaterJNI4);
        }
        if (r4.CB4() != null) {
            C274524oV CB4 = r4.CB4();
            if (CB4 != null) {
                treeUpdaterJNI3 = CB4.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("ufi_like_destination", treeUpdaterJNI3);
        }
        if (r4.CB5() != null) {
            C274524oV CB5 = r4.CB5();
            if (CB5 != null) {
                treeUpdaterJNI2 = CB5.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("ufi_reply_destination", treeUpdaterJNI2);
        }
        if (r4.CB6() != null) {
            C274524oV CB6 = r4.CB6();
            if (CB6 != null) {
                treeUpdaterJNI = CB6.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("ufi_repost_destination", treeUpdaterJNI);
        }
        if (r4.CB7() != null) {
            C274524oV CB7 = r4.CB7();
            if (CB7 != null) {
                treeUpdaterJNI5 = CB7.FHC();
            }
            A1H.put("ufi_reshare_destination", treeUpdaterJNI5);
        }
        return 0Yt.A0B(A1H);
    }
}
