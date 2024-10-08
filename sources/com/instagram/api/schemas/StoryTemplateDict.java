package com.instagram.api.schemas;

import X.0qQ;
import X.A9D;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C393529wa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class StoryTemplateDict extends AnonymousClass0T0 implements StoryTemplateDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(37);
    public final StoryTemplateAssetDict A00;
    public final StoryTemplateFillableStickersDict A01;
    public final StoryTemplateMusicStickerDict A02;
    public final StoryTemplateReshareMediaDict A03;
    public final Boolean A04;
    public final Boolean A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;

    public final StoryTemplateDict FBY() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateDict) {
                StoryTemplateDict storyTemplateDict = (StoryTemplateDict) obj;
                if (!0qQ.A0K(this.A01, storyTemplateDict.A01) || !0qQ.A0K(this.A04, storyTemplateDict.A04) || !0qQ.A0K(this.A05, storyTemplateDict.A05) || !0qQ.A0K(this.A02, storyTemplateDict.A02) || !0qQ.A0K(this.A03, storyTemplateDict.A03) || !0qQ.A0K(this.A06, storyTemplateDict.A06) || !0qQ.A0K(this.A07, storyTemplateDict.A07) || !0qQ.A0K(this.A08, storyTemplateDict.A08) || !0qQ.A0K(this.A00, storyTemplateDict.A00) || !0qQ.A0K(this.A09, storyTemplateDict.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        StoryTemplateFillableStickersDict storyTemplateFillableStickersDict = this.A01;
        int i = 0;
        int hashCode = (storyTemplateFillableStickersDict == null ? 0 : storyTemplateFillableStickersDict.hashCode()) * 31;
        Boolean bool = this.A04;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A05;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = this.A02;
        int hashCode4 = (hashCode3 + (storyTemplateMusicStickerDict == null ? 0 : storyTemplateMusicStickerDict.hashCode())) * 31;
        StoryTemplateReshareMediaDict storyTemplateReshareMediaDict = this.A03;
        int hashCode5 = (hashCode4 + (storyTemplateReshareMediaDict == null ? 0 : storyTemplateReshareMediaDict.hashCode())) * 31;
        List list = this.A06;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A07;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A08;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        StoryTemplateAssetDict storyTemplateAssetDict = this.A00;
        int hashCode9 = (hashCode8 + (storyTemplateAssetDict == null ? 0 : storyTemplateAssetDict.hashCode())) * 31;
        List list4 = this.A09;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode9 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A05;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        List<Parcelable> list = this.A06;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        List<Parcelable> list2 = this.A07;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Parcelable writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i);
            }
        }
        List<Parcelable> list3 = this.A08;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Parcelable writeParcelable3 : list3) {
                parcel.writeParcelable(writeParcelable3, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeStringList(this.A09);
    }

    public final /* bridge */ /* synthetic */ A9D AKS() {
        return new A9D(this);
    }

    public final StoryTemplateFillableStickersDict B5p() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ StoryTemplateMusicStickerDictIntf BV3() {
        return this.A02;
    }

    public final StoryTemplateReshareMediaDict BnV() {
        return this.A03;
    }

    public final List C0B() {
        return this.A06;
    }

    public final List C0G() {
        return this.A07;
    }

    public final List C1I() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ StoryTemplateAssetDictIntf C4X() {
        return this.A00;
    }

    public final List C4d() {
        return this.A09;
    }

    public final Boolean CSG() {
        return this.A04;
    }

    public final Boolean CU1() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateDict", C393529wa.A00(this));
    }

    public StoryTemplateDict(StoryTemplateAssetDict storyTemplateAssetDict, StoryTemplateFillableStickersDict storyTemplateFillableStickersDict, StoryTemplateMusicStickerDict storyTemplateMusicStickerDict, StoryTemplateReshareMediaDict storyTemplateReshareMediaDict, Boolean bool, Boolean bool2, List list, List list2, List list3, List list4) {
        this.A01 = storyTemplateFillableStickersDict;
        this.A04 = bool;
        this.A05 = bool2;
        this.A02 = storyTemplateMusicStickerDict;
        this.A03 = storyTemplateReshareMediaDict;
        this.A06 = list;
        this.A07 = list2;
        this.A08 = list3;
        this.A00 = storyTemplateAssetDict;
        this.A09 = list4;
    }
}
