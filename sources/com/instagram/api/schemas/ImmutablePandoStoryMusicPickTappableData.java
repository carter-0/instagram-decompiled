package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C44413CeX;
import X.CTB;
import X.DMR;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoStoryMusicPickTappableData extends 17P implements StoryMusicPickTappableDataIntf {
    public static final C3035269k CREATOR = CTB.A00(83);
    public OriginalSoundDataIntf A00;
    public List A01;

    public final TrackData AdQ() {
        return (TrackData) A05(93166550, ImmutablePandoTrackData.class);
    }

    public final StoryPromptDisablementState Axh() {
        return (StoryPromptDisablementState) A0M(186507096, DMR.A00);
    }

    public final List B3f() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'facepileTopParticipants' field.");
    }

    public final OriginalSoundDataIntf BZB() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A00;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1082512652, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    public final StoryTemplateAssetDictIntf C4X() {
        return (StoryTemplateAssetDictIntf) A04(-1303161109, ImmutablePandoStoryTemplateAssetDict.class);
    }

    public final StoryMusicPickTappableDataIntf E8k(1E9 r4) {
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A01 = A0r;
        OriginalSoundDataIntf BZB = BZB();
        if (BZB != null) {
            BZB.E7q(r4);
        } else {
            BZB = null;
        }
        this.A00 = BZB;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryMusicPickTappableDataIntf, com.instagram.api.schemas.ImmutablePandoStoryMusicPickTappableData] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44413CeX.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Ae0() {
        return A0k(107936827);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryMusicPickTappableData] */
    public final int Bak() {
        return getIntValueByHashCode(1324364035);
    }

    public final String Ben() {
        return A0i(163224144);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoStoryMusicPickTappableData] */
    public final StoryMusicPickTappableData FAV(1E9 r14) {
        TrackDataImpl trackDataImpl;
        TrackData AdQ = AdQ();
        OriginalSoundData originalSoundData = null;
        if (AdQ != null) {
            trackDataImpl = AdQ.FCv();
        } else {
            trackDataImpl = null;
        }
        String A0k = A0k(107936827);
        StoryPromptDisablementState Axh = Axh();
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r14, A0r, it);
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41847B3o.A1Q(r14, A0r2, it2);
        }
        String A0g = A0g();
        String A0k2 = A0k(-900774058);
        OriginalSoundDataIntf BZB = BZB();
        if (BZB != null) {
            originalSoundData = BZB.F7E(r14);
        }
        return new StoryMusicPickTappableData(originalSoundData, Axh, C4X().FBV(), trackDataImpl, A0k, A0g, A0k2, A0i(163224144), A0r2, getIntValueByHashCode(1324364035));
    }

    public final StoryMusicPickTappableData FAW(1E6 r2) {
        return FAV(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0g();
    }

    public final String getMediaId() {
        return A0k(-900774058);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryMusicPickTappableData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
