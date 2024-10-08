package com.instagram.direct.model.mentions;

import X.0qQ;
import X.0sn;
import X.C44047CTq;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class SendMentionData$MentionData extends C44047CTq implements Parcelable {
    public static final LVP CREATOR = new LVP(95);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SendMentionData$MentionData) && 0qQ.A0K(this.A00, ((SendMentionData$MentionData) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeTypedList(this.A00);
    }

    public SendMentionData$MentionData() {
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 1);
        this.A00 = r1;
    }
}
