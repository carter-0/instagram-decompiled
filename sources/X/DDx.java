package X;

import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;

public abstract class DDx {
    public static final ImageUrl A00(EffectPreviewIntf effectPreviewIntf) {
        EffectThumbnailImageDictIntf C6y = effectPreviewIntf.C6y();
        if (C6y != null) {
            return C6y.CCI();
        }
        return null;
    }

    public static final EffectPreview A01(EffectPreviewIntf effectPreviewIntf, boolean z) {
        String str;
        EffectActionSheet effectActionSheet;
        AttributionUser AdD = effectPreviewIntf.AdD();
        String Awu = effectPreviewIntf.Awu();
        EffectActionSheetIntf Azy = effectPreviewIntf.Azy();
        String effectId = effectPreviewIntf.getEffectId();
        String failureCode = effectPreviewIntf.getFailureCode();
        String failureReason = effectPreviewIntf.getFailureReason();
        String formattedClipsMediaCount = effectPreviewIntf.getFormattedClipsMediaCount();
        ImageUrl BEO = effectPreviewIntf.BEO();
        String id = effectPreviewIntf.getId();
        Boolean COY = effectPreviewIntf.COY();
        String name = effectPreviewIntf.getName();
        effectPreviewIntf.getSaveStatus();
        EffectThumbnailImageDictIntf C6y = effectPreviewIntf.C6y();
        String title = effectPreviewIntf.getTitle();
        if (z) {
            str = "SAVED";
        } else {
            str = "NOT_SAVED";
        }
        AttributionUserImpl F0a = AdD.F0a();
        EffectThumbnailImageDict effectThumbnailImageDict = null;
        if (Azy != null) {
            effectActionSheet = Azy.FE0();
        } else {
            effectActionSheet = null;
        }
        if (C6y != null) {
            effectThumbnailImageDict = C6y.FFI();
        }
        return new EffectPreview(F0a, BEO, effectActionSheet, effectThumbnailImageDict, COY, Awu, effectId, failureCode, failureReason, formattedClipsMediaCount, id, name, str, title);
    }

    public static final String A02(EffectPreviewIntf effectPreviewIntf) {
        String instagramUserId = effectPreviewIntf.AdD().getInstagramUserId();
        if (instagramUserId == null) {
            return "";
        }
        return instagramUserId;
    }

    public static final String A03(EffectPreviewIntf effectPreviewIntf) {
        String username = effectPreviewIntf.AdD().getUsername();
        if (username == null) {
            return "";
        }
        return username;
    }

    public static final boolean A04(EffectPreviewIntf effectPreviewIntf) {
        return AnonymousClass7TF.A1V(effectPreviewIntf.getFailureReason());
    }

    public static final boolean A05(EffectPreviewIntf effectPreviewIntf) {
        return AnonymousClass7TF.A1Y(effectPreviewIntf.AdD().CeL(), true);
    }
}
