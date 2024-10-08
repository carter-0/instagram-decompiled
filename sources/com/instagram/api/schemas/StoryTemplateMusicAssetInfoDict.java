package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C393589wg;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateMusicAssetInfoDict extends AnonymousClass0T0 implements Parcelable, StoryTemplateMusicAssetInfoDictIntf {
    public static final Parcelable.Creator CREATOR = new FK6(7);
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final StoryTemplateMusicAssetInfoDict FBe() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateMusicAssetInfoDict) {
                StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = (StoryTemplateMusicAssetInfoDict) obj;
                if (!0qQ.A0K(this.A03, storyTemplateMusicAssetInfoDict.A03) || !0qQ.A0K(this.A04, storyTemplateMusicAssetInfoDict.A04) || !0qQ.A0K(this.A02, storyTemplateMusicAssetInfoDict.A02) || !0qQ.A0K(this.A00, storyTemplateMusicAssetInfoDict.A00) || !0qQ.A0K(this.A01, storyTemplateMusicAssetInfoDict.A01) || !0qQ.A0K(this.A05, storyTemplateMusicAssetInfoDict.A05) || !0qQ.A0K(this.A06, storyTemplateMusicAssetInfoDict.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A01;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }

    public final Integer AzJ() {
        return this.A02;
    }

    public final Boolean BBW() {
        return this.A00;
    }

    public final Boolean CSt() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateMusicAssetInfoDict", C393589wg.A00(this));
    }

    public final String getCoverArtworkThumbnailUri() {
        return this.A03;
    }

    public final String getCoverArtworkUri() {
        return this.A04;
    }

    public final String getProgressiveDownloadUrl() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        int i = 0;
        int A0E = ((((((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return A0E + i;
    }

    public StoryTemplateMusicAssetInfoDict(Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = num;
        this.A00 = bool;
        this.A01 = bool2;
        this.A05 = str3;
        this.A06 = str4;
    }
}
