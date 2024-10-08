package com.instagram.clips.model.metadata;

import X.002;
import X.0qQ;
import X.0wb;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

public final class AudioPageMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(74);
    public String A00;
    public final AudioFilterType A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final MusicAttributionConfig A04;
    public final AudioType A05;
    public final MusicDataSource A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioPageMetadata) {
                AudioPageMetadata audioPageMetadata = (AudioPageMetadata) obj;
                if (!0qQ.A0K(this.A00, audioPageMetadata.A00) || !0qQ.A0K(this.A07, audioPageMetadata.A07) || !0qQ.A0K(this.A08, audioPageMetadata.A08) || this.A0O != audioPageMetadata.A0O || !0qQ.A0K(this.A09, audioPageMetadata.A09) || !0qQ.A0K(this.A0B, audioPageMetadata.A0B) || !0qQ.A0K(this.A02, audioPageMetadata.A02) || !0qQ.A0K(this.A03, audioPageMetadata.A03) || !0qQ.A0K(this.A0D, audioPageMetadata.A0D) || !0qQ.A0K(this.A0M, audioPageMetadata.A0M) || !0qQ.A0K(this.A0J, audioPageMetadata.A0J) || !0qQ.A0K(this.A0K, audioPageMetadata.A0K) || !0qQ.A0K(this.A0C, audioPageMetadata.A0C) || !0qQ.A0K(this.A0N, audioPageMetadata.A0N) || this.A05 != audioPageMetadata.A05 || this.A0Q != audioPageMetadata.A0Q || !0qQ.A0K(this.A0L, audioPageMetadata.A0L) || !0qQ.A0K(this.A06, audioPageMetadata.A06) || this.A0P != audioPageMetadata.A0P || this.A0T != audioPageMetadata.A0T || this.A0R != audioPageMetadata.A0R || !0qQ.A0K(this.A04, audioPageMetadata.A04) || !0qQ.A0K(this.A0I, audioPageMetadata.A0I) || !0qQ.A0K(this.A0E, audioPageMetadata.A0E) || !0qQ.A0K(this.A0F, audioPageMetadata.A0F) || !0qQ.A0K(this.A0A, audioPageMetadata.A0A) || !0qQ.A0K(this.A0H, audioPageMetadata.A0H) || !0qQ.A0K(this.A0G, audioPageMetadata.A0G) || this.A0S != audioPageMetadata.A0S || this.A01 != audioPageMetadata.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0N);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        boolean z = this.A0O;
        boolean z2 = this.A0Q;
        int A092 = AnonymousClass7TF.A09(this.A0T, AnonymousClass7TF.A09(this.A0P, (((AnonymousClass7TF.A09(z2, (((((((((((((((((((((AnonymousClass7TF.A09(z, ((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0M)) * 31) + AnonymousClass7TG.A0E(this.A0J)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0N)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31));
        return AnonymousClass7TF.A09(this.A0S, (((((((((((((AnonymousClass7TF.A09(this.A0R, A092) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A0I)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0H)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioPageMetadata(assetId=");
        sb.append(this.A00);
        sb.append(", artistId=");
        sb.append(this.A07);
        sb.append(", artistName=");
        sb.append(this.A08);
        sb.append(", isArtistVerified=");
        sb.append(this.A0O);
        sb.append(", audioAssetIdOrAssetId=");
        sb.append(this.A09);
        sb.append(AnonymousClass000.A00(2005));
        sb.append(this.A0B);
        sb.append(", coverPhotoUrl=");
        sb.append(this.A02);
        sb.append(", coverThumbnailUrl=");
        sb.append(this.A03);
        sb.append(", mediaId=");
        sb.append(this.A0D);
        sb.append(", sourceMediaTapToken=");
        sb.append(this.A0M);
        sb.append(C273654mx.A00(1136));
        sb.append(this.A0J);
        sb.append(C273654mx.A00(1137));
        sb.append(this.A0K);
        sb.append(", deeplinkAssetId=");
        sb.append(this.A0C);
        sb.append(", trackTitle=");
        sb.append(this.A0N);
        sb.append(", type=");
        sb.append(this.A05);
        sb.append(AnonymousClass000.A00(2023));
        sb.append(this.A0Q);
        sb.append(", shouldMuteAudioReason=");
        sb.append(this.A0L);
        sb.append(", musicDataSource=");
        sb.append(this.A06);
        sb.append(", isAudioBookmarked=");
        sb.append(this.A0P);
        sb.append(AnonymousClass000.A00(846));
        sb.append(this.A0T);
        sb.append(", isEligibleForAudioEffects=");
        sb.append(this.A0R);
        sb.append(", musicAttributionConfig=");
        sb.append(this.A04);
        sb.append(AnonymousClass000.A00(403));
        sb.append(this.A0I);
        sb.append(C273654mx.A00(1107));
        sb.append(this.A0E);
        sb.append(", musicProduct=");
        sb.append(this.A0F);
        sb.append(", bestAudioClusterId=");
        sb.append(this.A0A);
        sb.append(", preloadedGridKey=");
        sb.append(this.A0H);
        sb.append(", originalAudioMediaId=");
        sb.append(this.A0G);
        sb.append(", isEntryPointDefaultSoundOn=");
        sb.append(this.A0S);
        sb.append(", existingAudioFilterType=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }

    public AudioPageMetadata(AudioFilterType audioFilterType, ImageUrl imageUrl, ImageUrl imageUrl2, MusicAttributionConfig musicAttributionConfig, AudioType audioType, MusicDataSource musicDataSource, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A0O = z;
        this.A09 = str4;
        this.A0B = str5;
        this.A02 = imageUrl;
        this.A03 = imageUrl2;
        this.A0D = str6;
        this.A0M = str7;
        this.A0J = str8;
        this.A0K = str9;
        String str19 = str10;
        this.A0C = str19;
        this.A0N = str11;
        this.A05 = audioType;
        this.A0Q = z2;
        this.A0L = str12;
        this.A06 = musicDataSource;
        this.A0P = z3;
        this.A0T = z4;
        this.A0R = z5;
        this.A04 = musicAttributionConfig;
        this.A0I = str13;
        this.A0E = str14;
        this.A0F = str15;
        this.A0A = str16;
        this.A0H = str17;
        this.A0G = str18;
        this.A0S = z6;
        this.A01 = audioFilterType;
        if (str10 != null) {
            this.A00 = str19;
        } else if (str3 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (imageUrl == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (str11 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (audioType == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (musicDataSource == null) {
            0wb.A03("AudioPageMetadata", 002.A0R("MusicDataSource is null for audio asset id: ", str));
        }
        if (this.A00 == null) {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
