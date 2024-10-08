package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393539wb;
import X.C39737A7d;
import X.C41701Ays;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateFillableGalleryStickerDict extends 17P implements StoryTemplateFillableGalleryStickerDict {
    public static final C3035269k CREATOR = new CTB(93);

    public final /* synthetic */ C39737A7d AKT() {
        return new C39737A7d(this);
    }

    public final StoryTemplateFillableGalleryStickerShapes B8s() {
        return (StoryTemplateFillableGalleryStickerShapes) A0N(1852713970, C41701Ays.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableGalleryStickerDict, com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393539wb.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Float BCt() {
        return A0C();
    }

    public final Float Bof() {
        return A0F();
    }

    public final Float CGX() {
        return A0G();
    }

    public final Float CGt() {
        return A0J();
    }

    public final Float CHS() {
        return A0H();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableGalleryStickerDict, com.facebook.pando.TreeJNI] */
    public final Integer CHa() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableGalleryStickerDict, com.facebook.pando.TreeJNI, X.17P] */
    public final StoryTemplateFillableGalleryStickerDictImpl FBZ() {
        return new StoryTemplateFillableGalleryStickerDictImpl(B8s(), A0C(), A0F(), A0G(), A0J(), A0H(), getOptionalIntValueByHashCode(-573585203));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableGalleryStickerDict, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
