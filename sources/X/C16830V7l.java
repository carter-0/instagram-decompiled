package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7l  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16830V7l {
    public static Map A00(C21030XAj xAj) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (xAj.ApO() != null) {
            C21031XAk ApO = xAj.ApO();
            if (ApO != null) {
                treeUpdaterJNI3 = ApO.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("comment_text", treeUpdaterJNI3);
        }
        if (xAj.BEM() != null) {
            C21032XAl BEM = xAj.BEM();
            if (BEM != null) {
                treeUpdaterJNI2 = BEM.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("icon_text", treeUpdaterJNI2);
        }
        if (xAj.BLl() != null) {
            NativeInfoCardCommentLayout BLl = xAj.BLl();
            if (BLl != null) {
                str = BLl.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("layout", str);
        }
        if (xAj.CCr() != null) {
            C21031XAk CCr = xAj.CCr();
            if (CCr != null) {
                treeUpdaterJNI = CCr.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("user_name", treeUpdaterJNI);
        }
        if (xAj.CCv() != null) {
            XAX CCv = xAj.CCv();
            if (CCv != null) {
                treeUpdaterJNI4 = CCv.FHC();
            }
            linkedHashMap.put("user_profile_pic", treeUpdaterJNI4);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
