package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CkD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44744CkD {
    public static Map A00(AnonymousClass5FT r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.getCanViewerReshare();
        A1H.put("can_viewer_reshare", Boolean.valueOf(r3.getCanViewerReshare()));
        if (r3.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, r3.getDescription());
        }
        r3.B5Z();
        A1H.put(C273654mx.A00(287), Boolean.valueOf(r3.B5Z()));
        r3.BEV();
        C41845B3m.A0x(Long.valueOf(r3.BEV()), A1H);
        r3.CRY();
        A1H.put("is_draft", Boolean.valueOf(r3.CRY()));
        if (r3.BTT() != null) {
            DTY BTT = r3.BTT();
            if (BTT != null) {
                treeUpdaterJNI = BTT.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("mixed_cover_media", treeUpdaterJNI);
        }
        r3.BWv();
        A1H.put("num_items", Integer.valueOf(r3.BWv()));
        if (r3.BZw() != null) {
            A1H.put("owner", r3.BZw().A08());
        }
        if (r3.getTitle() != null) {
            C41845B3m.A12(r3.getTitle(), A1H);
        }
        if (r3.CAN() != null) {
            GuideTypeStr CAN = r3.CAN();
            0qQ.A0B(CAN, 0);
            C41845B3m.A11(CAN.A00, A1H);
        }
        r3.CC8();
        return C41845B3m.A0u("updated_timestamp", Long.valueOf(r3.CC8()), A1H);
    }
}
