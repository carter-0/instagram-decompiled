package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FBBioLinkSocialContextType implements Parcelable {
    UNRECOGNIZED("FBBioLinkSocialContextType_unspecified"),
    FOLLOWER_COUNT("follower_count"),
    MUTUAL_FOLLOWERS("mutual_followers"),
    MUTUAL_FRIENDS("mutual_friends"),
    NEW_POSTS("new_posts"),
    A08(NetInfoModule.CONNECTION_TYPE_NONE);
    
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
        FBBioLinkSocialContextType[] fBBioLinkSocialContextTypeArr;
        A02 = 0oU.A00(fBBioLinkSocialContextTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (FBBioLinkSocialContextType fBBioLinkSocialContextType : values()) {
            linkedHashMap.put(fBBioLinkSocialContextType.A00, fBBioLinkSocialContextType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(98);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FBBioLinkSocialContextType(String str) {
        this.A00 = str;
    }
}
