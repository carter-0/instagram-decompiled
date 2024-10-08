package X;

import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cfa  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44478Cfa {
    public static Map A00(SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        User AsS = subscriptionStickerDictIntf.AsS();
        if (AsS != null) {
            A1H.put("creator", AsS.A08());
        }
        if (subscriptionStickerDictIntf.AsX() != null) {
            A1H.put("creator_id", subscriptionStickerDictIntf.AsX());
        }
        if (subscriptionStickerDictIntf.Asb() != null) {
            A1H.put("creator_profile_pic_url", subscriptionStickerDictIntf.Asb());
        }
        if (subscriptionStickerDictIntf.Asi() != null) {
            A1H.put("creator_username", subscriptionStickerDictIntf.Asi());
        }
        return 0Yt.A0B(A1H);
    }
}
