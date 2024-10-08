package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VIu  reason: case insensitive filesystem */
public abstract class C17124VIu {
    public static void A00(Map map) {
        String string = DbV.A0d().getString("live_chat_nonce", (String) null);
        if (string != null && string.length() != 0) {
            C250873mC r1 = C250863mB.A03;
            C255463uA[] r0 = LiveChatNonceList.A01;
            Iterator it = ((LiveChatNonceList) r1.A00(string, C20516Wsw.A00)).A00.iterator();
            while (it.hasNext()) {
                LiveChatNonce liveChatNonce = (LiveChatNonce) it.next();
                map.put(liveChatNonce.A02, liveChatNonce);
            }
        }
    }
}
