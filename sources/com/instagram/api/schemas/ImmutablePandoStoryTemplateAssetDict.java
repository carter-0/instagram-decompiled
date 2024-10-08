package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44449Cf7;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;

public final class ImmutablePandoStoryTemplateAssetDict extends 17P implements StoryTemplateAssetDictIntf {
    public static final C3035269k CREATOR = CTB.A00(89);

    public final ImageInfo Aew() {
        return (ImageInfo) A05(-697531610, ImmutablePandoImageInfo.class);
    }

    public final ImageInfo BGO() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAssetDict, com.instagram.api.schemas.StoryTemplateAssetDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44449Cf7.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Aer() {
        return A0j(-1893603668);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAssetDict] */
    public final Integer BcU() {
        return getOptionalIntValueByHashCode(-977447900);
    }

    public final String C4c() {
        return A0i(1519672386);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAssetDict] */
    public final Integer CHa() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAssetDict] */
    public final Boolean CZC() {
        return getOptionalBooleanValueByHashCode(1955261344);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAssetDict, X.17P] */
    public final StoryTemplateAssetDict FBV() {
        ImageInfoImpl imageInfoImpl;
        String A0j = A0j(-1893603668);
        ImageInfo Aew = Aew();
        ImageInfoImpl imageInfoImpl2 = null;
        if (Aew != null) {
            imageInfoImpl = Aew.FEa();
        } else {
            imageInfoImpl = null;
        }
        ImageInfo BGO = BGO();
        if (BGO != null) {
            imageInfoImpl2 = BGO.FEa();
        }
        return new StoryTemplateAssetDict(imageInfoImpl, imageInfoImpl2, getOptionalBooleanValueByHashCode(1955261344), getOptionalIntValueByHashCode(-977447900), getOptionalIntValueByHashCode(-573585203), A0j, C41845B3m.A0o(this), A0i(1519672386));
    }

    public final String getPk() {
        return C41845B3m.A0o(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAssetDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
