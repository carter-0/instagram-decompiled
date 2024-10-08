package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass8IJ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

public final class AudioOverlayTrack extends AnonymousClass0T0 implements Parcelable {
    public static final C376399Hv CREATOR = new C376399Hv(61);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass8IJ A05;
    public DownloadedTrack A06;
    public InstagramAudioApplySource A07;
    public MusicAssetModel A08;
    public MusicBrowseCategory A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioOverlayTrack(com.instagram.music.common.model.MusicAssetModel r16, int r17, int r18) {
        /*
            r15 = this;
            r0 = 1
            r4 = r16
            X.0qQ.A0B(r4, r0)
            java.lang.String r6 = r4.A0B
            java.lang.String r7 = r4.A0E
            java.lang.String r8 = r4.A0G
            r1 = 0
            r13 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r15
            r11 = r17
            r12 = r18
            r2 = r1
            r3 = r1
            r5 = r1
            r9 = r1
            r14 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r17 < 0) goto L_0x002e
            if (r18 <= 0) goto L_0x0022
            return
        L_0x0022:
            java.lang.String r0 = "Snippet must have a duration longer than zero: "
            java.lang.String r1 = X.002.A0O(r0, r12)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.String r0 = "Snippet start time must be greater than or equal to zero: "
            java.lang.String r1 = X.002.A0O(r0, r11)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.model.AudioOverlayTrack.<init>(com.instagram.music.common.model.MusicAssetModel, int, int):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioOverlayTrack) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) obj;
                if (this.A03 != audioOverlayTrack.A03 || this.A02 != audioOverlayTrack.A02 || this.A04 != audioOverlayTrack.A04 || this.A01 != audioOverlayTrack.A01 || !0qQ.A0K(this.A0B, audioOverlayTrack.A0B) || !0qQ.A0K(this.A0A, audioOverlayTrack.A0A) || !0qQ.A0K(this.A0E, audioOverlayTrack.A0E) || !0qQ.A0K(this.A09, audioOverlayTrack.A09) || !0qQ.A0K(this.A08, audioOverlayTrack.A08) || !0qQ.A0K(this.A06, audioOverlayTrack.A06) || this.A05 != audioOverlayTrack.A05 || Float.compare(this.A00, audioOverlayTrack.A00) != 0 || !0qQ.A0K(this.A0C, audioOverlayTrack.A0C) || this.A07 != audioOverlayTrack.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((((this.A03 * 31) + this.A02) * 31) + this.A04) * 31) + this.A01) * 31;
        String str = this.A0B;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0A;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0E;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MusicBrowseCategory musicBrowseCategory = this.A09;
        int hashCode4 = (hashCode3 + (musicBrowseCategory == null ? 0 : musicBrowseCategory.hashCode())) * 31;
        MusicAssetModel musicAssetModel = this.A08;
        int hashCode5 = (hashCode4 + (musicAssetModel == null ? 0 : musicAssetModel.hashCode())) * 31;
        DownloadedTrack downloadedTrack = this.A06;
        int hashCode6 = (hashCode5 + (downloadedTrack == null ? 0 : downloadedTrack.hashCode())) * 31;
        AnonymousClass8IJ r0 = this.A05;
        int hashCode7 = (((hashCode6 + (r0 == null ? 0 : r0.hashCode())) * 31) + Float.floatToIntBits(this.A00)) * 31;
        String str4 = this.A0C;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InstagramAudioApplySource instagramAudioApplySource = this.A07;
        if (instagramAudioApplySource != null) {
            i2 = instagramAudioApplySource.hashCode();
        }
        return hashCode8 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A06, i);
        AnonymousClass8IJ r0 = this.A05;
        if (r0 != null) {
            str = r0.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0D);
    }

    public final void A00(MusicAssetModel musicAssetModel) {
        this.A08 = musicAssetModel;
        this.A0A = musicAssetModel.A0E;
        this.A0B = musicAssetModel.A0B;
        this.A0E = musicAssetModel.A0G;
    }

    public final boolean A01() {
        MusicAssetModel musicAssetModel = this.A08;
        if (musicAssetModel == null || !musicAssetModel.A0T) {
            return false;
        }
        return true;
    }

    public AudioOverlayTrack(AnonymousClass8IJ r2, DownloadedTrack downloadedTrack, InstagramAudioApplySource instagramAudioApplySource, MusicAssetModel musicAssetModel, MusicBrowseCategory musicBrowseCategory, String str, String str2, String str3, String str4, float f, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A0B = str;
        this.A0A = str2;
        this.A0E = str3;
        this.A09 = musicBrowseCategory;
        this.A08 = musicAssetModel;
        this.A06 = downloadedTrack;
        this.A05 = r2;
        this.A00 = f;
        this.A0C = str4;
        this.A07 = instagramAudioApplySource;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A0D = obj;
    }

    public AudioOverlayTrack() {
        this((AnonymousClass8IJ) null, (DownloadedTrack) null, (InstagramAudioApplySource) null, (MusicAssetModel) null, (MusicBrowseCategory) null, (String) null, (String) null, (String) null, (String) null, 1.0f, 0, 0, 0, 0);
    }
}
