package com.instagram.settings.privacy.messages;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public enum DirectMessageInteropReachabilityOptions implements Parcelable {
    A0D("inbox", 0, 2131966255, 2131966255),
    A0G("message_requests", 1, 2131966263, 2131966264),
    A0A("do_not_receive", 2, 2131966248, 2131966249),
    A0F("primary", 3, 2131966261, 2131966262),
    A0C("general", 4, 2131966253, 2131966254),
    A0E("people_i_follow", 5, 2131966241, 2131966241),
    A0B("everyone", 6, 2131966238, 2131966238);
    
    public static final DirectMessageInteropReachabilityOptions[] A04 = null;
    public static final DirectMessageInteropReachabilityOptions[] A05 = null;
    public static final DirectMessageInteropReachabilityOptions[] A06 = null;
    public static final DirectMessageInteropReachabilityOptions[] A07 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7;
        DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr;
        A08 = 0oU.A00(directMessageInteropReachabilityOptionsArr);
        CREATOR = new W6F(30);
        A05 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A06 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions4, directMessageInteropReachabilityOptions5, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A07 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A04 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions7, directMessageInteropReachabilityOptions6};
    }

    /* access modifiers changed from: public */
    DirectMessageInteropReachabilityOptions(String str, int i, int i2, int i3) {
        this.A03 = str;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = r1;
    }
}
