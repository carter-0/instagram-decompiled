package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C63012Kq2;
import X.CTC;
import X.MNR;
import X.MNS;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoBrandedContentProjectMetadata extends 17P implements BrandedContentProjectMetadataIntf {
    public static final C3035269k CREATOR = new CTC(21);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentProjectMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final BrandedContentProjectAction AYA() {
        return (BrandedContentProjectAction) A0M(-1422950858, MNR.A00);
    }

    public final BCPDealOutputTypeEnum AvT() {
        return (BCPDealOutputTypeEnum) A0N(1856290917, MNS.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentProjectMetadata, com.instagram.api.schemas.BrandedContentProjectMetadataIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C63012Kq2.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentProjectMetadata] */
    public final Boolean Aa1() {
        return getOptionalBooleanValueByHashCode(-659718656);
    }

    public final String Ahf() {
        return A0j(-25385773);
    }

    public final String Ahm() {
        return A0i(-200051058);
    }

    public final String Aju() {
        return A0i(362868321);
    }

    public final String Ajv() {
        return A0j(1039285120);
    }

    public final String Bhc() {
        return A0k(-1969970175);
    }

    public final String Bhd() {
        return A0i(939388913);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentProjectMetadata, X.17P] */
    public final BrandedContentProjectMetadata F0y() {
        return new BrandedContentProjectMetadata(AvT(), AYA(), getOptionalBooleanValueByHashCode(-659718656), A0j(-25385773), A0i(-200051058), A0i(362868321), A0j(1039285120), A0k(-1969970175), A0i(939388913));
    }
}
