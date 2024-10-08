package X;

import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cmt  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44903Cmt {
    public static Map A00(C46305DUi dUi) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUi.B1T() != null) {
            A1H.put("end_index", dUi.B1T());
        }
        if (dUi.BKD() != null) {
            A1H.put("keyword_background_color", dUi.BKD());
        }
        if (dUi.BKE() != null) {
            A1H.put("keyword_color", dUi.BKE());
        }
        String str2 = null;
        if (dUi.BKH() != null) {
            StoryAdKeywordStyleEnum BKH = dUi.BKH();
            if (BKH != null) {
                str = BKH.A00;
            } else {
                str = null;
            }
            A1H.put("keyword_style", str);
        }
        if (dUi.BKI() != null) {
            StoryAdKeywordTypeEnum BKI = dUi.BKI();
            if (BKI != null) {
                str2 = BKI.A00;
            }
            A1H.put("keyword_type", str2);
        }
        if (dUi.Byg() != null) {
            A1H.put("start_index", dUi.Byg());
        }
        if (dUi.C83() != null) {
            A1H.put("token", dUi.C83());
        }
        return 0Yt.A0B(A1H);
    }
}
