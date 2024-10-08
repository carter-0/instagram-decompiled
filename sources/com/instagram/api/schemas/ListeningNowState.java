package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ListeningNowState implements Parcelable {
    UNRECOGNIZED("ListeningNowState_unspecified"),
    ERROR("ERROR"),
    EXPIRED("EXPIRED"),
    LISTENING_INVALID_SONG("LISTENING_INVALID_SONG"),
    LISTENING_VALID_SONG("LISTENING_VALID_SONG"),
    NOT_LISTENING("NOT_LISTENING");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ListeningNowState[] listeningNowStateArr;
        A02 = 0oU.A00(listeningNowStateArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ListeningNowState listeningNowState : values()) {
            A0x.put(listeningNowState.A00, listeningNowState);
        }
        A01 = A0x;
        CREATOR = FK5.A00(55);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ListeningNowState(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
