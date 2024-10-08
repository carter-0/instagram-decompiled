package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V89 {
    public static Map A00(XB0 xb0) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xb0.Ad0() != null) {
            linkedHashMap.put("attribution", xb0.Ad0());
        }
        if (xb0.AdC() != null) {
            linkedHashMap.put("attribution_url", xb0.AdC());
        }
        String str = null;
        if (xb0.AgP() != null) {
            DU3 AgP = xb0.AgP();
            if (AgP != null) {
                treeUpdaterJNI2 = AgP.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("bloks_sticker", treeUpdaterJNI2);
        }
        if (xb0.Auy() != null) {
            linkedHashMap.put("custom_text_color", xb0.Auy());
        }
        if (xb0.AyE() != null) {
            linkedHashMap.put("display_type", xb0.AyE());
        }
        if (xb0.B1i() != null) {
            C41846B3n.A1Q(xb0.B1i(), linkedHashMap);
        }
        if (xb0.BCt() != null) {
            C41846B3n.A1O(xb0.BCt(), linkedHashMap);
        }
        if (xb0.getId() != null) {
            C41845B3m.A0x(xb0.getId(), linkedHashMap);
        }
        if (xb0.CTN() != null) {
            linkedHashMap.put("is_fb_sticker", xb0.CTN());
        }
        if (xb0.CUa() != null) {
            linkedHashMap.put("is_hidden", xb0.CUa());
        }
        if (xb0.CZ9() != null) {
            linkedHashMap.put("is_pinned", xb0.CZ9());
        }
        if (xb0.CcV() != null) {
            linkedHashMap.put("is_sticker", xb0.CcV());
        }
        if (xb0.getMediaType() != null) {
            linkedHashMap.put("media_type", xb0.getMediaType());
        }
        if (xb0.Bof() != null) {
            C41846B3n.A1P(xb0.Bof(), linkedHashMap);
        }
        if (xb0.Byt() != null) {
            C41846B3n.A1R(xb0.Byt(), linkedHashMap);
        }
        if (xb0.Bzj() != null) {
            linkedHashMap.put("sticker_style_enum", xb0.Bzj());
        }
        if (xb0.C2V() != null) {
            SubscriptionStickerDictIntf C2V = xb0.C2V();
            if (C2V != null) {
                treeUpdaterJNI = C2V.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("subscription_sticker", treeUpdaterJNI);
        }
        if (xb0.C3E() != null) {
            StickerTraySurface C3E = xb0.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            linkedHashMap.put("surface", str);
        }
        if (xb0.CGX() != null) {
            C41846B3n.A1N(xb0.CGX(), linkedHashMap);
        }
        if (xb0.CGt() != null) {
            C41846B3n.A1K(xb0.CGt(), linkedHashMap);
        }
        if (xb0.CHS() != null) {
            C41846B3n.A1L(xb0.CHS(), linkedHashMap);
        }
        if (xb0.CHZ() != null) {
            C41846B3n.A1M(xb0.CHZ(), linkedHashMap);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
