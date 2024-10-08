package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44450Cf8;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateFillableMusicStickerDict extends 17P implements StoryTemplateFillableMusicStickerDict {
    public static final C3035269k CREATOR = CTB.A00(94);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict, com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableMusicStickerDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44450Cf8.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AyE() {
        return A0Z();
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableMusicStickerDict] */
    public final Integer CHa() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableMusicStickerDict] */
    public final StoryTemplateFillableMusicStickerDictImpl FBa() {
        return new StoryTemplateFillableMusicStickerDictImpl(A0C(), A0F(), A0G(), A0J(), A0H(), getOptionalIntValueByHashCode(-573585203), A0Z());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableMusicStickerDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
