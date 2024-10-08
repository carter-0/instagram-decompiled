package com.instagram.music.common.model;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class ARAudioEffectData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(44);
    public List A00;
    public List A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A05);
        parcel.writeDouble(this.A04);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        List<MusicAssetBeatInfo> list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (MusicAssetBeatInfo writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<LyricsPhrase> list2 = this.A01;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        for (LyricsPhrase writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }

    public ARAudioEffectData(String str, String str2, String str3, List list, List list2, double d, double d2, double d3, double d4) {
        this.A03 = d;
        this.A02 = d2;
        this.A05 = d3;
        this.A04 = d4;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A00 = list;
        this.A01 = list2;
    }

    public ARAudioEffectData() {
        this((String) null, (String) null, (String) null, (List) null, (List) null, 0.0d, 0.0d, 0.0d, 0.0d);
    }
}
