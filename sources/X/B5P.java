package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B5P {
    public static Map A00(C255693uZ r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Ad0() != null) {
            A1H.put("attribution", r4.Ad0());
        }
        if (r4.AdC() != null) {
            A1H.put("attribution_url", r4.AdC());
        }
        if (r4.Auy() != null) {
            A1H.put("custom_text_color", r4.Auy());
        }
        if (r4.AyE() != null) {
            A1H.put("display_type", r4.AyE());
        }
        if (r4.B1i() != null) {
            C41846B3n.A1Q(r4.B1i(), A1H);
        }
        if (r4.BCt() != null) {
            C41846B3n.A1O(r4.BCt(), A1H);
        }
        if (r4.getId() != null) {
            C41845B3m.A0x(r4.getId(), A1H);
        }
        if (r4.CTN() != null) {
            A1H.put("is_fb_sticker", r4.CTN());
        }
        if (r4.CUa() != null) {
            A1H.put("is_hidden", r4.CUa());
        }
        if (r4.CZ9() != null) {
            A1H.put("is_pinned", r4.CZ9());
        }
        if (r4.CcV() != null) {
            A1H.put("is_sticker", r4.CcV());
        }
        if (r4.getMediaType() != null) {
            A1H.put("media_type", r4.getMediaType());
        }
        String str = null;
        if (r4.BUl() != null) {
            MusicOverlayStickerModelIntf BUl = r4.BUl();
            if (BUl != null) {
                treeUpdaterJNI3 = BUl.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("music_asset_info", treeUpdaterJNI3);
        }
        if (r4.BZB() != null) {
            OriginalSoundDataIntf BZB = r4.BZB();
            if (BZB != null) {
                treeUpdaterJNI2 = BZB.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("original_sound_info", treeUpdaterJNI2);
        }
        if (r4.Bof() != null) {
            C41846B3n.A1P(r4.Bof(), A1H);
        }
        if (r4.Byt() != null) {
            C41846B3n.A1R(r4.Byt(), A1H);
        }
        if (r4.Bzj() != null) {
            A1H.put("sticker_style_enum", r4.Bzj());
        }
        if (r4.C2V() != null) {
            SubscriptionStickerDictIntf C2V = r4.C2V();
            if (C2V != null) {
                treeUpdaterJNI = C2V.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("subscription_sticker", treeUpdaterJNI);
        }
        if (r4.C3E() != null) {
            StickerTraySurface C3E = r4.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            A1H.put("surface", str);
        }
        if (r4.CGX() != null) {
            C41846B3n.A1N(r4.CGX(), A1H);
        }
        if (r4.CGt() != null) {
            C41846B3n.A1K(r4.CGt(), A1H);
        }
        if (r4.CHS() != null) {
            C41846B3n.A1L(r4.CHS(), A1H);
        }
        if (r4.CHZ() != null) {
            C41846B3n.A1M(r4.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
