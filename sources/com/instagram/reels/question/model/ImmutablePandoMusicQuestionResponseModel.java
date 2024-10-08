package com.instagram.reels.question.model;

import X.17P;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44989CoS;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel;
import com.instagram.music.common.model.MusicConsumptionModel;

public final class ImmutablePandoMusicQuestionResponseModel extends 17P implements MusicQuestionResponseModelIntf {
    public static final C3035269k CREATOR = CTA.A00(71);
    public MusicConsumptionModel A00;

    public final TrackData BUk() {
        return (TrackData) A04(541071095, ImmutablePandoTrackData.class);
    }

    public final MusicConsumptionModel BUp() {
        MusicConsumptionModel musicConsumptionModel = this.A00;
        if (musicConsumptionModel == null) {
            return (MusicConsumptionModel) A04(228267436, ImmutablePandoMusicConsumptionModel.class);
        }
        return musicConsumptionModel;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoMusicQuestionResponseModel, com.instagram.reels.question.model.MusicQuestionResponseModelIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44989CoS.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final MusicQuestionResponseModelIntf EAP(1E9 r2) {
        MusicConsumptionModel BUp = BUp();
        BUp.EAF(r2);
        this.A00 = BUp;
        return this;
    }

    public final MusicQuestionResponseModel FGO(1E9 r4) {
        return new MusicQuestionResponseModel(BUk().FCv(), BUp().FG6(r4));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoMusicQuestionResponseModel] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
