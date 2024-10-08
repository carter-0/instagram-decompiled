package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8G {
    public static Map A00(AnonymousClass5B2 r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.Ad0() != null) {
            linkedHashMap.put("attribution", r4.Ad0());
        }
        if (r4.AdC() != null) {
            linkedHashMap.put("attribution_url", r4.AdC());
        }
        if (r4.Auy() != null) {
            linkedHashMap.put("custom_text_color", r4.Auy());
        }
        if (r4.AyE() != null) {
            linkedHashMap.put("display_type", r4.AyE());
        }
        if (r4.B1i() != null) {
            C41846B3n.A1Q(r4.B1i(), linkedHashMap);
        }
        if (r4.BCt() != null) {
            C41846B3n.A1O(r4.BCt(), linkedHashMap);
        }
        if (r4.getId() != null) {
            C41845B3m.A0x(r4.getId(), linkedHashMap);
        }
        if (r4.CTN() != null) {
            linkedHashMap.put("is_fb_sticker", r4.CTN());
        }
        if (r4.CUa() != null) {
            linkedHashMap.put("is_hidden", r4.CUa());
        }
        if (r4.CZ9() != null) {
            linkedHashMap.put("is_pinned", r4.CZ9());
        }
        if (r4.CcV() != null) {
            linkedHashMap.put("is_sticker", r4.CcV());
        }
        if (r4.getMediaType() != null) {
            linkedHashMap.put("media_type", r4.getMediaType());
        }
        String str = null;
        if (r4.Bhq() != null) {
            StoryPromptTappableDataIntf Bhq = r4.Bhq();
            if (Bhq != null) {
                treeUpdaterJNI2 = Bhq.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("prompt_sticker", treeUpdaterJNI2);
        }
        if (r4.Bof() != null) {
            C41846B3n.A1P(r4.Bof(), linkedHashMap);
        }
        if (r4.Byt() != null) {
            C41846B3n.A1R(r4.Byt(), linkedHashMap);
        }
        if (r4.Bzj() != null) {
            linkedHashMap.put("sticker_style_enum", r4.Bzj());
        }
        if (r4.C2V() != null) {
            SubscriptionStickerDictIntf C2V = r4.C2V();
            if (C2V != null) {
                treeUpdaterJNI = C2V.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("subscription_sticker", treeUpdaterJNI);
        }
        if (r4.C3E() != null) {
            StickerTraySurface C3E = r4.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            linkedHashMap.put("surface", str);
        }
        if (r4.CGX() != null) {
            C41846B3n.A1N(r4.CGX(), linkedHashMap);
        }
        if (r4.CGt() != null) {
            C41846B3n.A1K(r4.CGt(), linkedHashMap);
        }
        if (r4.CHS() != null) {
            C41846B3n.A1L(r4.CHS(), linkedHashMap);
        }
        if (r4.CHZ() != null) {
            C41846B3n.A1M(r4.CHZ(), linkedHashMap);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
