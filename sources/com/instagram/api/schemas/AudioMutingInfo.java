package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C14023ToP;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class AudioMutingInfo extends AnonymousClass0T0 implements Parcelable, AudioMutingInfoIntf {
    public static final Parcelable.Creator CREATOR = new C376409Hw(56);
    public final MusicMuteAudioReason A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public AudioMutingInfo(MusicMuteAudioReason musicMuteAudioReason, String str, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 4);
        this.A02 = z;
        this.A03 = z2;
        this.A00 = musicMuteAudioReason;
        this.A01 = str;
        this.A04 = z3;
    }

    public final AudioMutingInfo F0f() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioMutingInfo) {
                AudioMutingInfo audioMutingInfo = (AudioMutingInfo) obj;
                if (!(this.A02 == audioMutingInfo.A02 && this.A03 == audioMutingInfo.A03 && this.A00 == audioMutingInfo.A00 && 0qQ.A0K(this.A01, audioMutingInfo.A01) && this.A04 == audioMutingInfo.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final boolean Ab2() {
        return this.A02;
    }

    public final boolean BV8() {
        return this.A03;
    }

    public final MusicMuteAudioReason BV9() {
        return this.A00;
    }

    public final String BVA() {
        return this.A01;
    }

    public final boolean Bvg() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioMutingInfo", C14023ToP.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        MusicMuteAudioReason musicMuteAudioReason = this.A00;
        if (musicMuteAudioReason == null) {
            hashCode = 0;
        } else {
            hashCode = musicMuteAudioReason.hashCode();
        }
        int hashCode2 = (((i4 + hashCode) * 31) + this.A01.hashCode()) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        return hashCode2 + i5;
    }
}
