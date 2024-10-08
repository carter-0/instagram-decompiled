package X;

import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VFg  reason: case insensitive filesystem */
public abstract class C17032VFg {
    public static UOB A00(AiAgentMetadataDict aiAgentMetadataDict, C21040XAt xAt, StoryJoinChatStatus storyJoinChatStatus, ChatStickerChannelType chatStickerChannelType, ChatStickerStickerType chatStickerStickerType, User user, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list) {
        UNW unw;
        ArrayList arrayList;
        AiAgentMetadataDictImpl aiAgentMetadataDictImpl = null;
        AnonymousClass7TH.A0K();
        if (aiAgentMetadataDict != null) {
            aiAgentMetadataDictImpl = aiAgentMetadataDict.F0Q();
        }
        if (xAt != null) {
            unw = xAt.F9h();
        } else {
            unw = null;
        }
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((XAY) it.next()).F9C());
            }
        } else {
            arrayList = null;
        }
        return new UOB(aiAgentMetadataDictImpl, unw, storyJoinChatStatus, chatStickerChannelType, chatStickerStickerType, user, bool, bool2, num, num2, num3, num4, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList);
    }
}
