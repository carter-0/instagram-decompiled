package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cd9  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44327Cd9 {
    public static Map A00(SMBSupportStickerDictIntf sMBSupportStickerDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (sMBSupportStickerDictIntf.Aib() != null) {
            BusinessProfileDict Aib = sMBSupportStickerDictIntf.Aib();
            if (Aib != null) {
                treeUpdaterJNI = Aib.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("business_profile", treeUpdaterJNI);
        }
        if (sMBSupportStickerDictIntf.Air() != null) {
            A1H.put("button_text", sMBSupportStickerDictIntf.Air());
        }
        if (sMBSupportStickerDictIntf.Ais() != null) {
            A1H.put("button_text_color", sMBSupportStickerDictIntf.Ais());
        }
        if (sMBSupportStickerDictIntf.getCtaTitle() != null) {
            A1H.put("cta_title", sMBSupportStickerDictIntf.getCtaTitle());
        }
        if (sMBSupportStickerDictIntf.AtV() != null) {
            A1H.put("cta_url", sMBSupportStickerDictIntf.AtV());
        }
        if (sMBSupportStickerDictIntf.Axm() != null) {
            A1H.put("disclaimer", sMBSupportStickerDictIntf.Axm());
        }
        if (sMBSupportStickerDictIntf.getEndBackgroundColor() != null) {
            A1H.put("end_background_color", sMBSupportStickerDictIntf.getEndBackgroundColor());
        }
        if (sMBSupportStickerDictIntf.BZE() != null) {
            A1H.put(AnonymousClass000.A00(181), AnonymousClass7TH.A0D(sMBSupportStickerDictIntf.BZE()));
        }
        if (sMBSupportStickerDictIntf.Bao() != null) {
            A1H.put("partner_name", sMBSupportStickerDictIntf.Bao());
        }
        if (sMBSupportStickerDictIntf.getPk() != null) {
            A1H.put("pk", sMBSupportStickerDictIntf.getPk());
        }
        if (sMBSupportStickerDictIntf.Bso() != null) {
            SMBPartnerType Bso = sMBSupportStickerDictIntf.Bso();
            if (Bso != null) {
                str = Bso.A00;
            }
            A1H.put("service_type", str);
        }
        if (sMBSupportStickerDictIntf.getStartBackgroundColor() != null) {
            A1H.put("start_background_color", sMBSupportStickerDictIntf.getStartBackgroundColor());
        }
        if (sMBSupportStickerDictIntf.C2c() != null) {
            A1H.put("subtitle_color", sMBSupportStickerDictIntf.C2c());
        }
        if (sMBSupportStickerDictIntf.getTitle() != null) {
            C41845B3m.A12(sMBSupportStickerDictIntf.getTitle(), A1H);
        }
        if (sMBSupportStickerDictIntf.C7r() != null) {
            A1H.put("title_color", sMBSupportStickerDictIntf.C7r());
        }
        return 0Yt.A0B(A1H);
    }
}
