package X;

import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HbP  reason: case insensitive filesystem */
public abstract /* synthetic */ class C55054HbP {
    public static Map A00(JSN jsn) {
        String str;
        String str2;
        String str3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str4 = null;
        if (jsn.Aes() != null) {
            IGAdsCardBackgroundTypeEnum Aes = jsn.Aes();
            if (Aes != null) {
                str3 = Aes.A00;
            } else {
                str3 = null;
            }
            A1H.put("background_type", str3);
        }
        if (jsn.AnS() != null) {
            IGAdsCardStickerClickAreaEnum AnS = jsn.AnS();
            if (AnS != null) {
                str2 = AnS.A00;
            } else {
                str2 = null;
            }
            A1H.put("click_area", str2);
        }
        if (jsn.Aqz() != null) {
            A1H.put("context_headline", jsn.Aqz());
        }
        if (jsn.AtH() != null) {
            A1H.put("cta_highlight_dwell_time_duration_ms", jsn.AtH());
        }
        if (jsn.AtS() != null) {
            IGAdsCardStickerCTATypeEnum AtS = jsn.AtS();
            if (AtS != null) {
                str = AtS.A00;
            } else {
                str = null;
            }
            A1H.put("cta_type", str);
        }
        if (jsn.Azf() != null) {
            A1H.put("dynamic_tooltip_time_duration_ms", jsn.Azf());
        }
        if (jsn.Bun() != null) {
            A1H.put("should_show_SUG", jsn.Bun());
        }
        if (jsn.Bui() != null) {
            A1H.put("should_show_revamp_sticker_design", jsn.Bui());
        }
        if (jsn.Bzd() != null) {
            A1H.put("sticker_icon_url", jsn.Bzd());
        }
        if (jsn.Bzg() != null) {
            IGAdsCardStickerSizeEnum Bzg = jsn.Bzg();
            if (Bzg != null) {
                str4 = Bzg.A00;
            }
            A1H.put("sticker_size", str4);
        }
        return 0Yt.A0B(A1H);
    }
}
