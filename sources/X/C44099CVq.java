package X;

import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CVq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44099CVq {
    public static Map A00(ClipsTrialDict clipsTrialDict) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (clipsTrialDict.Akq() != null) {
            A1H.put("can_update_graduation_strategy", clipsTrialDict.Akq());
        }
        String str2 = null;
        if (clipsTrialDict.B9i() != null) {
            MediaTrialGraduationStrategy B9i = clipsTrialDict.B9i();
            if (B9i != null) {
                str = B9i.A00;
            } else {
                str = null;
            }
            A1H.put("graduation_strategy", str);
        }
        if (clipsTrialDict.Cay() != null) {
            A1H.put("is_revealed", clipsTrialDict.Cay());
        }
        if (clipsTrialDict.BzK() != null) {
            MediaTrialStatus BzK = clipsTrialDict.BzK();
            if (BzK != null) {
                str2 = BzK.A00;
            }
            A1H.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str2);
        }
        return 0Yt.A0B(A1H);
    }
}
