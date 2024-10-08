package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsMashupType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4G {
    public static Map A00(C67161s9 r4) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r4.getCanToggleMashupsAllowed();
        A1H.put("can_toggle_mashups_allowed", Boolean.valueOf(r4.getCanToggleMashupsAllowed()));
        if (r4.B7i() != null) {
            A1H.put("formatted_mashups_count", r4.B7i());
        }
        r4.getHasBeenMashedUp();
        A1H.put("has_been_mashed_up", Boolean.valueOf(r4.getHasBeenMashedUp()));
        if (r4.BBi() != null) {
            A1H.put("has_nonmimicable_additional_audio", r4.BBi());
        }
        r4.isCreatorRequestingMashup();
        A1H.put("is_creator_requesting_mashup", Boolean.valueOf(r4.isCreatorRequestingMashup()));
        if (r4.CWC() != null) {
            A1H.put("is_light_weight_check", r4.CWC());
        }
        if (r4.CWD() != null) {
            A1H.put("is_light_weight_reuse_allowed_check", r4.CWD());
        }
        r4.isPivotPageAvailable();
        A1H.put("is_pivot_page_available", Boolean.valueOf(r4.isPivotPageAvailable()));
        if (r4.Cav() != null) {
            A1H.put("is_reuse_allowed", r4.Cav());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (r4.BP2() != null) {
            ClipsMashupType BP2 = r4.BP2();
            if (BP2 != null) {
                str = BP2.A00;
            } else {
                str = null;
            }
            A1H.put("mashup_type", str);
        }
        r4.getMashupsAllowed();
        A1H.put("mashups_allowed", Boolean.valueOf(r4.getMashupsAllowed()));
        if (r4.BWT() != null) {
            A1H.put("non_privacy_filtered_mashups_media_count", r4.BWT());
        }
        if (r4.BZ6() != null) {
            C267284bJ BZ6 = r4.BZ6();
            if (BZ6 != null) {
                treeUpdaterJNI = BZ6.FHC();
            }
            A1H.put("original_media", treeUpdaterJNI);
        }
        if (r4.Bfn() != null) {
            A1H.put("privacy_filtered_mashups_media_count", r4.Bfn());
        }
        return 0Yt.A0B(A1H);
    }
}
