package com.instagram.creatormessaging.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class ChannelCreationFlowExtraArgs extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(56);
    public final CategorySelectionScreenArgs A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelCreationFlowExtraArgs) {
                ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = (ChannelCreationFlowExtraArgs) obj;
                if (!0qQ.A0K(this.A00, channelCreationFlowExtraArgs.A00) || !0qQ.A0K(this.A01, channelCreationFlowExtraArgs.A01) || !0qQ.A0K(this.A02, channelCreationFlowExtraArgs.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        CategorySelectionScreenArgs categorySelectionScreenArgs = this.A00;
        if (categorySelectionScreenArgs == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categorySelectionScreenArgs.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public ChannelCreationFlowExtraArgs(CategorySelectionScreenArgs categorySelectionScreenArgs, String str, String str2) {
        this.A00 = categorySelectionScreenArgs;
        this.A01 = str;
        this.A02 = str2;
    }

    public ChannelCreationFlowExtraArgs() {
        this((CategorySelectionScreenArgs) null, (String) null, (String) null);
    }
}
