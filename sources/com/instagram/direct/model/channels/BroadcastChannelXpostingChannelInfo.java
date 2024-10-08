package com.instagram.direct.model.channels;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class BroadcastChannelXpostingChannelInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(93);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BroadcastChannelXpostingChannelInfo) {
                BroadcastChannelXpostingChannelInfo broadcastChannelXpostingChannelInfo = (BroadcastChannelXpostingChannelInfo) obj;
                if (!0qQ.A0K(this.A02, broadcastChannelXpostingChannelInfo.A02) || !0qQ.A0K(this.A03, broadcastChannelXpostingChannelInfo.A03) || !0qQ.A0K(this.A01, broadcastChannelXpostingChannelInfo.A01) || !0qQ.A0K(this.A00, broadcastChannelXpostingChannelInfo.A00) || this.A05 != broadcastChannelXpostingChannelInfo.A05 || this.A04 != broadcastChannelXpostingChannelInfo.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TF.A08(this.A03, A0O) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31));
    }

    public BroadcastChannelXpostingChannelInfo(ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
    }
}
