package com.instagram.reels.chat.model;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ChatStickerChannelType implements Parcelable {
    UNRECOGNIZED("ChatStickerChannelType_unspecified"),
    AI_AGENT("ai_agent"),
    BROADCAST("broadcast"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    DISCOVERABLE("discoverable"),
    LEGACY_CHAT_STICKER(""),
    SUBSCRIBER("subscriber");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ChatStickerChannelType[] chatStickerChannelTypeArr;
        A02 = 0oU.A00(chatStickerChannelTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ChatStickerChannelType chatStickerChannelType : values()) {
            linkedHashMap.put(chatStickerChannelType.A00, chatStickerChannelType);
        }
        A01 = linkedHashMap;
        CREATOR = new LVO(94);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ChatStickerChannelType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
