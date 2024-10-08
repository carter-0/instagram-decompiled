package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C393289wC;
import X.C41696Ayn;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAudioFilterInfo extends 17P implements AudioFilterInfoIntf {
    public static final C3035269k CREATOR = new CTC(12);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioFilterInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final AudioFilterType B5w() {
        return (AudioFilterType) A0M(-889919583, C41696Ayn.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioFilterInfo, com.instagram.api.schemas.AudioFilterInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393289wC.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final AudioFilterInfo F0c() {
        return new AudioFilterInfo(B5w());
    }
}
