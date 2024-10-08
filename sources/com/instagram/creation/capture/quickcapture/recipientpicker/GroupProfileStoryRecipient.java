package com.instagram.creation.capture.quickcapture.recipientpicker;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

public final class GroupProfileStoryRecipient implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(28);
    public final int A00;
    public final PendingRecipient A01;
    public final boolean A02;

    public GroupProfileStoryRecipient(PendingRecipient pendingRecipient, int i, boolean z) {
        0qQ.A0B(pendingRecipient, 1);
        this.A01 = pendingRecipient;
        this.A02 = z;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
