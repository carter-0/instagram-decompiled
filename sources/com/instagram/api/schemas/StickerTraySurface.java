package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StickerTraySurface implements Parcelable {
    UNRECOGNIZED("StickerTraySurface_unspecified"),
    AQR("AQR"),
    AVATAR_INFO("AVATAR_INFO"),
    CLIPS("CLIPS"),
    CLIPS_AVATAR_STICKER_TRAY("CLIPS_AVATAR_STICKER_TRAY"),
    CLIPS_MUSIC_AVATAR_STICKER_TRAY("CLIPS_MUSIC_AVATAR_STICKER_TRAY"),
    CLIPS_STICKER_TRAY("CLIPS_STICKER_TRAY"),
    COIN_FLIP("COIN_FLIP"),
    COMMENTS("COMMENTS"),
    COMMENTS_CONTEXTUAL_RECOMMENDATION("COMMENTS_CONTEXTUAL_RECOMMENDATION"),
    CREATION("CREATION"),
    DIRECT("DIRECT"),
    DIRECT_RESHARE("DIRECT_RESHARE"),
    DYI("DYI"),
    FEED("FEED"),
    GROUP_STORIES("GROUP_STORIES"),
    IOS_SHARE_EXTENSION("IOS_SHARE_EXTENSION"),
    LIVE_REACTION("LIVE_REACTION"),
    MEME_IT("MEME_IT"),
    NOTES("NOTES"),
    NOTE_REPLY("NOTE_REPLY"),
    POKES("POKES"),
    POST_AVATAR_CREATION("POST_AVATAR_CREATION"),
    PROFILE("PROFILE"),
    STICKER_TRAY("STICKER_TRAY"),
    STORIES("STORIES"),
    STORIES_AVATAR_SOCIAL_STICKER_TRAY("STORIES_AVATAR_SOCIAL_STICKER_TRAY"),
    STORIES_AVATAR_SOCIAL_STICKER_TRAY_POG("STORIES_AVATAR_SOCIAL_STICKER_TRAY_POG"),
    STORIES_AVATAR_SOCIAL_STICKER_TRAY_SEARCH("STORIES_AVATAR_SOCIAL_STICKER_TRAY_SEARCH"),
    STORIES_AVATAR_STICKER_TRAY("STORIES_AVATAR_STICKER_TRAY"),
    STORIES_GLOBAL_SEARCH_STICKER_TRAY("STORIES_GLOBAL_SEARCH_STICKER_TRAY"),
    STORIES_MUSIC_AVATAR_STICKER_TRAY("STORIES_MUSIC_AVATAR_STICKER_TRAY"),
    STORIES_QUICK_REACTION_AVATAR_STICKER_GRID("STORIES_QUICK_REACTION_AVATAR_STICKER_GRID"),
    STORIES_RESHARE_AVATAR_STICKER_TRAY("STORIES_RESHARE_AVATAR_STICKER_TRAY");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StickerTraySurface[] stickerTraySurfaceArr;
        A02 = 0oU.A00(stickerTraySurfaceArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (StickerTraySurface stickerTraySurface : values()) {
            linkedHashMap.put(stickerTraySurface.A00, stickerTraySurface);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(89);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StickerTraySurface(String str) {
        this.A00 = str;
    }
}
