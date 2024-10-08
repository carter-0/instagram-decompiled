package com.instagram.comments.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class ChannelCommentsData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(80);
    public final MessageIdentifier A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelCommentsData) {
                ChannelCommentsData channelCommentsData = (ChannelCommentsData) obj;
                if (!0qQ.A0K(this.A03, channelCommentsData.A03) || !0qQ.A0K(this.A00, channelCommentsData.A00) || !0qQ.A0K(this.A01, channelCommentsData.A01) || this.A04 != channelCommentsData.A04 || !0qQ.A0K(this.A02, channelCommentsData.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TF.A09(this.A04, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public ChannelCommentsData(MessageIdentifier messageIdentifier, String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A1O(str, messageIdentifier);
        this.A03 = str;
        this.A00 = messageIdentifier;
        this.A01 = str2;
        this.A04 = z;
        this.A02 = str3;
    }
}
