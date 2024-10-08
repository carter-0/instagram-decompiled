package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MessagingOffPlatformShareType implements Parcelable {
    UNRECOGNIZED("MessagingOffPlatformShareType_unspecified"),
    igbc_challenge("igbc_challenge"),
    igbc_challenge_submission("igbc_challenge_submission"),
    igbc_challenge_winners("igbc_challenge_winners"),
    igbc_challenge_winning_submission("igbc_challenge_winning_submission"),
    message(DialogModule.KEY_MESSAGE);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MessagingOffPlatformShareType[] messagingOffPlatformShareTypeArr;
        A02 = 0oU.A00(messagingOffPlatformShareTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MessagingOffPlatformShareType messagingOffPlatformShareType : values()) {
            A0x.put(messagingOffPlatformShareType.A00, messagingOffPlatformShareType);
        }
        A01 = A0x;
        CREATOR = FK5.A00(72);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MessagingOffPlatformShareType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
