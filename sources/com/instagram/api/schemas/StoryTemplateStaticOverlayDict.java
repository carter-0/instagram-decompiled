package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C393619wj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateStaticOverlayDict extends AnonymousClass0T0 implements StoryTemplateStaticOverlayDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(42);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final StoryTemplateGiphyStickerDict A06;
    public final String A07;
    public final String A08;

    public StoryTemplateStaticOverlayDict(StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict, String str, String str2, float f, float f2, float f3, float f4, float f5, int i) {
        0qQ.A0B(str, 4);
        0qQ.A0B(str2, 5);
        this.A06 = storyTemplateGiphyStickerDict;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = str;
        this.A08 = str2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = i;
    }

    public final StoryTemplateStaticOverlayDict FBh() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateStaticOverlayDict) {
                StoryTemplateStaticOverlayDict storyTemplateStaticOverlayDict = (StoryTemplateStaticOverlayDict) obj;
                if (!(0qQ.A0K(this.A06, storyTemplateStaticOverlayDict.A06) && Float.compare(this.A00, storyTemplateStaticOverlayDict.A00) == 0 && Float.compare(this.A01, storyTemplateStaticOverlayDict.A01) == 0 && 0qQ.A0K(this.A07, storyTemplateStaticOverlayDict.A07) && 0qQ.A0K(this.A08, storyTemplateStaticOverlayDict.A08) && Float.compare(this.A02, storyTemplateStaticOverlayDict.A02) == 0 && Float.compare(this.A03, storyTemplateStaticOverlayDict.A03) == 0 && Float.compare(this.A04, storyTemplateStaticOverlayDict.A04) == 0 && this.A05 == storyTemplateStaticOverlayDict.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict = this.A06;
        return ((((((((((((((((storyTemplateGiphyStickerDict == null ? 0 : storyTemplateGiphyStickerDict.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A07.hashCode()) * 31) + this.A08.hashCode()) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04)) * 31) + this.A05;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeInt(this.A05);
    }

    public final /* bridge */ /* synthetic */ StoryTemplateGiphyStickerDictIntf B9L() {
        return this.A06;
    }

    public final float BCs() {
        return this.A00;
    }

    public final float Bod() {
        return this.A01;
    }

    public final String Bzp() {
        return this.A07;
    }

    public final String C1V() {
        return this.A08;
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
        return new TreeUpdaterJNI("XDTStoryTemplateStaticOverlayDict", C393619wj.A00(this));
    }

    public final int getZIndex() {
        return this.A05;
    }
}
