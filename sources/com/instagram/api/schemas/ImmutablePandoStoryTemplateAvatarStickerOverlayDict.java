package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393499wX;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateAvatarStickerOverlayDict extends 17P implements StoryTemplateAvatarStickerOverlayDict {
    public static final C3035269k CREATOR = new CTB(90);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAvatarStickerOverlayDict, com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393499wX.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B2z() {
        return A0i(1204402210);
    }

    public final Float BCt() {
        return A0C();
    }

    public final String BI3() {
        return A0i(-652560436);
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAvatarStickerOverlayDict] */
    public final Integer CHa() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAvatarStickerOverlayDict, X.17P] */
    public final StoryTemplateAvatarStickerOverlayDictImpl FBW() {
        String A0i = A0i(1204402210);
        return new StoryTemplateAvatarStickerOverlayDictImpl(A0C(), A0F(), A0G(), A0J(), A0H(), getOptionalIntValueByHashCode(-573585203), A0i, A0i(-652560436), A0a());
    }

    public final String getMediaType() {
        return A0a();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateAvatarStickerOverlayDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
