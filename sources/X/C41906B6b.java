package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B6b  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41906B6b {
    public static Map A00(C279484yi r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.BGO() != null) {
            ImageInfo BGO = r3.BGO();
            if (BGO != null) {
                treeUpdaterJNI = BGO.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("image_versions2", treeUpdaterJNI);
        }
        if (r3.getOwnerUsername() != null) {
            A1H.put("owner_username", r3.getOwnerUsername());
        }
        if (r3.getTemplateMediaId() != null) {
            A1H.put("template_media_id", r3.getTemplateMediaId());
        }
        return 0Yt.A0B(A1H);
    }
}
