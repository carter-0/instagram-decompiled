package X;

import com.instagram.api.schemas.NoteChatResponseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Caw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44235Caw {
    public static Map A00(NoteChatResponseInfo noteChatResponseInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (noteChatResponseInfo.B9v() != null) {
            A1H.put("group_chat_hash", noteChatResponseInfo.B9v());
        }
        noteChatResponseInfo.CXA();
        A1H.put("is_member", Boolean.valueOf(noteChatResponseInfo.CXA()));
        if (noteChatResponseInfo.BLC() != null) {
            A1H.put("last_num_members", noteChatResponseInfo.BLC());
        }
        noteChatResponseInfo.BWz();
        A1H.put("num_members", Integer.valueOf(noteChatResponseInfo.BWz()));
        if (noteChatResponseInfo.BxY() != null) {
            List BxY = noteChatResponseInfo.BxY();
            ArrayList A0r = AnonymousClass7TG.A0r(BxY);
            Iterator it = BxY.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("social_context_users", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
