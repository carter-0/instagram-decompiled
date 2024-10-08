package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;

public final class OpenDraftGalleryCommandImpl extends AnonymousClass0T0 implements Parcelable, OpenDraftGalleryCommand {
    public static final Parcelable.Creator CREATOR = new FK5(99);
    public final Integer A00;

    public final OpenDraftGalleryCommandImpl F77() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenDraftGalleryCommandImpl) && 0qQ.A0K(this.A00, ((OpenDraftGalleryCommandImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public OpenDraftGalleryCommandImpl(Integer num) {
        this.A00 = num;
    }
}
