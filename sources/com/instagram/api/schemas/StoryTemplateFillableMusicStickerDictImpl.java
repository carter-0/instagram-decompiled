package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C41845B3m;
import X.C44450Cf8;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateFillableMusicStickerDictImpl extends AnonymousClass0T0 implements Parcelable, StoryTemplateFillableMusicStickerDict {
    public static final Parcelable.Creator CREATOR = new FK6(6);
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Integer A05;
    public final String A06;

    public final StoryTemplateFillableMusicStickerDictImpl FBa() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateFillableMusicStickerDictImpl) {
                StoryTemplateFillableMusicStickerDictImpl storyTemplateFillableMusicStickerDictImpl = (StoryTemplateFillableMusicStickerDictImpl) obj;
                if (!0qQ.A0K(this.A06, storyTemplateFillableMusicStickerDictImpl.A06) || !0qQ.A0K(this.A00, storyTemplateFillableMusicStickerDictImpl.A00) || !0qQ.A0K(this.A01, storyTemplateFillableMusicStickerDictImpl.A01) || !0qQ.A0K(this.A02, storyTemplateFillableMusicStickerDictImpl.A02) || !0qQ.A0K(this.A03, storyTemplateFillableMusicStickerDictImpl.A03) || !0qQ.A0K(this.A04, storyTemplateFillableMusicStickerDictImpl.A04) || !0qQ.A0K(this.A05, storyTemplateFillableMusicStickerDictImpl.A05)) {
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
        AnonymousClass7TH.A0P(parcel, this.A01);
        AnonymousClass7TH.A0P(parcel, this.A02);
        AnonymousClass7TH.A0P(parcel, this.A03);
        AnonymousClass7TH.A0P(parcel, this.A04);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
    }

    public final String AyE() {
        return this.A06;
    }

    public final Float BCt() {
        return this.A00;
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
        return C41845B3m.A0T("XDTStoryTemplateFillableMusicStickerDict", C44450Cf8.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public StoryTemplateFillableMusicStickerDictImpl(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, String str) {
        this.A06 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = num;
    }
}
