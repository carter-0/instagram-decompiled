package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393589wg;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateMusicAssetInfoDict extends 17P implements StoryTemplateMusicAssetInfoDictIntf {
    public static final C3035269k CREATOR = new CTB(98);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf, com.instagram.api.schemas.ImmutablePandoStoryTemplateMusicAssetInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393589wg.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateMusicAssetInfoDict] */
    public final Integer AzJ() {
        return getOptionalIntValueByHashCode(55068821);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateMusicAssetInfoDict] */
    public final Boolean BBW() {
        return getOptionalBooleanValueByHashCode(1988432185);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateMusicAssetInfoDict] */
    public final Boolean CSt() {
        return getOptionalBooleanValueByHashCode(1630845353);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoStoryTemplateMusicAssetInfoDict] */
    public final StoryTemplateMusicAssetInfoDict FBe() {
        String A0i = A0i(-22609914);
        String A0i2 = A0i(-45086183);
        return new StoryTemplateMusicAssetInfoDict(getOptionalBooleanValueByHashCode(1988432185), getOptionalBooleanValueByHashCode(1630845353), getOptionalIntValueByHashCode(55068821), A0i, A0i2, A0i(1436807532), A0Y());
    }

    public final String getCoverArtworkThumbnailUri() {
        return A0i(-22609914);
    }

    public final String getCoverArtworkUri() {
        return A0i(-45086183);
    }

    public final String getProgressiveDownloadUrl() {
        return A0i(1436807532);
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateMusicAssetInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
