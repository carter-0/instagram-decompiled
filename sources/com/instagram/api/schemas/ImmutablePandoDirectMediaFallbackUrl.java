package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.17P;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoDirectMediaFallbackUrl extends 17P implements DirectMediaFallbackUrlIntf {
    public static final C3035269k CREATOR = new CTC(58);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoDirectMediaFallbackUrl] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoDirectMediaFallbackUrl, X.17P] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (A0R() != null) {
            linkedHashMap.put("url", A0R());
        }
        return new TreeUpdaterJNI(0Yt.A0B(linkedHashMap), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final DirectMediaFallbackUrl F2f() {
        return new DirectMediaFallbackUrl(A0R());
    }

    public final String getUrl() {
        return A0R();
    }
}
