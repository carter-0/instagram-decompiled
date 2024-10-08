package com.instagram.model.mediasize;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C376379Ht;
import X.C377789Ng;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.DirectMediaFallbackUrlIntf;
import com.instagram.api.schemas.ImmutablePandoDirectMediaFallbackUrl;

public final class ImmutablePandoVideoVersion extends 17P implements VideoVersionIntf {
    public static final C3035269k CREATOR = new C376379Ht(9);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.mediasize.ImmutablePandoVideoVersion, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final DirectMediaFallbackUrlIntf B3l() {
        return (DirectMediaFallbackUrlIntf) A05(761243362, ImmutablePandoDirectMediaFallbackUrl.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.model.mediasize.ImmutablePandoVideoVersion, com.facebook.pando.TreeJNI, com.instagram.model.mediasize.VideoVersionIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C377789Ng.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String getId() {
        return A0i(3355);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.mediasize.ImmutablePandoVideoVersion, com.facebook.pando.TreeJNI] */
    public final Integer BCu() {
        return getOptionalIntValueByHashCode(-1221029593);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.mediasize.ImmutablePandoVideoVersion, com.facebook.pando.TreeJNI] */
    public final Integer CAf() {
        return getOptionalIntValueByHashCode(3575610);
    }

    public final Long CCK() {
        return A0L(773655335);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.mediasize.ImmutablePandoVideoVersion, com.facebook.pando.TreeJNI] */
    public final Integer CGY() {
        return getOptionalIntValueByHashCode(113126854);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.model.mediasize.ImmutablePandoVideoVersion, com.facebook.pando.TreeJNI, X.17P] */
    public final VideoVersion FEd() {
        DirectMediaFallbackUrl directMediaFallbackUrl;
        DirectMediaFallbackUrlIntf B3l = B3l();
        if (B3l != null) {
            directMediaFallbackUrl = B3l.F2f();
        } else {
            directMediaFallbackUrl = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1221029593);
        String A0i = A0i(3355);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(3575610);
        String A0i2 = A0i(116079);
        return new VideoVersion(directMediaFallbackUrl, optionalIntValueByHashCode, optionalIntValueByHashCode2, getOptionalIntValueByHashCode(113126854), A0L(773655335), A0i, A0i2);
    }

    public final String getUrl() {
        return A0i(116079);
    }
}
