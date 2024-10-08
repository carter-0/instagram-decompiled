package com.facebook.iabadscontext;

import X.0oU;
import X.Pxg;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public enum MessagingExtensionType implements Parcelable {
    WHATSAPP,
    MESSENGER;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        MessagingExtensionType[] messagingExtensionTypeArr;
        A00 = 0oU.A00(messagingExtensionTypeArr);
        CREATOR = SWZ.A01(7);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
