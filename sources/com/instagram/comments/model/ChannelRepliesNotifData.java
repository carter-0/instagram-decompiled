package com.instagram.comments.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class ChannelRepliesNotifData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(81);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ChannelRepliesNotifData(String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelRepliesNotifData) {
                ChannelRepliesNotifData channelRepliesNotifData = (ChannelRepliesNotifData) obj;
                if (!0qQ.A0K(this.A00, channelRepliesNotifData.A00) || !0qQ.A0K(this.A03, channelRepliesNotifData.A03) || !0qQ.A0K(this.A02, channelRepliesNotifData.A02) || !0qQ.A0K(this.A01, channelRepliesNotifData.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A01);
    }
}
