package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TextAppUserFavoriteNotificationPostType implements Parcelable {
    UNRECOGNIZED("TextAppUserFavoriteNotificationPostType_unspecified"),
    A04(NetInfoModule.CONNECTION_TYPE_NONE),
    POSTS_AND_REPLIES("posts_and_replies"),
    POSTS_ONLY("posts_only");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextAppUserFavoriteNotificationPostType[] textAppUserFavoriteNotificationPostTypeArr;
        A02 = 0oU.A00(textAppUserFavoriteNotificationPostTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType : values()) {
            A0x.put(textAppUserFavoriteNotificationPostType.A00, textAppUserFavoriteNotificationPostType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(32);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextAppUserFavoriteNotificationPostType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
