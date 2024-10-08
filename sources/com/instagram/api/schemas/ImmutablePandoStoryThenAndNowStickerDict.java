package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44459CfH;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryThenAndNowStickerDict extends 17P implements StoryThenAndNowStickerDictIntf {
    public static final C3035269k CREATOR = CTA.A00(2);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryThenAndNowStickerDict, com.instagram.api.schemas.StoryThenAndNowStickerDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44459CfH.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AaI() {
        return A0i(474040276);
    }

    public final String Afg() {
        return A0i(80445649);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryThenAndNowStickerDict] */
    public final Boolean CPN() {
        return getOptionalBooleanValueByHashCode(-928846796);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryThenAndNowStickerDict, X.17P] */
    public final StoryThenAndNowStickerDict FBl() {
        return new StoryThenAndNowStickerDict(getOptionalBooleanValueByHashCode(-928846796), A0i(474040276), A0i(80445649), A0e());
    }

    public final String getId() {
        return A0e();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryThenAndNowStickerDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
