package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import java.io.IOException;

/* renamed from: X.Vlp  reason: case insensitive filesystem */
public abstract class C18121Vlp {
    public static UNV parseFromJson(16F r12) {
        String str;
        String str2;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            String str3 = null;
            ChatStickerChannelType chatStickerChannelType = null;
            ChatStickerStickerType chatStickerStickerType = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("audience_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("challenge_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("chat_type".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                    chatStickerChannelType = C17029VFd.A00(str2);
                } else if ("sticker_type".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    chatStickerStickerType = (ChatStickerStickerType) ChatStickerStickerType.A01.get(str);
                    if (chatStickerStickerType == null) {
                        chatStickerStickerType = ChatStickerStickerType.UNRECOGNIZED;
                    }
                } else if ("story_chat_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if (C41845B3m.A1A(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if ("thread_id_v2".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r12.A1P();
                    }
                } else if ("thread_igid".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r12.A1P();
                    }
                } else if ("thread_title".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            return new UNV(chatStickerChannelType, chatStickerStickerType, num, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNV unv, boolean z) {
        if (z) {
            r2.A0c();
        }
        Integer num = unv.A02;
        if (num != null) {
            r2.A0P("audience_type", num.intValue());
        }
        String str = unv.A03;
        if (str != null) {
            r2.A0R("challenge_id", str);
        }
        ChatStickerChannelType chatStickerChannelType = unv.A00;
        if (chatStickerChannelType != null) {
            r2.A0R("chat_type", chatStickerChannelType.A00);
        }
        ChatStickerStickerType chatStickerStickerType = unv.A01;
        if (chatStickerStickerType != null) {
            r2.A0R("sticker_type", chatStickerStickerType.A00);
        }
        String str2 = unv.A04;
        if (str2 != null) {
            r2.A0R("story_chat_id", str2);
        }
        C41846B3n.A0z(r2, unv.A05);
        String str3 = unv.A06;
        if (str3 != null) {
            r2.A0R("thread_id_v2", str3);
        }
        String str4 = unv.A07;
        if (str4 != null) {
            r2.A0R("thread_igid", str4);
        }
        String str5 = unv.A08;
        if (str5 != null) {
            r2.A0R("thread_title", str5);
        }
        if (z) {
            r2.A0Z();
        }
    }
}
