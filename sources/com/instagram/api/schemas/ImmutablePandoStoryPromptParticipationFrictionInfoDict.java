package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44422Ceg;
import X.C46096DMb;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryPromptParticipationFrictionInfoDict extends 17P implements StoryPromptParticipationFrictionInfoDict {
    public static final C3035269k CREATOR = CTB.A00(86);

    public final StoryLinkInfoDictIntf Agg() {
        return (StoryLinkInfoDictIntf) A05(-339885788, ImmutablePandoStoryLinkInfoDict.class);
    }

    public final StoryPromptParticipationFrictionType B89() {
        return (StoryPromptParticipationFrictionType) A0N(2061241695, C46096DMb.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict, com.instagram.api.schemas.ImmutablePandoStoryPromptParticipationFrictionInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44422Ceg.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Age() {
        return A0i(-1383701292);
    }

    public final String Agf() {
        return A0i(-1383701291);
    }

    public final StoryPromptParticipationFrictionInfoDictImpl FAq() {
        StoryLinkInfoDict storyLinkInfoDict;
        String A0i = A0i(-1383701292);
        String A0i2 = A0i(-1383701291);
        StoryLinkInfoDictIntf Agg = Agg();
        if (Agg != null) {
            storyLinkInfoDict = Agg.FAL();
        } else {
            storyLinkInfoDict = null;
        }
        return new StoryPromptParticipationFrictionInfoDictImpl(storyLinkInfoDict, B89(), A0i, A0i2, A0Y());
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptParticipationFrictionInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
