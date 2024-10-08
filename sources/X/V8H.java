package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8H {
    public static Map A00(XB4 xb4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xb4.Ad0() != null) {
            linkedHashMap.put("attribution", xb4.Ad0());
        }
        if (xb4.AdC() != null) {
            linkedHashMap.put("attribution_url", xb4.AdC());
        }
        if (xb4.Auy() != null) {
            linkedHashMap.put("custom_text_color", xb4.Auy());
        }
        if (xb4.AyE() != null) {
            linkedHashMap.put("display_type", xb4.AyE());
        }
        if (xb4.B1i() != null) {
            C41846B3n.A1Q(xb4.B1i(), linkedHashMap);
        }
        if (xb4.BCt() != null) {
            C41846B3n.A1O(xb4.BCt(), linkedHashMap);
        }
        if (xb4.getId() != null) {
            C41845B3m.A0x(xb4.getId(), linkedHashMap);
        }
        if (xb4.CTN() != null) {
            linkedHashMap.put("is_fb_sticker", xb4.CTN());
        }
        if (xb4.CUa() != null) {
            linkedHashMap.put("is_hidden", xb4.CUa());
        }
        if (xb4.CZ9() != null) {
            linkedHashMap.put("is_pinned", xb4.CZ9());
        }
        if (xb4.CcV() != null) {
            linkedHashMap.put("is_sticker", xb4.CcV());
        }
        if (xb4.getMediaType() != null) {
            linkedHashMap.put("media_type", xb4.getMediaType());
        }
        if (xb4.Bhx() != null) {
            linkedHashMap.put("prompt_v2_id", xb4.Bhx());
        }
        if (xb4.Bof() != null) {
            C41846B3n.A1P(xb4.Bof(), linkedHashMap);
        }
        if (xb4.Byt() != null) {
            C41846B3n.A1R(xb4.Byt(), linkedHashMap);
        }
        if (xb4.Bzj() != null) {
            linkedHashMap.put("sticker_style_enum", xb4.Bzj());
        }
        if (xb4.C2G() != null) {
            linkedHashMap.put("submission_id", xb4.C2G());
        }
        String str = null;
        if (xb4.C2V() != null) {
            SubscriptionStickerDictIntf C2V = xb4.C2V();
            if (C2V != null) {
                treeUpdaterJNI = C2V.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("subscription_sticker", treeUpdaterJNI);
        }
        if (xb4.C3E() != null) {
            StickerTraySurface C3E = xb4.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            linkedHashMap.put("surface", str);
        }
        if (xb4.C6D() != null) {
            linkedHashMap.put("thread_id_v2", xb4.C6D());
        }
        if (xb4.C6E() != null) {
            linkedHashMap.put("thread_igid", xb4.C6E());
        }
        if (xb4.CGX() != null) {
            C41846B3n.A1N(xb4.CGX(), linkedHashMap);
        }
        if (xb4.CGt() != null) {
            C41846B3n.A1K(xb4.CGt(), linkedHashMap);
        }
        if (xb4.CHS() != null) {
            C41846B3n.A1L(xb4.CHS(), linkedHashMap);
        }
        if (xb4.CHZ() != null) {
            C41846B3n.A1M(xb4.CHZ(), linkedHashMap);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
