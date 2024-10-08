package com.instagram.api.schemas;

import X.0oU;
import X.DbY;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum InstagramMediaProductType implements Parcelable {
    UNRECOGNIZED("InstagramMediaProductType_unspecified"),
    AD("AD"),
    AR_EFFECT_PREVIEW("AR_EFFECT_PREVIEW"),
    BIO_LINK("BIO_LINK"),
    CAROUSEL_CONTAINER("CAROUSEL_CONTAINER"),
    CAROUSEL_CONTRIBUTED_ITEM("CAROUSEL_CONTRIBUTED_ITEM"),
    CAROUSEL_ITEM("CAROUSEL_ITEM"),
    CLIPS("CLIPS"),
    CLIPS_PREVIEW("CLIPS_PREVIEW"),
    CLIPS_SPIN("CLIPS_SPIN"),
    CONTAINER("CONTAINER"),
    CONTAINER_ITEM("CONTAINER_ITEM"),
    COWATCH_LOCAL("COWATCH_LOCAL"),
    CUSTOM_STICKER("CUSTOM_STICKER"),
    DEFAULT_DO_NOT_USE("DEFAULT_DO_NOT_USE"),
    DIRECT("DIRECT"),
    DIRECT_AUDIO("DIRECT_AUDIO"),
    DIRECT_AVATAR_STICKER("DIRECT_AVATAR_STICKER"),
    DIRECT_HEADMOJI("DIRECT_HEADMOJI"),
    DIRECT_MESSAGE_COMMENT_FACADE("DIRECT_MESSAGE_COMMENT_FACADE"),
    DIRECT_PERMANENT("DIRECT_PERMANENT"),
    DIRECT_THREAD("DIRECT_THREAD"),
    FEED("FEED"),
    FUNDRAISER_COVER("FUNDRAISER_COVER"),
    GUIDE_MEDIA_FACADE("GUIDE_MEDIA_FACADE"),
    HIGHLIGHT_POST_FACADE("HIGHLIGHT_POST_FACADE"),
    IGTV("IGTV"),
    LIVE("LIVE"),
    LIVE_ARCHIVE("LIVE_ARCHIVE"),
    MEDIA_KIT("MEDIA_KIT"),
    MESSAGING_PAYMENTS("MESSAGING_PAYMENTS"),
    NAMETAG("NAMETAG"),
    NOTE_AUDIO("NOTE_AUDIO"),
    NOTE_POG_VIDEO("NOTE_POG_VIDEO"),
    PENDING_CAROUSEL_ITEM("PENDING_CAROUSEL_ITEM"),
    PROFILE_PIC("PROFILE_PIC"),
    QUICK_SNAP("QUICK_SNAP"),
    RATINGS_AND_REVIEWS("RATINGS_AND_REVIEWS"),
    REPOST_MEDIA_FACADE("REPOST_MEDIA_FACADE"),
    REUSABLE_TEMPLATE_ASSETS("REUSABLE_TEMPLATE_ASSETS"),
    ROLLS("ROLLS"),
    SCHEDULED_LIVE("SCHEDULED_LIVE"),
    SELFIE_STICKER("SELFIE_STICKER"),
    STORY("STORY"),
    STORY_INTERACTION_RESPONSE("STORY_INTERACTION_RESPONSE"),
    STORY_TEMPLATE_ASSET("STORY_TEMPLATE_ASSET"),
    SUPERLATIVES("SUPERLATIVES"),
    TEXT_POST("TEXT_POST"),
    UNDERLYING_SPINNABLE_CLIP_VIDEO("UNDERLYING_SPINNABLE_CLIP_VIDEO"),
    UNDERLYING_STORY_AD("UNDERLYING_STORY_AD"),
    VIDEO_REACTION("VIDEO_REACTION"),
    WALL_MEDIA("WALL_MEDIA");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        InstagramMediaProductType[] instagramMediaProductTypeArr;
        A02 = 0oU.A00(instagramMediaProductTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (InstagramMediaProductType instagramMediaProductType : values()) {
            linkedHashMap.put(instagramMediaProductType.A00, instagramMediaProductType);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(39);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    InstagramMediaProductType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
