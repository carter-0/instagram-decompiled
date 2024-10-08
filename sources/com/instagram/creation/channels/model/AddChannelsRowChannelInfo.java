package com.instagram.creation.channels.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class AddChannelsRowChannelInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(37);
    public final int A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AddChannelsRowChannelInfo) {
                AddChannelsRowChannelInfo addChannelsRowChannelInfo = (AddChannelsRowChannelInfo) obj;
                if (!0qQ.A0K(this.A01, addChannelsRowChannelInfo.A01) || !0qQ.A0K(this.A02, addChannelsRowChannelInfo.A02) || this.A00 != addChannelsRowChannelInfo.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)) + this.A00;
    }

    public AddChannelsRowChannelInfo(String str, String str2, int i) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
