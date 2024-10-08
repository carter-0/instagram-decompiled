package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.ProfilePicture;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4q  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41872B4q {
    public static Map A00(AttributionUser attributionUser) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (attributionUser.getInstagramUserId() != null) {
            A1H.put("instagram_user_id", attributionUser.getInstagramUserId());
        }
        if (attributionUser.CeL() != null) {
            A1H.put("is_verified", attributionUser.CeL());
        }
        if (attributionUser.Bh6() != null) {
            ProfilePicture Bh6 = attributionUser.Bh6();
            if (Bh6 != null) {
                treeUpdaterJNI = Bh6.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("profile_picture", treeUpdaterJNI);
        }
        if (attributionUser.getUsername() != null) {
            A1H.put(Dbk.A00(), attributionUser.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
