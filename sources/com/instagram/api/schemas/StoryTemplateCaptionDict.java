package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C393519wZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateCaptionDict extends AnonymousClass0T0 implements StoryTemplateCaptionDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(36);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final ClipsTextFormatType A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public StoryTemplateCaptionDict(ClipsTextFormatType clipsTextFormatType, String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(str4, 4);
        0qQ.A0B(clipsTextFormatType, 6);
        0qQ.A0B(str6, 11);
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A0C = str4;
        this.A00 = f;
        this.A08 = clipsTextFormatType;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A0D = str5;
        this.A0E = str6;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A07 = i;
    }

    public final StoryTemplateCaptionDict FBX() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateCaptionDict) {
                StoryTemplateCaptionDict storyTemplateCaptionDict = (StoryTemplateCaptionDict) obj;
                if (!(0qQ.A0K(this.A09, storyTemplateCaptionDict.A09) && 0qQ.A0K(this.A0A, storyTemplateCaptionDict.A0A) && 0qQ.A0K(this.A0B, storyTemplateCaptionDict.A0B) && 0qQ.A0K(this.A0C, storyTemplateCaptionDict.A0C) && Float.compare(this.A00, storyTemplateCaptionDict.A00) == 0 && this.A08 == storyTemplateCaptionDict.A08 && Float.compare(this.A01, storyTemplateCaptionDict.A01) == 0 && Float.compare(this.A02, storyTemplateCaptionDict.A02) == 0 && Float.compare(this.A03, storyTemplateCaptionDict.A03) == 0 && 0qQ.A0K(this.A0D, storyTemplateCaptionDict.A0D) && 0qQ.A0K(this.A0E, storyTemplateCaptionDict.A0E) && Float.compare(this.A04, storyTemplateCaptionDict.A04) == 0 && Float.compare(this.A05, storyTemplateCaptionDict.A05) == 0 && Float.compare(this.A06, storyTemplateCaptionDict.A06) == 0 && this.A07 == storyTemplateCaptionDict.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((((this.A09.hashCode() * 31) + this.A0A.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0C.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A08.hashCode()) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31;
        String str = this.A0D;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A0E.hashCode()) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A05)) * 31) + Float.floatToIntBits(this.A06)) * 31) + this.A07;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A08, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
        parcel.writeFloat(this.A06);
        parcel.writeInt(this.A07);
    }

    public final String Aak() {
        return this.A09;
    }

    public final String Abi() {
        return this.A0A;
    }

    public final String Ap4() {
        return this.A0B;
    }

    public final String B0J() {
        return this.A0C;
    }

    public final float B78() {
        return this.A00;
    }

    public final ClipsTextFormatType B7W() {
        return this.A08;
    }

    public final float BCs() {
        return this.A01;
    }

    public final float Bod() {
        return this.A02;
    }

    public final float BpU() {
        return this.A03;
    }

    public final String Bqa() {
        return this.A0D;
    }

    public final float CGW() {
        return this.A04;
    }

    public final float CGs() {
        return this.A05;
    }

    public final float CHR() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateCaptionDict", C393519wZ.A00(this));
    }

    public final String getText() {
        return this.A0E;
    }

    public final int getZIndex() {
        return this.A07;
    }
}
