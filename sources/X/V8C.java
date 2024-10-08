package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8C {
    public static Map A00(XB1 xb1) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xb1.Ad0() != null) {
            linkedHashMap.put("attribution", xb1.Ad0());
        }
        if (xb1.AdC() != null) {
            linkedHashMap.put("attribution_url", xb1.AdC());
        }
        if (xb1.Auy() != null) {
            linkedHashMap.put("custom_text_color", xb1.Auy());
        }
        if (xb1.AyE() != null) {
            linkedHashMap.put("display_type", xb1.AyE());
        }
        if (xb1.B1i() != null) {
            C41846B3n.A1Q(xb1.B1i(), linkedHashMap);
        }
        if (xb1.BCt() != null) {
            C41846B3n.A1O(xb1.BCt(), linkedHashMap);
        }
        if (xb1.getId() != null) {
            C41845B3m.A0x(xb1.getId(), linkedHashMap);
        }
        if (xb1.CTN() != null) {
            linkedHashMap.put("is_fb_sticker", xb1.CTN());
        }
        if (xb1.CUa() != null) {
            linkedHashMap.put("is_hidden", xb1.CUa());
        }
        if (xb1.CZ9() != null) {
            linkedHashMap.put("is_pinned", xb1.CZ9());
        }
        if (xb1.CcV() != null) {
            linkedHashMap.put("is_sticker", xb1.CcV());
        }
        String str = null;
        if (xb1.BJh() != null) {
            XB3 BJh = xb1.BJh();
            if (BJh != null) {
                treeUpdaterJNI2 = BJh.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("join_chat_sticker", treeUpdaterJNI2);
        }
        if (xb1.getMediaType() != null) {
            linkedHashMap.put("media_type", xb1.getMediaType());
        }
        if (xb1.Bof() != null) {
            C41846B3n.A1P(xb1.Bof(), linkedHashMap);
        }
        if (xb1.Byt() != null) {
            C41846B3n.A1R(xb1.Byt(), linkedHashMap);
        }
        if (xb1.Bzj() != null) {
            linkedHashMap.put("sticker_style_enum", xb1.Bzj());
        }
        if (xb1.C2V() != null) {
            SubscriptionStickerDictIntf C2V = xb1.C2V();
            if (C2V != null) {
                treeUpdaterJNI = C2V.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("subscription_sticker", treeUpdaterJNI);
        }
        if (xb1.C3E() != null) {
            StickerTraySurface C3E = xb1.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            linkedHashMap.put("surface", str);
        }
        if (xb1.CGX() != null) {
            C41846B3n.A1N(xb1.CGX(), linkedHashMap);
        }
        if (xb1.CGt() != null) {
            C41846B3n.A1K(xb1.CGt(), linkedHashMap);
        }
        if (xb1.CHS() != null) {
            C41846B3n.A1L(xb1.CHS(), linkedHashMap);
        }
        if (xb1.CHZ() != null) {
            C41846B3n.A1M(xb1.CHZ(), linkedHashMap);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
