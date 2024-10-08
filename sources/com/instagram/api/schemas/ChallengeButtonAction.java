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

public enum ChallengeButtonAction implements Parcelable {
    UNRECOGNIZED("ChallengeButtonAction_unspecified"),
    CREATE_POST("create_post"),
    CREATE_REEL("create_reel"),
    CREATE_STORY("create_story"),
    DEEPLINK("deeplink"),
    END_CHALLENGE("end_challenge"),
    OPEN_DETAILS_BOTTOMSHEET("open_details_bottomsheet");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ChallengeButtonAction[] challengeButtonActionArr;
        A02 = 0oU.A00(challengeButtonActionArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ChallengeButtonAction challengeButtonAction : values()) {
            A0x.put(challengeButtonAction.A00, challengeButtonAction);
        }
        A01 = A0x;
        CREATOR = SWT.A00(85);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ChallengeButtonAction(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
