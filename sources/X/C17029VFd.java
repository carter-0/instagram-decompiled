package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.VFd  reason: case insensitive filesystem */
public abstract class C17029VFd {
    public static final ChatStickerChannelType A00(String str) {
        ChatStickerChannelType chatStickerChannelType = (ChatStickerChannelType) ChatStickerChannelType.A01.get(str);
        if (chatStickerChannelType == null) {
            return ChatStickerChannelType.UNRECOGNIZED;
        }
        return chatStickerChannelType;
    }
}
