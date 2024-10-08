package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44452CfA;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateReshareMediaDict extends 17P implements StoryTemplateReshareMediaDict {
    public static final C3035269k CREATOR = CTA.A00(0);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateReshareMediaDict, com.instagram.api.schemas.StoryTemplateReshareMediaDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44452CfA.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateReshareMediaDict] */
    public final Integer Als() {
        return getOptionalIntValueByHashCode(-368220877);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateReshareMediaDict, X.17P] */
    public final StoryTemplateReshareMediaDictImpl FBg() {
        return new StoryTemplateReshareMediaDictImpl(A0f(), getOptionalIntValueByHashCode(-368220877), C41845B3m.A0n(this));
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getUserId() {
        return C41845B3m.A0n(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateReshareMediaDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
