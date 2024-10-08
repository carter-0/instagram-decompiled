package com.instagram.direct.messagethread.interaction.longpressaction;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class LongPressActionLabelSpan extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(88);
    public final int A00;
    public final String A01;

    public LongPressActionLabelSpan(String str, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LongPressActionLabelSpan) {
                LongPressActionLabelSpan longPressActionLabelSpan = (LongPressActionLabelSpan) obj;
                if (!0qQ.A0K(this.A01, longPressActionLabelSpan.A01) || this.A00 != longPressActionLabelSpan.A00) {
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
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }
}
