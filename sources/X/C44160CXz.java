package X;

import com.instagram.api.schemas.GatingResponseType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44160CXz {
    public static Map A00(C278084wF r5) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.Aac() != null) {
            A1H.put("alert_buttons", r5.Aac());
        }
        if (r5.Aad() != null) {
            A1H.put("alert_description", r5.Aad());
        }
        if (r5.Aae() != null) {
            A1H.put("alert_title", r5.Aae());
        }
        if (r5.Ag9() != null) {
            A1H.put("blocks_logging_data", r5.Ag9());
        }
        if (r5.Aj1() != null) {
            A1H.put("buttons", r5.Aj1());
        }
        if (r5.AmR() != null) {
            A1H.put("center_button", r5.AmR());
        }
        if (r5.AvR() != null) {
            A1H.put("date_gated_formatted", r5.AvR());
        }
        if (r5.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, r5.getDescription());
        }
        if (r5.B8x() != null) {
            GatingResponseType B8x = r5.B8x();
            if (B8x != null) {
                str = B8x.A00;
            } else {
                str = null;
            }
            A1H.put("gating_type", str);
        }
        if (r5.BQK() != null) {
            A1H.put("media_igid", r5.BQK());
        }
        if (r5.BTS() != null) {
            A1H.put("misinformation_type", r5.BTS());
        }
        if (r5.BZb() != null) {
            A1H.put("over_text", r5.BZb());
        }
        if (r5.BeH() != null) {
            A1H.put("post_reveal_cta", r5.BeH());
        }
        if (r5.getSessionId() != null) {
            A1H.put(Dbk.A01(0, 10, 78), r5.getSessionId());
        }
        if (r5.Bvh() != null) {
            A1H.put("show_notice", r5.Bvh());
        }
        if (r5.C7K() != null) {
            A1H.put("time_gated", r5.C7K());
        }
        if (r5.getTitle() != null) {
            C41845B3m.A12(r5.getTitle(), A1H);
        }
        if (r5.CBI() != null) {
            A1H.put("under_text", r5.CBI());
        }
        return 0Yt.A0B(A1H);
    }
}
