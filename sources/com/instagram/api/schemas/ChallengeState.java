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

public enum ChallengeState implements Parcelable {
    UNRECOGNIZED("ChallengeState_unspecified"),
    COMPLETED("completed"),
    MISSED("missed"),
    NOT_STARTED("not_started"),
    STARTED("started");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ChallengeState[] challengeStateArr;
        A02 = 0oU.A00(challengeStateArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ChallengeState challengeState : values()) {
            A0x.put(challengeState.A00, challengeState);
        }
        A01 = A0x;
        CREATOR = new SWT(89);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ChallengeState(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
