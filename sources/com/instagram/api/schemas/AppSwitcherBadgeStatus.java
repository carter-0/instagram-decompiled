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

public enum AppSwitcherBadgeStatus implements Parcelable {
    UNRECOGNIZED("AppSwitcherBadgeStatus_unspecified"),
    HIDE_TEXT_POST_APP_SWITCHER_BADGE("hide_text_post_app_switcher_badge"),
    SHOW_TEXT_POST_APP_SWITCHER_BADGE("show_text_post_app_switcher_badge"),
    HIDE_IG_APP_SWITCHER_BADGE("hide_ig_app_switcher_badge"),
    SHOW_IG_APP_SWITCHER_BADGE("show_ig_app_switcher_badge");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AppSwitcherBadgeStatus[] appSwitcherBadgeStatusArr;
        A02 = 0oU.A00(appSwitcherBadgeStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AppSwitcherBadgeStatus appSwitcherBadgeStatus : values()) {
            A0x.put(appSwitcherBadgeStatus.A00, appSwitcherBadgeStatus);
        }
        A01 = A0x;
        CREATOR = new SWT(41);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AppSwitcherBadgeStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
