package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProfileBannerType implements Parcelable {
    UNRECOGNIZED("ProfileBannerType_unspecified"),
    ADD_SCHOOL("ADD_SCHOOL"),
    AI_AGENTS("AI_AGENTS"),
    CHANNEL("CHANNEL"),
    FACEBOOK_PAGE("FACEBOOK_PAGE"),
    FACEBOOK_PROFILE("FACEBOOK_PROFILE"),
    FUNDRAISER("FUNDRAISER"),
    INVALID("INVALID"),
    MUSIC("MUSIC"),
    RELATED_ACCOUNTS("RELATED_ACCOUNTS"),
    SCHOOL("SCHOOL"),
    THREADS("THREADS"),
    UPCOMING_EVENTS("UPCOMING_EVENTS"),
    WHATSAPP_PROFILE("WHATSAPP_PROFILE");
    
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
        ProfileBannerType[] profileBannerTypeArr;
        A02 = 0oU.A00(profileBannerTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ProfileBannerType profileBannerType : values()) {
            linkedHashMap.put(profileBannerType.A00, profileBannerType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(4);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProfileBannerType(String str) {
        this.A00 = str;
    }
}
