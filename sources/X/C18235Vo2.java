package X;

import android.os.Parcelable;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vo2  reason: case insensitive filesystem */
public abstract class C18235Vo2 {
    public static UOB parseFromJson(16F r29) {
        String str;
        String str2;
        String str3;
        16F r4 = r29;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num = null;
            AiAgentMetadataDictImpl aiAgentMetadataDictImpl = null;
            String str4 = null;
            Integer num2 = null;
            ChatStickerChannelType chatStickerChannelType = null;
            Integer num3 = null;
            String str5 = null;
            Long l = null;
            String str6 = null;
            String str7 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str8 = null;
            Integer num4 = null;
            StoryJoinChatStatus storyJoinChatStatus = null;
            UNW unw = null;
            User user = null;
            String str9 = null;
            ArrayList arrayList = null;
            ChatStickerStickerType chatStickerStickerType = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("active_member_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if ("ai_agent_metadata".equals(A17)) {
                    aiAgentMetadataDictImpl = V74.parseFromJson(r4);
                } else if ("ai_agent_toast_msg".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("audience_type".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r4);
                } else if ("chat_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                    chatStickerChannelType = C17029VFd.A00(str3);
                } else if ("connected_member_count".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r4);
                } else if ("deeplink_url".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("duration_s".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r4);
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if ("group_image_uri".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                } else if ("is_creation".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if ("is_editing_enabled".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r4);
                } else if ("item_info".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r4.A1P();
                    }
                } else if ("member_count".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r4);
                } else if ("member_status".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                    storyJoinChatStatus = (StoryJoinChatStatus) StoryJoinChatStatus.A01.get(str2);
                    if (storyJoinChatStatus == null) {
                        storyJoinChatStatus = StoryJoinChatStatus.UNRECOGNIZED;
                    }
                } else if ("partial_render_info".equals(A17)) {
                    unw = C18122Vlq.parseFromJson(r4);
                } else if ("sender_info".equals(A17)) {
                    user = C41845B3m.A0a(r4, false);
                } else if ("share_source".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r4.A1P();
                    }
                } else if ("social_context_users".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            UNT parseFromJson = V87.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sticker_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    chatStickerStickerType = (ChatStickerStickerType) ChatStickerStickerType.A01.get(str);
                    if (chatStickerStickerType == null) {
                        chatStickerStickerType = ChatStickerStickerType.UNRECOGNIZED;
                    }
                } else if ("story_chat_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r4.A1P();
                    }
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r4.A1P();
                    }
                } else if ("thread_id_v2".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r4.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r4.A1P();
                    }
                }
                r4.A0z();
            }
            return new UOB(aiAgentMetadataDictImpl, unw, storyJoinChatStatus, chatStickerChannelType, chatStickerStickerType, user, bool, bool2, num, num2, num3, num4, l, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, UOB uob, boolean z) {
        if (z) {
            r4.A0c();
        }
        Integer num = uob.A08;
        if (num != null) {
            r4.A0P("active_member_count", num.intValue());
        }
        AiAgentMetadataDict aiAgentMetadataDict = uob.A00;
        if (aiAgentMetadataDict != null) {
            r4.A0q("ai_agent_metadata");
            AiAgentMetadataDictImpl F0Q = aiAgentMetadataDict.F0Q();
            r4.A0c();
            String str = F0Q.A01;
            if (str != null) {
                r4.A0R("ai_agent_ent_fbid", str);
            }
            String str2 = F0Q.A02;
            if (str2 != null) {
                r4.A0R("ai_agent_persona_fbid", str2);
            }
            IGAIAgentType iGAIAgentType = F0Q.A00;
            if (iGAIAgentType != null) {
                r4.A0R("ai_agent_type", iGAIAgentType.A00);
            }
            r4.A0Z();
        }
        String str3 = uob.A0D;
        if (str3 != null) {
            r4.A0R("ai_agent_toast_msg", str3);
        }
        Integer num2 = uob.A09;
        if (num2 != null) {
            r4.A0P("audience_type", num2.intValue());
        }
        ChatStickerChannelType chatStickerChannelType = uob.A03;
        if (chatStickerChannelType != null) {
            r4.A0R("chat_type", chatStickerChannelType.A00);
        }
        Integer num3 = uob.A0A;
        if (num3 != null) {
            r4.A0P("connected_member_count", num3.intValue());
        }
        String str4 = uob.A0E;
        if (str4 != null) {
            r4.A0R("deeplink_url", str4);
        }
        Long l = uob.A0C;
        if (l != null) {
            r4.A0Q("duration_s", l.longValue());
        }
        String str5 = uob.A0F;
        if (str5 != null) {
            r4.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
        }
        String str6 = uob.A0G;
        if (str6 != null) {
            r4.A0R("group_image_uri", str6);
        }
        Boolean bool = uob.A06;
        if (bool != null) {
            r4.A0S("is_creation", bool.booleanValue());
        }
        Boolean bool2 = uob.A07;
        if (bool2 != null) {
            r4.A0S("is_editing_enabled", bool2.booleanValue());
        }
        String str7 = uob.A0H;
        if (str7 != null) {
            r4.A0R("item_info", str7);
        }
        Integer num4 = uob.A0B;
        if (num4 != null) {
            r4.A0P("member_count", num4.intValue());
        }
        StoryJoinChatStatus storyJoinChatStatus = uob.A02;
        if (storyJoinChatStatus != null) {
            r4.A0R("member_status", storyJoinChatStatus.A00);
        }
        C21040XAt xAt = uob.A01;
        if (xAt != null) {
            r4.A0q("partial_render_info");
            C18122Vlq.A00(r4, xAt.F9h(), true);
        }
        User user = uob.A05;
        if (user != null) {
            r4.A0q("sender_info");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r4, user);
        }
        String str8 = uob.A0I;
        if (str8 != null) {
            r4.A0R("share_source", str8);
        }
        List list = uob.A0N;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "social_context_users", list);
            while (A0s.hasNext()) {
                UNT unt = (UNT) A0s.next();
                if (unt != null) {
                    r4.A0c();
                    String str9 = unt.A00;
                    if (str9 != null) {
                        r4.A0R("profile_pic_url", str9);
                    }
                    String str10 = unt.A01;
                    if (str10 != null) {
                        r4.A0R("user_igid", str10);
                    }
                    String str11 = unt.A02;
                    if (str11 != null) {
                        r4.A0R(C46367Ddj.A00(), str11);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        ChatStickerStickerType chatStickerStickerType = uob.A04;
        if (chatStickerStickerType != null) {
            r4.A0R("sticker_type", chatStickerStickerType.A00);
        }
        String str12 = uob.A0J;
        if (str12 != null) {
            r4.A0R("story_chat_id", str12);
        }
        String str13 = uob.A0K;
        if (str13 != null) {
            r4.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str13);
        }
        String str14 = uob.A0L;
        if (str14 != null) {
            r4.A0R("thread_id_v2", str14);
        }
        C41846B3n.A10(r4, uob.A0M);
        if (z) {
            r4.A0Z();
        }
    }
}
