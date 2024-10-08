package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.LinkedHashMap;
import java.util.Map;

public enum GuideTypeStr implements Parcelable {
    UNRECOGNIZED("GuideTypeStr_unspecified"),
    ACCOUNTS("accounts"),
    LOCATIONS("locations"),
    MIXED(BaseViewManager.STATE_MIXED),
    POSTS("posts");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        GuideTypeStr[] guideTypeStrArr;
        A02 = 0oU.A00(guideTypeStrArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (GuideTypeStr guideTypeStr : values()) {
            A0x.put(guideTypeStr.A00, guideTypeStr);
        }
        A01 = A0x;
        CREATOR = DE7.A00(95);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    GuideTypeStr(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
