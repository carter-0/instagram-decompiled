package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.CTB;
import X.Ca0;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoLocationNoteResponseInfo extends 17P implements LocationNoteResponseInfo {
    public static final C3035269k CREATOR = new CTB(12);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLocationNoteResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLocationNoteResponseInfo, com.instagram.api.schemas.LocationNoteResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(Ca0.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BNk() {
        return A0h(552319461);
    }

    public final String BNl() {
        return A0h(-1796793131);
    }

    public final LocationNoteResponseInfoImpl F5d() {
        return new LocationNoteResponseInfoImpl(A0h(552319461), A0h(-1796793131));
    }
}
