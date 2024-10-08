package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4r  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41873B4r {
    public static Map A00(EffectPreviewIntf effectPreviewIntf) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (effectPreviewIntf.AdD() != null) {
            A1H.put("attribution_user", effectPreviewIntf.AdD().FHC());
        }
        if (effectPreviewIntf.Awu() != null) {
            A1H.put(C66579MXk.A00(12), effectPreviewIntf.Awu());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (effectPreviewIntf.Azy() != null) {
            EffectActionSheetIntf Azy = effectPreviewIntf.Azy();
            if (Azy != null) {
                treeUpdaterJNI = Azy.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("effect_action_sheet", treeUpdaterJNI);
        }
        if (effectPreviewIntf.getEffectId() != null) {
            A1H.put("effect_id", effectPreviewIntf.getEffectId());
        }
        if (effectPreviewIntf.getFailureCode() != null) {
            A1H.put("failure_code", effectPreviewIntf.getFailureCode());
        }
        if (effectPreviewIntf.getFailureReason() != null) {
            A1H.put(TraceFieldType.FailureReason, effectPreviewIntf.getFailureReason());
        }
        if (effectPreviewIntf.getFormattedClipsMediaCount() != null) {
            A1H.put("formatted_clips_media_count", effectPreviewIntf.getFormattedClipsMediaCount());
        }
        if (effectPreviewIntf.BEO() != null) {
            ImageUrl BEO = effectPreviewIntf.BEO();
            if (BEO != null) {
                str = BEO.getUrl();
            } else {
                str = null;
            }
            A1H.put("icon_url", str);
        }
        if (effectPreviewIntf.getId() != null) {
            C41845B3m.A0x(effectPreviewIntf.getId(), A1H);
        }
        if (effectPreviewIntf.COY() != null) {
            A1H.put("is_age_restricted", effectPreviewIntf.COY());
        }
        if (effectPreviewIntf.getName() != null) {
            C41845B3m.A0z(effectPreviewIntf.getName(), A1H);
        }
        if (effectPreviewIntf.getSaveStatus() != null) {
            A1H.put("save_status", effectPreviewIntf.getSaveStatus());
        }
        if (effectPreviewIntf.C6y() != null) {
            EffectThumbnailImageDictIntf C6y = effectPreviewIntf.C6y();
            if (C6y != null) {
                treeUpdaterJNI2 = C6y.FHC();
            }
            A1H.put("thumbnail_image", treeUpdaterJNI2);
        }
        if (effectPreviewIntf.getTitle() != null) {
            C41845B3m.A12(effectPreviewIntf.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
