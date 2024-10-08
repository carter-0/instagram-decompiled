package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8A {
    public static Map A00(C21039XAs xAs) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAs.AdO() != null) {
            linkedHashMap.put("audience_type", xAs.AdO());
        }
        if (xAs.Amd() != null) {
            linkedHashMap.put("challenge_id", xAs.Amd());
        }
        String str2 = null;
        if (xAs.An3() != null) {
            ChatStickerChannelType An3 = xAs.An3();
            if (An3 != null) {
                str = An3.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("chat_type", str);
        }
        if (xAs.Bzn() != null) {
            ChatStickerStickerType Bzn = xAs.Bzn();
            if (Bzn != null) {
                str2 = Bzn.A00;
            }
            linkedHashMap.put("sticker_type", str2);
        }
        if (xAs.C0I() != null) {
            linkedHashMap.put("story_chat_id", xAs.C0I());
        }
        if (xAs.getText() != null) {
            linkedHashMap.put("text", xAs.getText());
        }
        if (xAs.C6D() != null) {
            linkedHashMap.put("thread_id_v2", xAs.C6D());
        }
        if (xAs.C6E() != null) {
            linkedHashMap.put("thread_igid", xAs.C6E());
        }
        if (xAs.C6f() != null) {
            linkedHashMap.put("thread_title", xAs.C6f());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
