package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryMusicPickTappableDataIntf;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8E {
    public static Map A00(XB2 xb2) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xb2.Ad0() != null) {
            linkedHashMap.put("attribution", xb2.Ad0());
        }
        if (xb2.AdC() != null) {
            linkedHashMap.put("attribution_url", xb2.AdC());
        }
        if (xb2.Auy() != null) {
            linkedHashMap.put("custom_text_color", xb2.Auy());
        }
        if (xb2.AyE() != null) {
            linkedHashMap.put("display_type", xb2.AyE());
        }
        if (xb2.B1i() != null) {
            C41846B3n.A1Q(xb2.B1i(), linkedHashMap);
        }
        if (xb2.BCt() != null) {
            C41846B3n.A1O(xb2.BCt(), linkedHashMap);
        }
        if (xb2.getId() != null) {
            C41845B3m.A0x(xb2.getId(), linkedHashMap);
        }
        if (xb2.CTN() != null) {
            linkedHashMap.put("is_fb_sticker", xb2.CTN());
        }
        if (xb2.CUa() != null) {
            linkedHashMap.put("is_hidden", xb2.CUa());
        }
        if (xb2.CZ9() != null) {
            linkedHashMap.put("is_pinned", xb2.CZ9());
        }
        if (xb2.CcV() != null) {
            linkedHashMap.put("is_sticker", xb2.CcV());
        }
        if (xb2.getMediaType() != null) {
            linkedHashMap.put("media_type", xb2.getMediaType());
        }
        String str = null;
        if (xb2.BUv() != null) {
            StoryMusicPickTappableDataIntf BUv = xb2.BUv();
            if (BUv != null) {
                treeUpdaterJNI2 = BUv.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("music_pick_sticker", treeUpdaterJNI2);
        }
        if (xb2.Bof() != null) {
            C41846B3n.A1P(xb2.Bof(), linkedHashMap);
        }
        if (xb2.Byt() != null) {
            C41846B3n.A1R(xb2.Byt(), linkedHashMap);
        }
        if (xb2.Bzj() != null) {
            linkedHashMap.put("sticker_style_enum", xb2.Bzj());
        }
        if (xb2.C2V() != null) {
            SubscriptionStickerDictIntf C2V = xb2.C2V();
            if (C2V != null) {
                treeUpdaterJNI = C2V.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("subscription_sticker", treeUpdaterJNI);
        }
        if (xb2.C3E() != null) {
            StickerTraySurface C3E = xb2.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            linkedHashMap.put("surface", str);
        }
        if (xb2.CGX() != null) {
            C41846B3n.A1N(xb2.CGX(), linkedHashMap);
        }
        if (xb2.CGt() != null) {
            C41846B3n.A1K(xb2.CGt(), linkedHashMap);
        }
        if (xb2.CHS() != null) {
            C41846B3n.A1L(xb2.CHS(), linkedHashMap);
        }
        if (xb2.CHZ() != null) {
            C41846B3n.A1M(xb2.CHZ(), linkedHashMap);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
