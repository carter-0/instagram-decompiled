package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C393499wX;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateAvatarStickerOverlayDictImpl extends AnonymousClass0T0 implements StoryTemplateAvatarStickerOverlayDict, Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(3);
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final StoryTemplateAvatarStickerOverlayDictImpl FBW() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateAvatarStickerOverlayDictImpl) {
                StoryTemplateAvatarStickerOverlayDictImpl storyTemplateAvatarStickerOverlayDictImpl = (StoryTemplateAvatarStickerOverlayDictImpl) obj;
                if (!0qQ.A0K(this.A06, storyTemplateAvatarStickerOverlayDictImpl.A06) || !0qQ.A0K(this.A00, storyTemplateAvatarStickerOverlayDictImpl.A00) || !0qQ.A0K(this.A07, storyTemplateAvatarStickerOverlayDictImpl.A07) || !0qQ.A0K(this.A08, storyTemplateAvatarStickerOverlayDictImpl.A08) || !0qQ.A0K(this.A01, storyTemplateAvatarStickerOverlayDictImpl.A01) || !0qQ.A0K(this.A02, storyTemplateAvatarStickerOverlayDictImpl.A02) || !0qQ.A0K(this.A03, storyTemplateAvatarStickerOverlayDictImpl.A03) || !0qQ.A0K(this.A04, storyTemplateAvatarStickerOverlayDictImpl.A04) || !0qQ.A0K(this.A05, storyTemplateAvatarStickerOverlayDictImpl.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        AnonymousClass7TH.A0P(parcel, this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        AnonymousClass7TH.A0P(parcel, this.A01);
        AnonymousClass7TH.A0P(parcel, this.A02);
        AnonymousClass7TH.A0P(parcel, this.A03);
        AnonymousClass7TH.A0P(parcel, this.A04);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
    }

    public final String B2z() {
        return this.A06;
    }

    public final Float BCt() {
        return this.A00;
    }

    public final String BI3() {
        return this.A07;
    }

    public final Float Bof() {
        return this.A01;
    }

    public final Float CGX() {
        return this.A02;
    }

    public final Float CGt() {
        return this.A03;
    }

    public final Float CHS() {
        return this.A04;
    }

    public final Integer CHa() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateAvatarStickerOverlayDict", C393499wX.A00(this));
    }

    public final String getMediaType() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public StoryTemplateAvatarStickerOverlayDictImpl(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, String str, String str2, String str3) {
        this.A06 = str;
        this.A00 = f;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = num;
    }
}
