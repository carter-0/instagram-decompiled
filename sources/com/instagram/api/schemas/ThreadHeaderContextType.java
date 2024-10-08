package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ThreadHeaderContextType implements Parcelable {
    UNRECOGNIZED("ThreadHeaderContextType_unspecified"),
    FIRST_POST("first_post"),
    REPOST("repost"),
    SIMILAR_FOLLOWED_AUTHOR("similar_followed_author"),
    SIMILAR_LIKED_AUTHOR("similar_liked_author"),
    SOCIAL_FOLLOW("social_follow"),
    SOCIAL_FOLLOW_CHAIN("social_follow_chain"),
    SOCIAL_FOLLOW_MUTUAL_FOLLOWEE("social_follow_mutual_followee");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ThreadHeaderContextType[] threadHeaderContextTypeArr;
        A02 = 0oU.A00(threadHeaderContextTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ThreadHeaderContextType threadHeaderContextType : values()) {
            A0x.put(threadHeaderContextType.A00, threadHeaderContextType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(43);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ThreadHeaderContextType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
