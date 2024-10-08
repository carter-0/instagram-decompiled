package X;

import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.Cyz  reason: case insensitive filesystem */
public abstract class C45587Cyz {
    public static BFL parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("chat_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r13);
                } else if ("inviter_id".equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r13);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    iGLiveFriendChatGuestStatus = (IGLiveFriendChatGuestStatus) IGLiveFriendChatGuestStatus.A01.get(str);
                    if (iGLiveFriendChatGuestStatus == null) {
                        iGLiveFriendChatGuestStatus = IGLiveFriendChatGuestStatus.UNRECOGNIZED;
                    }
                }
                r13.A0z();
            }
            if (l == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("chat_id", r13, "LiveChatInfo");
            } else if (l2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("inviter_id", r13, "LiveChatInfo");
            } else if (iGLiveFriendChatGuestStatus != null || !(r13 instanceof 0c9)) {
                return new BFL(iGLiveFriendChatGuestStatus, l.longValue(), l2.longValue());
            } else {
                AnonymousClass7TF.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r13, "LiveChatInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, BFL bfl) {
        r3.A0c();
        r3.A0Q("chat_id", bfl.A00);
        r3.A0Q("inviter_id", bfl.A01);
        IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus = bfl.A02;
        if (iGLiveFriendChatGuestStatus != null) {
            r3.A0R(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, iGLiveFriendChatGuestStatus.A00);
        }
        r3.A0Z();
    }
}
