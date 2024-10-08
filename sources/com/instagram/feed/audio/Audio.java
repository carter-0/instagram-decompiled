package com.instagram.feed.audio;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import X.C44730Cjy;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import java.util.List;

public final class Audio extends AnonymousClass0T0 implements AudioIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(7);
    public final DirectAudioFallbackUrl A00;
    public final Integer A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final List A05;

    public final Audio FDt() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Audio) {
                Audio audio = (Audio) obj;
                if (!0qQ.A0K(this.A04, audio.A04) || !0qQ.A0K(this.A02, audio.A02) || !0qQ.A0K(this.A03, audio.A03) || !0qQ.A0K(this.A00, audio.A00) || !0qQ.A0K(this.A05, audio.A05) || !0qQ.A0K(this.A01, audio.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.A02;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.A03;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        DirectAudioFallbackUrl directAudioFallbackUrl = this.A00;
        int hashCode4 = (hashCode3 + (directAudioFallbackUrl == null ? 0 : directAudioFallbackUrl.hashCode())) * 31;
        List list = this.A05;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A01;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.A03;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeParcelable(this.A00, i);
        List<Number> list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Number floatValue : list) {
                parcel.writeFloat(floatValue.floatValue());
            }
        }
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public final String Adp() {
        return this.A04;
    }

    public final Long Adq() {
        return this.A02;
    }

    public final Long AzI() {
        return this.A03;
    }

    public final DirectAudioFallbackUrl B3k() {
        return this.A00;
    }

    public final List CGD() {
        return this.A05;
    }

    public final Integer CGE() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioInfo", C44730Cjy.A00(this));
    }

    public Audio(DirectAudioFallbackUrl directAudioFallbackUrl, Integer num, Long l, Long l2, String str, List list) {
        this.A04 = str;
        this.A02 = l;
        this.A03 = l2;
        this.A00 = directAudioFallbackUrl;
        this.A05 = list;
        this.A01 = num;
    }
}
