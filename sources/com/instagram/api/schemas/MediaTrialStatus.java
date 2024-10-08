package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaTrialStatus implements Parcelable {
    UNRECOGNIZED("MediaTrialStatus_unspecified"),
    ACTIVE(AppStateModule.APP_STATE_ACTIVE),
    GRADUATED("graduated");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaTrialStatus[] mediaTrialStatusArr;
        A02 = 0oU.A00(mediaTrialStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaTrialStatus mediaTrialStatus : values()) {
            A0x.put(mediaTrialStatus.A00, mediaTrialStatus);
        }
        A01 = A0x;
        CREATOR = FK5.A00(70);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaTrialStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
