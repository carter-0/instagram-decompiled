package com.instagram.clips.audio.model;

import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51970G9q;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.AudioType;

public final class AudioPageAssetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(69);
    public final AudioType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass0eM A06 = C51970G9q.A0o(this, 44);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public AudioPageAssetModel(AudioType audioType, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(audioType, str);
        this.A00 = audioType;
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("audio_page_");
        A1A.append(str);
        A1A.append('_');
        A1A.append(str3);
        A1A.append('_');
        this.A02 = AnonymousClass7TF.A0l(str4, A1A);
    }
}
