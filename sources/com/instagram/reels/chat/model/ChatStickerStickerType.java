package com.instagram.reels.chat.model;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ChatStickerStickerType implements Parcelable {
    UNRECOGNIZED("ChatStickerStickerType_unspecified"),
    AGENT_PROFILE_STICKER("agent_profile_sticker"),
    CHALLENGE_STICKER("challenge_sticker"),
    CLIPS_JOIN_CHAT_STICKER("clips_join_chat_sticker"),
    JOIN_CHAT_STICKER("join_chat_sticker"),
    LEGACY(""),
    MESSAGE_STICKER("message_sticker");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ChatStickerStickerType[] chatStickerStickerTypeArr;
        A02 = 0oU.A00(chatStickerStickerTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ChatStickerStickerType chatStickerStickerType : values()) {
            linkedHashMap.put(chatStickerStickerType.A00, chatStickerStickerType);
        }
        A01 = linkedHashMap;
        CREATOR = new LVO(95);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ChatStickerStickerType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
