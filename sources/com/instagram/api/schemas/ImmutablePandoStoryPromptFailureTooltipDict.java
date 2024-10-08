package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44420Cee;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryPromptFailureTooltipDict extends 17P implements StoryPromptFailureTooltipDictIntf {
    public static final C3035269k CREATOR = CTB.A00(85);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptFailureTooltipDict, com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44420Cee.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B28() {
        return A0i(-1392639055);
    }

    public final String B29() {
        return A0i(-205678039);
    }

    public final StoryPromptFailureTooltipDict FAp() {
        return new StoryPromptFailureTooltipDict(A0i(-1392639055), A0i(-205678039));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptFailureTooltipDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
