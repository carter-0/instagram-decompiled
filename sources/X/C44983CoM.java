package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CoM  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44983CoM {
    public static Map A00(DUY duy) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duy.BrC() != null) {
            A1H.put("seen", duy.BrC());
        }
        if (duy.CA7() != null) {
            A1H.put("ts", duy.CA7());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        C41846B3n.A1J(duy.CCd(), A1H);
        if (duy.CFC() != null) {
            FriendshipStatus CFC = duy.CFC();
            if (CFC != null) {
                treeUpdaterJNI = CFC.FHC();
            }
            A1H.put("viewer_relationship_info", treeUpdaterJNI);
        }
        if (duy.CFy() != null) {
            A1H.put("vote", duy.CFy());
        }
        return 0Yt.A0B(A1H);
    }
}
