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

public enum RemoteStringSettingId implements Parcelable {
    UNRECOGNIZED("RemoteStringSettingId_unspecified"),
    ACCOUNT_SCREEN_HEADER("account_screen_header"),
    ALLOW_WEBSITE_EMBEDS("allow_website_embeds"),
    DAILY_LIMIT("daily_limit"),
    MESSAGE_REACHABILITY_GROUP_MESSAGE("message_reachability_group_message"),
    MESSAGE_REACHABILITY_IG_VERIFIED("message_reachability_ig_verified"),
    MESSAGE_REACHABILITY_ONE_ON_ONE_MESSAGE("message_reachability_one_on_one_message"),
    SENSITIVE_CONTENT_CONTROL("sensitive_content_control"),
    SERVER_TEST_ONLY_DO_NOT_USE("server_test_only_do_not_use"),
    SHARE_STORY_TO_FACEBOOK("share_story_to_facebook"),
    SLEEP_MODE_WINDOW("sleep_mode_window"),
    TAGS_MENTIONS_WHO_CAN_MENTION("tags_mentions_who_can_mention"),
    TAGS_MENTIONS_WHO_CAN_TAG("tags_mentions_who_can_tag"),
    WHO_CAN_REMIX_OR_REUSE_YOUR_CONTENT("who_can_remix_or_reuse_your_content");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        RemoteStringSettingId[] remoteStringSettingIdArr;
        A02 = 0oU.A00(remoteStringSettingIdArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RemoteStringSettingId remoteStringSettingId : values()) {
            A0x.put(remoteStringSettingId.A00, remoteStringSettingId);
        }
        A01 = A0x;
        CREATOR = new DE6(68);
    }

    /* access modifiers changed from: public */
    RemoteStringSettingId(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
