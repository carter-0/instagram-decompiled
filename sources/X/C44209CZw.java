package X;

import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CZw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44209CZw {
    public static Map A00(DTG dtg) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dtg.Amz();
        A1H.put("chat_id", Long.valueOf(dtg.Amz()));
        dtg.BIu();
        A1H.put("inviter_id", Long.valueOf(dtg.BIu()));
        if (dtg.BzJ() != null) {
            IGLiveFriendChatGuestStatus BzJ = dtg.BzJ();
            0qQ.A0B(BzJ, 0);
            A1H.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, BzJ.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
