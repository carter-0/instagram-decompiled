package com.instagram.contentnotes.data.immersive.params;

import X.0qQ;
import X.AnonymousClass0T0;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class ContentNotesImmersiveCreationUiState extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(95);
    public final ContentNotesImmersiveMimicryParams A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams = this.A00;
        if (contentNotesImmersiveMimicryParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentNotesImmersiveMimicryParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }

    public ContentNotesImmersiveCreationUiState(ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams, String str, boolean z) {
        this.A02 = z;
        this.A00 = contentNotesImmersiveMimicryParams;
        this.A01 = str;
    }
}
