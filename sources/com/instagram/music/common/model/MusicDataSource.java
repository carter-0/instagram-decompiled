package com.instagram.music.common.model;

import X.002;
import X.0qQ;
import X.0wb;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass9L9;
import X.C376399Hv;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class MusicDataSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(64);
    public Uri A00;
    public AudioType A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 9));

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        AudioType audioType = this.A01;
        if (audioType != null) {
            str = audioType.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1.equals(((com.instagram.music.common.model.MusicDataSource) r6).A04) == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r1.equals(((com.instagram.music.common.model.MusicDataSource) r6).A00) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.equals(((com.instagram.music.common.model.MusicDataSource) r6).A05) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.instagram.music.common.model.MusicDataSource
            r4 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r5.A05
            if (r1 == 0) goto L_0x0015
            r0 = r6
            com.instagram.music.common.model.MusicDataSource r0 = (com.instagram.music.common.model.MusicDataSource) r0
            java.lang.String r0 = r0.A05
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x0026
            r0 = r6
            com.instagram.music.common.model.MusicDataSource r0 = (com.instagram.music.common.model.MusicDataSource) r0
            java.lang.String r0 = r0.A04
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            android.net.Uri r1 = r5.A00
            if (r1 == 0) goto L_0x0036
            com.instagram.music.common.model.MusicDataSource r6 = (com.instagram.music.common.model.MusicDataSource) r6
            android.net.Uri r0 = r6.A00
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r3 != 0) goto L_0x003d
            if (r2 != 0) goto L_0x003d
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.model.MusicDataSource.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A04, this.A00, this.A03, this.A02});
    }

    public MusicDataSource(Parcel parcel) {
        AudioType valueOf;
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = AudioType.valueOf(readString);
        }
        this.A01 = valueOf;
    }

    public MusicDataSource(Uri uri, AudioType audioType, String str, String str2, String str3, String str4) {
        if (str == null && str2 == null && uri == null) {
            0wb.A01.Ew9("MusicDataSource", 002.A0R("Valid url expected for music asset ", str3));
        }
        this.A05 = str;
        this.A04 = str2;
        this.A00 = uri;
        this.A03 = str3;
        this.A02 = str4;
        this.A01 = audioType;
    }

    public MusicDataSource() {
    }
}
