package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C393539wb;
import X.C39737A7d;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateFillableGalleryStickerDictImpl extends AnonymousClass0T0 implements StoryTemplateFillableGalleryStickerDict, Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(4);
    public final StoryTemplateFillableGalleryStickerShapes A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Integer A06;

    public final StoryTemplateFillableGalleryStickerDictImpl FBZ() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateFillableGalleryStickerDictImpl) {
                StoryTemplateFillableGalleryStickerDictImpl storyTemplateFillableGalleryStickerDictImpl = (StoryTemplateFillableGalleryStickerDictImpl) obj;
                if (this.A00 != storyTemplateFillableGalleryStickerDictImpl.A00 || !0qQ.A0K(this.A01, storyTemplateFillableGalleryStickerDictImpl.A01) || !0qQ.A0K(this.A02, storyTemplateFillableGalleryStickerDictImpl.A02) || !0qQ.A0K(this.A03, storyTemplateFillableGalleryStickerDictImpl.A03) || !0qQ.A0K(this.A04, storyTemplateFillableGalleryStickerDictImpl.A04) || !0qQ.A0K(this.A05, storyTemplateFillableGalleryStickerDictImpl.A05) || !0qQ.A0K(this.A06, storyTemplateFillableGalleryStickerDictImpl.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        AnonymousClass7TH.A0P(parcel, this.A01);
        AnonymousClass7TH.A0P(parcel, this.A02);
        AnonymousClass7TH.A0P(parcel, this.A03);
        AnonymousClass7TH.A0P(parcel, this.A04);
        AnonymousClass7TH.A0P(parcel, this.A05);
        AnonymousClass7TG.A16(parcel, this.A06, 0, 1);
    }

    public final /* bridge */ /* synthetic */ C39737A7d AKT() {
        return new C39737A7d(this);
    }

    public final StoryTemplateFillableGalleryStickerShapes B8s() {
        return this.A00;
    }

    public final Float BCt() {
        return this.A01;
    }

    public final Float Bof() {
        return this.A02;
    }

    public final Float CGX() {
        return this.A03;
    }

    public final Float CGt() {
        return this.A04;
    }

    public final Float CHS() {
        return this.A05;
    }

    public final Integer CHa() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateFillableGalleryStickerDict", C393539wb.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public StoryTemplateFillableGalleryStickerDictImpl(StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes, Float f, Float f2, Float f3, Float f4, Float f5, Integer num) {
        this.A00 = storyTemplateFillableGalleryStickerShapes;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A05 = f5;
        this.A06 = num;
    }
}
