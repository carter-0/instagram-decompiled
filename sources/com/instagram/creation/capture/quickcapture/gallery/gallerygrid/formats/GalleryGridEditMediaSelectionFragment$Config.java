package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats;

import X.0qQ;
import X.C41847B3o;
import X.C41848B3p;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class GalleryGridEditMediaSelectionFragment$Config implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(23);
    public final String A00;
    public final List A01;
    public final List A02;

    public GalleryGridEditMediaSelectionFragment$Config(List list, List list2, String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A02 = list;
        this.A01 = list2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A01);
        while (A1F2.hasNext()) {
            C41847B3o.A1I(parcel, A1F2, i);
        }
    }
}
