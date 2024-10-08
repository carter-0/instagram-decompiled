package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C44068CUl;
import X.CTC;
import X.DK9;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAvatarNoteResponseInfo extends 17P implements AvatarNoteResponseInfo {
    public static final C3035269k CREATOR = new CTC(15);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAvatarNoteResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final MediaType AeT() {
        return (MediaType) A0M(1356310429, DK9.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAvatarNoteResponseInfo, com.instagram.api.schemas.AvatarNoteResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44068CUl.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AeU() {
        return A0h(858994456);
    }

    public final String AmP() {
        return A0i(635999837);
    }

    public final AvatarNoteResponseInfoImpl F0i() {
        return new AvatarNoteResponseInfoImpl(AeT(), A0h(858994456), A0i(635999837));
    }
}
