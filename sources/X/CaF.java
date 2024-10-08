package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CaF {
    public static Map A00(DUN dun) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dun.getMediaId() != null) {
            C41845B3m.A13(dun.getMediaId(), A1H);
        }
        if (dun.BWb() != null) {
            MediaNoticeIcon BWb = dun.BWb();
            if (BWb != null) {
                str = BWb.A00;
            } else {
                str = null;
            }
            A1H.put("notice_icon", str);
        }
        if (dun.getNoticeSubText() != null) {
            A1H.put("notice_sub_text", dun.getNoticeSubText());
        }
        if (dun.getNoticeText() != null) {
            A1H.put("notice_text", dun.getNoticeText());
        }
        if (dun.getNoticeUrl() != null) {
            A1H.put("notice_url", dun.getNoticeUrl());
        }
        if (dun.BoS() != null) {
            A1H.put("ridge_match_id", dun.BoS());
        }
        return 0Yt.A0B(A1H);
    }
}
