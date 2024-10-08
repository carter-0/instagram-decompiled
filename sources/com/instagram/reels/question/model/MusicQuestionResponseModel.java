package com.instagram.reels.question.model;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44989CoS;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.MusicConsumptionModel;

public final class MusicQuestionResponseModel extends AnonymousClass0T0 implements Parcelable, MusicQuestionResponseModelIntf {
    public static final Parcelable.Creator CREATOR = new W6F(1);
    public final TrackData A00;
    public final MusicConsumptionModel A01;

    public final MusicQuestionResponseModel FGO(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicQuestionResponseModel) {
                MusicQuestionResponseModel musicQuestionResponseModel = (MusicQuestionResponseModel) obj;
                if (!0qQ.A0K(this.A00, musicQuestionResponseModel.A00) || !0qQ.A0K(this.A01, musicQuestionResponseModel.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final TrackData BUk() {
        return this.A00;
    }

    public final MusicConsumptionModel BUp() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMusicResponseDict", C44989CoS.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public MusicQuestionResponseModel(TrackData trackData, MusicConsumptionModel musicConsumptionModel) {
        AnonymousClass7TG.A1O(trackData, musicConsumptionModel);
        this.A00 = trackData;
        this.A01 = musicConsumptionModel;
    }

    public final MusicQuestionResponseModelIntf EAP(1E9 r1) {
        return this;
    }
}
