package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HU8 {
    public static Map A00(JSO jso) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (jso.getAttributionCtaActionUrl() != null) {
            A1H.put(AnonymousClass000.A00(2661), jso.getAttributionCtaActionUrl());
        }
        if (jso.getAttributionCtaText() != null) {
            A1H.put(AnonymousClass000.A00(2662), jso.getAttributionCtaText());
        }
        if (jso.getAttributionIconUrl() != null) {
            A1H.put(AnonymousClass000.A00(513), jso.getAttributionIconUrl());
        }
        if (jso.getAttributionSubtitle() != null) {
            A1H.put(AnonymousClass000.A00(2663), jso.getAttributionSubtitle());
        }
        if (jso.getAttributionTitle() != null) {
            A1H.put("attribution_title", jso.getAttributionTitle());
        }
        if (jso.getAttributionTopIconUrl() != null) {
            A1H.put(AnonymousClass000.A00(2665), jso.getAttributionTopIconUrl());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (jso.AdB() != null) {
            WearablesAppAttributionType AdB = jso.AdB();
            if (AdB != null) {
                str = AdB.A00;
            } else {
                str = null;
            }
            A1H.put("attribution_type", str);
        }
        if (jso.BES() != null) {
            A1H.put(AnonymousClass000.A00(3273), jso.BES());
        }
        if (jso.getIconicHorizonWorldDeeplink() != null) {
            A1H.put(AnonymousClass000.A00(3274), jso.getIconicHorizonWorldDeeplink());
        }
        if (jso.getIconicHorizonWorldId() != null) {
            A1H.put(AnonymousClass000.A00(3275), jso.getIconicHorizonWorldId());
        }
        if (jso.getIconicHorizonWorldName() != null) {
            A1H.put(AnonymousClass000.A00(3276), jso.getIconicHorizonWorldName());
        }
        jso.isWearableMediaProducer();
        A1H.put(AnonymousClass000.A00(3473), Boolean.valueOf(jso.isWearableMediaProducer()));
        if (jso.Bce() != null) {
            A1H.put("pivot_page_cta_label", jso.Bce());
        }
        if (jso.Bcf() != null) {
            A1H.put("pivot_page_cta_url", jso.Bcf());
        }
        if (jso.Bcg() != null) {
            A1H.put("pivot_page_description", jso.Bcg());
        }
        if (jso.Bci() != null) {
            A1H.put("pivot_page_image_url", jso.Bci());
        }
        User Bcj = jso.Bcj();
        if (Bcj != null) {
            A1H.put("pivot_page_micro_user_dict", Bcj.A08());
        }
        if (jso.Bck() != null) {
            A1H.put("pivot_page_title", jso.Bck());
        }
        if (jso.CGk() != null) {
            WorldLocationPagesInfo CGk = jso.CGk();
            if (CGk != null) {
                treeUpdaterJNI = CGk.FHC();
            }
            A1H.put(AnonymousClass000.A00(4221), treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
