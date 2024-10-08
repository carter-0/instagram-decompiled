package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CX3 {
    public static Map A00(AnonymousClass5DY r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.getId() != null) {
            C41845B3m.A0x(r4.getId(), A1H);
        }
        if (r4.BG7() != null) {
            A1H.put("image_height", r4.BG7());
        }
        if (r4.BGQ() != null) {
            A1H.put("image_width", r4.BGQ());
        }
        r4.CbA();
        A1H.put("is_save_allowed", Boolean.valueOf(r4.CbA()));
        if (r4.CbB() != null) {
            A1H.put("is_saved", r4.CbB());
        }
        if (r4.Cdc() != null) {
            A1H.put("is_trending", r4.Cdc());
        }
        if (r4.BRI() != null) {
            A1H.put("media_url", r4.BRI());
        }
        if (r4.Bxn() != null) {
            A1H.put("source_media_id", r4.Bxn());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.Bxp() != null) {
            AnonymousClass5DW Bxp = r4.Bxp();
            if (Bxp != null) {
                treeUpdaterJNI = Bxp.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("source_media_owner", treeUpdaterJNI);
        }
        if (r4.Bxs() != null) {
            A1H.put("source_media_username", r4.Bxs());
        }
        if (r4.BzX() != null) {
            AnonymousClass5DW BzX = r4.BzX();
            if (BzX != null) {
                treeUpdaterJNI2 = BzX.FHC();
            }
            A1H.put("sticker_creator", treeUpdaterJNI2);
        }
        if (r4.BzY() != null) {
            A1H.put("sticker_creator_username", r4.BzY());
        }
        if (r4.Bzb() != null) {
            A1H.put("sticker_duration", AnonymousClass7TH.A0D(r4.Bzb()));
        }
        if (r4.Bzp() != null) {
            A1H.put("sticker_type", r4.Bzp());
        }
        if (r4.getStrongId() != null) {
            A1H.put("strong_id__", r4.getStrongId());
        }
        return 0Yt.A0B(A1H);
    }
}
