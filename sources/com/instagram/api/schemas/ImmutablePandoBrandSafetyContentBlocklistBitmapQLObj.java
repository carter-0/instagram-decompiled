package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.List;

public final class ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj extends 17P implements BrandSafetyContentBlocklistBitmapQLObj {
    public static final C3035269k CREATOR = CTC.A00(18);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj] */
    public final List Afw() {
        return getOptionalIntListByHashCode(-17963191);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj] */
    public final BrandSafetyContentBlocklistBitmapQLObjImpl F0v() {
        return new BrandSafetyContentBlocklistBitmapQLObjImpl(getOptionalIntListByHashCode(-17963191));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (getOptionalIntListByHashCode(-17963191) != null) {
            A0t.put("bitmap_array", getOptionalIntListByHashCode(-17963191));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
