package com.instagram.direct.ui.collections;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41848B3p;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class DirectThreadDetailsCollectionRowViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(13);
    public String A00 = null;
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02 = false;
    public boolean A03 = false;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            ((DirectThreadDetailsCollectionViewModel) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
