package com.instagram.music.common.config;

import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.music.common.model.MusicAssetModel;

public final class MusicAttributionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(60);
    public int A00;
    public AudioFilterType A01;
    public MusicAssetModel A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public String A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MusicAttributionConfig(com.instagram.music.common.model.MusicOverlayStickerModel r9) {
        /*
            r8 = this;
            r1 = 0
            com.instagram.music.common.model.MusicAssetModel r2 = com.instagram.music.common.model.MusicAssetModel.A03(r9)
            r7 = 1
            boolean r0 = r9.A0t
            r6 = 0
            if (r0 != r7) goto L_0x000c
            r6 = 1
        L_0x000c:
            java.lang.String r4 = r9.A0j
            java.lang.Integer r0 = r9.A0K
            if (r0 == 0) goto L_0x001c
            int r5 = r0.intValue()
        L_0x0016:
            r0 = r8
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x001c:
            r5 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.config.MusicAttributionConfig.<init>(com.instagram.music.common.model.MusicOverlayStickerModel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public MusicAttributionConfig(AudioFilterType audioFilterType, MusicAssetModel musicAssetModel, String str, String str2, int i, boolean z, boolean z2) {
        this.A02 = musicAssetModel;
        this.A06 = str;
        this.A05 = z;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = z2;
        this.A01 = audioFilterType;
    }
}
