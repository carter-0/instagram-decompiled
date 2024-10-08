package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C393579wf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateGiphyStickerImageDict extends AnonymousClass0T0 implements Parcelable, StoryTemplateGiphyStickerImageDictIntf {
    public static final Parcelable.Creator CREATOR = new C376419Hx(40);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final StoryTemplateGiphyStickerImageDict FBd() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateGiphyStickerImageDict) {
                StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = (StoryTemplateGiphyStickerImageDict) obj;
                if (!0qQ.A0K(this.A00, storyTemplateGiphyStickerImageDict.A00) || !0qQ.A0K(this.A01, storyTemplateGiphyStickerImageDict.A01) || !0qQ.A0K(this.A02, storyTemplateGiphyStickerImageDict.A02) || !0qQ.A0K(this.A03, storyTemplateGiphyStickerImageDict.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A03;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final String BCv() {
        return this.A00;
    }

    public final String BUL() {
        return this.A01;
    }

    public final String CGZ() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateGiphyStickerImageDict", C393579wf.A00(this));
    }

    public final String getUrl() {
        return this.A02;
    }

    public StoryTemplateGiphyStickerImageDict(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
