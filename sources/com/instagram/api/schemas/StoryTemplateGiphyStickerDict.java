package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C393569we;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateGiphyStickerDict extends AnonymousClass0T0 implements Parcelable, StoryTemplateGiphyStickerDictIntf {
    public static final Parcelable.Creator CREATOR = new C376419Hx(39);
    public final StoryTemplateGiphyStickerImageDict A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final StoryTemplateGiphyStickerDict FBc() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateGiphyStickerDict) {
                StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict = (StoryTemplateGiphyStickerDict) obj;
                if (!0qQ.A0K(this.A01, storyTemplateGiphyStickerDict.A01) || !0qQ.A0K(this.A00, storyTemplateGiphyStickerDict.A00) || !0qQ.A0K(this.A02, storyTemplateGiphyStickerDict.A02) || !0qQ.A0K(this.A03, storyTemplateGiphyStickerDict.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = this.A00;
        int hashCode2 = (hashCode + (storyTemplateGiphyStickerImageDict == null ? 0 : storyTemplateGiphyStickerImageDict.hashCode())) * 31;
        String str2 = this.A02;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final String B9D() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ StoryTemplateGiphyStickerImageDictIntf BFu() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateGiphyStickerDict", C393569we.A00(this));
    }

    public final String getTitle() {
        return this.A02;
    }

    public final String getUsername() {
        return this.A03;
    }

    public StoryTemplateGiphyStickerDict(StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = storyTemplateGiphyStickerImageDict;
        this.A02 = str2;
        this.A03 = str3;
    }
}
