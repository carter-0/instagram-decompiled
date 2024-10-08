package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C393289wC;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class AudioFilterInfo extends AnonymousClass0T0 implements Parcelable, AudioFilterInfoIntf {
    public static final Parcelable.Creator CREATOR = new SWT(54);
    public final AudioFilterType A00;

    public AudioFilterInfo(AudioFilterType audioFilterType) {
        0qQ.A0B(audioFilterType, 1);
        this.A00 = audioFilterType;
    }

    public final AudioFilterInfo F0c() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AudioFilterInfo) && this.A00 == ((AudioFilterInfo) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final AudioFilterType B5w() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioFilterInfo", C393289wC.A00(this));
    }
}
