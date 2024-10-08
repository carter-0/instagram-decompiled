package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum InstagramMediaProductType implements Parcelable {
    DEFAULT_DO_NOT_USE,
    AD,
    AR_EFFECT_PREVIEW,
    CAROUSEL_CONTAINER,
    CAROUSEL_ITEM,
    CLIPS,
    COWATCH_LOCAL,
    DIRECT_PERMANENT,
    FEED,
    FUNDRAISER_COVER,
    DIRECT,
    DIRECT_AUDIO,
    GUIDE_MEDIA_FACADE,
    IGTV,
    LIVE,
    NAMETAG,
    PROFILE_PIC,
    SELFIE_STICKER,
    STORY;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        InstagramMediaProductType[] instagramMediaProductTypeArr;
        A00 = 0oU.A00(instagramMediaProductTypeArr);
        CREATOR = new W6D(25);
    }

    public final String toString() {
        return name();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
