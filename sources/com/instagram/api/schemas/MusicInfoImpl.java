package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.B4P;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.music.common.model.MusicConsumptionModel;

public final class MusicInfoImpl extends AnonymousClass0T0 implements MusicInfo, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376389Hu(74);
    public final TrackData A00;
    public final MusicConsumptionModel A01;
    public final Long A02;

    public MusicInfoImpl(TrackData trackData, MusicConsumptionModel musicConsumptionModel, Long l) {
        0qQ.A0B(trackData, 1);
        0qQ.A0B(musicConsumptionModel, 3);
        this.A00 = trackData;
        this.A02 = l;
        this.A01 = musicConsumptionModel;
    }

    public final MusicInfoImpl F6V(1E9 r1) {
        return this;
    }

    public final MusicInfoImpl F6W(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicInfoImpl) {
                MusicInfoImpl musicInfoImpl = (MusicInfoImpl) obj;
                if (!0qQ.A0K(this.A00, musicInfoImpl.A00) || !0qQ.A0K(this.A02, musicInfoImpl.A02) || !0qQ.A0K(this.A01, musicInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Long l = this.A02;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.A01, i);
    }

    public final TrackData BUk() {
        return this.A00;
    }

    public final Long BUo() {
        return this.A02;
    }

    public final MusicConsumptionModel BUp() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMusicInfo", B4P.A00(this));
    }

    public final MusicInfo E7j(1E9 r1) {
        return this;
    }
}
