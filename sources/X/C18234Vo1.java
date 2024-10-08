package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.Vo1  reason: case insensitive filesystem */
public abstract class C18234Vo1 {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.WaH, java.lang.Object] */
    public static final C19469WaH A01(UOB uob) {
        ? obj = new Object();
        obj.A00 = uob;
        obj.A01 = false;
        obj.A03 = false;
        obj.A02 = false;
        return obj;
    }

    public static final ChatStickerChannelType A00(int i) {
        if (i == 29) {
            return ChatStickerChannelType.BROADCAST;
        }
        if (AnonymousClass48O.A02(i)) {
            return ChatStickerChannelType.SUBSCRIBER;
        }
        if (AnonymousClass48O.A01(i)) {
            return ChatStickerChannelType.DISCOVERABLE;
        }
        if (AnonymousClass48O.A06(Integer.valueOf(i))) {
            return ChatStickerChannelType.AI_AGENT;
        }
        return ChatStickerChannelType.UNRECOGNIZED;
    }
}
