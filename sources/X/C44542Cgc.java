package X;

import com.instagram.api.schemas.TopicIntf;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cgc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44542Cgc {
    public static Map A00(TopicIntf topicIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (topicIntf.getStatus() != null) {
            A1H.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, topicIntf.getStatus());
        }
        if (topicIntf.C8W() != null) {
            A1H.put("topic_id", topicIntf.C8W());
        }
        return 0Yt.A0B(A1H);
    }
}
