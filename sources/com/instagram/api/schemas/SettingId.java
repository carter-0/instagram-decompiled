package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SettingId implements Parcelable {
    UNRECOGNIZED("SettingId_unspecified"),
    ARCHIVING_SAVE_LIVE_TO_ARCHIVE("archiving_save_live_to_archive"),
    ARCHIVING_SAVE_ORIGINAL_PHOTOS("archiving_save_original_photos"),
    ARCHIVING_SAVE_STORY_TO_ARCHIVE("archiving_save_story_to_archive"),
    ARCHIVING_SAVE_STORY_TO_CAMERA_GALLERY("archiving_save_story_to_camera_gallery"),
    ARCHIVING_SAVE_STORY_TO_GALLERY("archiving_save_story_to_gallery"),
    TAGS_MENTIONS_WHO_CAN_BOOST("tags_mentions_who_can_boost"),
    TAGS_MENTIONS_WHO_CAN_MENTION("tags_mentions_who_can_mention"),
    TAGS_MENTIONS_WHO_CAN_TAG("tags_mentions_who_can_tag"),
    TAGS_MENTIONS_WHO_CAN_TAG_ON_OTHER_APPS("tags_mentions_who_can_tag_on_other_apps");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        SettingId[] settingIdArr;
        A02 = 0oU.A00(settingIdArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (SettingId settingId : values()) {
            A0x.put(settingId.A00, settingId);
        }
        A01 = A0x;
        CREATOR = new DE6(75);
    }

    /* access modifiers changed from: public */
    SettingId(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
