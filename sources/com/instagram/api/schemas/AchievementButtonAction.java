package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AchievementButtonAction implements Parcelable {
    UNRECOGNIZED("AchievementButtonAction_unspecified"),
    CREATE_POST("create_post"),
    CREATE_REEL("create_reel"),
    CREATE_STORY("create_story"),
    DEEPLINK("deeplink"),
    SHARE_TO_STORY_WITH_MEDIA("share_to_story_with_media");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AchievementButtonAction[] achievementButtonActionArr;
        A02 = 0oU.A00(achievementButtonActionArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AchievementButtonAction achievementButtonAction : values()) {
            A0x.put(achievementButtonAction.A00, achievementButtonAction);
        }
        A01 = A0x;
        CREATOR = SWT.A00(19);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AchievementButtonAction(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
