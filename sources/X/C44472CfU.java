package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CfU  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44472CfU {
    public static Map A00(DV6 dv6) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dv6.Ad0() != null) {
            A1H.put("attribution", dv6.Ad0());
        }
        if (dv6.AdC() != null) {
            A1H.put("attribution_url", dv6.AdC());
        }
        if (dv6.AqA() != null) {
            A1H.put("consumption_disabled_reason", dv6.AqA());
        }
        if (dv6.Auy() != null) {
            A1H.put("custom_text_color", dv6.Auy());
        }
        if (dv6.AyE() != null) {
            A1H.put("display_type", dv6.AyE());
        }
        if (dv6.B1i() != null) {
            C41846B3n.A1Q(dv6.B1i(), A1H);
        }
        if (dv6.BCt() != null) {
            C41846B3n.A1O(dv6.BCt(), A1H);
        }
        if (dv6.getId() != null) {
            C41845B3m.A0x(dv6.getId(), A1H);
        }
        if (dv6.CQW() != null) {
            A1H.put("is_consumption_disabled", dv6.CQW());
        }
        if (dv6.CTN() != null) {
            A1H.put("is_fb_sticker", dv6.CTN());
        }
        if (dv6.CUa() != null) {
            A1H.put("is_hidden", dv6.CUa());
        }
        if (dv6.CZ9() != null) {
            A1H.put("is_pinned", dv6.CZ9());
        }
        if (dv6.CcV() != null) {
            A1H.put("is_sticker", dv6.CcV());
        }
        if (dv6.getMediaId() != null) {
            C41845B3m.A13(dv6.getMediaId(), A1H);
        }
        if (dv6.getMediaType() != null) {
            A1H.put("media_type", dv6.getMediaType());
        }
        if (dv6.Bof() != null) {
            C41846B3n.A1P(dv6.Bof(), A1H);
        }
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (dv6.Bxg() != null) {
            UpcomingEventStickerSource Bxg = dv6.Bxg();
            if (Bxg != null) {
                str2 = Bxg.A00;
            } else {
                str2 = null;
            }
            A1H.put("source", str2);
        }
        if (dv6.Byt() != null) {
            C41846B3n.A1R(dv6.Byt(), A1H);
        }
        if (dv6.Bzj() != null) {
            A1H.put("sticker_style_enum", dv6.Bzj());
        }
        if (dv6.C2V() != null) {
            SubscriptionStickerDictIntf C2V = dv6.C2V();
            if (C2V != null) {
                treeUpdaterJNI2 = C2V.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("subscription_sticker", treeUpdaterJNI2);
        }
        if (dv6.C3E() != null) {
            StickerTraySurface C3E = dv6.C3E();
            if (C3E != null) {
                str = C3E.A00;
            } else {
                str = null;
            }
            A1H.put("surface", str);
        }
        if (dv6.C75() != null) {
            A1H.put("thumbnail_url", dv6.C75());
        }
        if (dv6.CBy() != null) {
            UpcomingEvent CBy = dv6.CBy();
            if (CBy != null) {
                treeUpdaterJNI = CBy.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("upcoming_event", treeUpdaterJNI);
        }
        if (dv6.CC0() != null) {
            UpcomingEventMedia CC0 = dv6.CC0();
            if (CC0 != null) {
                treeUpdaterJNI3 = CC0.FHC();
            }
            A1H.put("upcoming_event_media", treeUpdaterJNI3);
        }
        if (dv6.CGX() != null) {
            C41846B3n.A1N(dv6.CGX(), A1H);
        }
        if (dv6.CGt() != null) {
            C41846B3n.A1K(dv6.CGt(), A1H);
        }
        if (dv6.CHS() != null) {
            C41846B3n.A1L(dv6.CHS(), A1H);
        }
        if (dv6.CHZ() != null) {
            C41846B3n.A1M(dv6.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
