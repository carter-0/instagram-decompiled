package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C393609wi;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateMusicStickerDict extends AnonymousClass0T0 implements StoryTemplateMusicStickerDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(41);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Lyrics A09;
    public final StoryTemplateMusicAssetInfoDict A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public StoryTemplateMusicStickerDict(Lyrics lyrics, StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict, String str, String str2, String str3, String str4, String str5, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, int i4) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        0qQ.A0B(str5, 7);
        this.A0B = str;
        this.A0C = str2;
        this.A05 = i;
        this.A0D = str3;
        this.A0E = str4;
        this.A06 = i2;
        this.A0F = str5;
        this.A00 = f;
        this.A09 = lyrics;
        this.A0A = storyTemplateMusicAssetInfoDict;
        this.A07 = i3;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A08 = i4;
    }

    public final StoryTemplateMusicStickerDict FBf() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateMusicStickerDict) {
                StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = (StoryTemplateMusicStickerDict) obj;
                if (!(0qQ.A0K(this.A0B, storyTemplateMusicStickerDict.A0B) && 0qQ.A0K(this.A0C, storyTemplateMusicStickerDict.A0C) && this.A05 == storyTemplateMusicStickerDict.A05 && 0qQ.A0K(this.A0D, storyTemplateMusicStickerDict.A0D) && 0qQ.A0K(this.A0E, storyTemplateMusicStickerDict.A0E) && this.A06 == storyTemplateMusicStickerDict.A06 && 0qQ.A0K(this.A0F, storyTemplateMusicStickerDict.A0F) && Float.compare(this.A00, storyTemplateMusicStickerDict.A00) == 0 && 0qQ.A0K(this.A09, storyTemplateMusicStickerDict.A09) && 0qQ.A0K(this.A0A, storyTemplateMusicStickerDict.A0A) && this.A07 == storyTemplateMusicStickerDict.A07 && Float.compare(this.A01, storyTemplateMusicStickerDict.A01) == 0 && Float.compare(this.A02, storyTemplateMusicStickerDict.A02) == 0 && Float.compare(this.A03, storyTemplateMusicStickerDict.A03) == 0 && Float.compare(this.A04, storyTemplateMusicStickerDict.A04) == 0 && this.A08 == storyTemplateMusicStickerDict.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((this.A0B.hashCode() * 31) + this.A0C.hashCode()) * 31) + this.A05) * 31) + this.A0D.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A06) * 31) + this.A0F.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        Lyrics lyrics = this.A09;
        int i = 0;
        int hashCode2 = (hashCode + (lyrics == null ? 0 : lyrics.hashCode())) * 31;
        StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = this.A0A;
        if (storyTemplateMusicAssetInfoDict != null) {
            i = storyTemplateMusicAssetInfoDict.hashCode();
        }
        return ((((((((((((hashCode2 + i) * 31) + this.A07) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04)) * 31) + this.A08;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0F);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeInt(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeInt(this.A08);
    }

    public final String Ad0() {
        return this.A0B;
    }

    public final int AwP() {
        return this.A06;
    }

    public final String AyE() {
        return this.A0F;
    }

    public final float BCs() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ LyricsIntf BOn() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ StoryTemplateMusicAssetInfoDictIntf BUj() {
        return this.A0A;
    }

    public final float Bod() {
        return this.A01;
    }

    public final float CGW() {
        return this.A02;
    }

    public final float CGs() {
        return this.A03;
    }

    public final float CHR() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateMusicStickerDict", C393609wi.A00(this));
    }

    public final String getAudioAssetId() {
        return this.A0C;
    }

    public final int getAudioAssetStartTimeInMs() {
        return this.A05;
    }

    public final String getAudioClusterId() {
        return this.A0D;
    }

    public final String getColor() {
        return this.A0E;
    }

    public final int getOverlapDurationInMs() {
        return this.A07;
    }

    public final int getZIndex() {
        return this.A08;
    }
}
