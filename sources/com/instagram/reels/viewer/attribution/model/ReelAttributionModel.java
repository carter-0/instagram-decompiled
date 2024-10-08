package com.instagram.reels.viewer.attribution.model;

import X.C14015ToH;
import X.C306106Ku;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.music.common.model.MusicOverlayStickerModel;

public class ReelAttributionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(75);
    public C14015ToH A00;
    public EffectInfoAttributionConfiguration A01;
    public C306106Ku A02;
    public MusicOverlayStickerModel A03;
    public String A04;
    public String A05;
    public final ReelHeaderAttributionType A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
    }

    public ReelAttributionModel(Parcel parcel) {
        this.A06 = (ReelHeaderAttributionType) parcel.readParcelable(ReelHeaderAttributionType.class.getClassLoader());
        this.A05 = parcel.readString();
        this.A01 = (EffectInfoAttributionConfiguration) parcel.readParcelable(EffectInfoAttributionConfiguration.class.getClassLoader());
    }

    public ReelAttributionModel(ReelHeaderAttributionType reelHeaderAttributionType) {
        this.A06 = reelHeaderAttributionType;
    }
}
