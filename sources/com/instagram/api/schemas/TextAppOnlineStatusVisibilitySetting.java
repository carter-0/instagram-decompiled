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

public enum TextAppOnlineStatusVisibilitySetting implements Parcelable {
    UNRECOGNIZED("TextAppOnlineStatusVisibilitySetting_unspecified"),
    DEFAULT_UNSET("DEFAULT_UNSET"),
    DEPRECATED_FOLLOWERS("DEPRECATED_FOLLOWERS"),
    DEPRECATED_NOBODY("DEPRECATED_NOBODY"),
    EVERYONE("EVERYONE"),
    FOLLOWERS("FOLLOWERS"),
    FOLLOWERS_YOU_FOLLOW("FOLLOWERS_YOU_FOLLOW");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextAppOnlineStatusVisibilitySetting[] textAppOnlineStatusVisibilitySettingArr;
        A02 = 0oU.A00(textAppOnlineStatusVisibilitySettingArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting : values()) {
            A0x.put(textAppOnlineStatusVisibilitySetting.A00, textAppOnlineStatusVisibilitySetting);
        }
        A01 = A0x;
        CREATOR = FK6.A00(26);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextAppOnlineStatusVisibilitySetting(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
