package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ck7  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44739Ck7 {
    public static Map A00(C46312DUp dUp) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUp.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, dUp.getDescription());
        }
        if (dUp.getId() != null) {
            C41845B3m.A0x(dUp.getId(), A1H);
        }
        if (dUp.BTT() != null) {
            DTY BTT = dUp.BTT();
            if (BTT != null) {
                treeUpdaterJNI = BTT.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("mixed_cover_media", treeUpdaterJNI);
        }
        dUp.BWv();
        A1H.put("num_items", Integer.valueOf(dUp.BWv()));
        if (dUp.getTitle() != null) {
            C41845B3m.A12(dUp.getTitle(), A1H);
        }
        if (dUp.CAN() != null) {
            GuideTypeStr CAN = dUp.CAN();
            0qQ.A0B(CAN, 0);
            C41845B3m.A11(CAN.A00, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
