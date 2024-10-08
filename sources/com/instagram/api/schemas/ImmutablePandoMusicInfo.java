package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.1E6;
import X.1E9;
import X.B4P;
import X.C3035269k;
import X.C376379Ht;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel;
import com.instagram.music.common.model.MusicConsumptionModel;

public final class ImmutablePandoMusicInfo extends 17P implements MusicInfo {
    public static final C3035269k CREATOR = new C376379Ht(1);
    public MusicConsumptionModel A00;

    public final MusicInfoImpl F6W(1E6 r4) {
        return F6V(new 1E9(r4, 6, false));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMusicInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

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

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.MusicInfo, com.instagram.api.schemas.ImmutablePandoMusicInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(B4P.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Long BUo() {
        return A0L(1139251232);
    }

    public final MusicInfo E7j(1E9 r2) {
        MusicConsumptionModel BUp = BUp();
        BUp.EAF(r2);
        this.A00 = BUp;
        return this;
    }

    public final MusicInfoImpl F6V(1E9 r5) {
        return new MusicInfoImpl(BUk().FCv(), BUp().FG6(r5), A0L(1139251232));
    }
}
