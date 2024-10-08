package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C44420Cee;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryPromptFailureTooltipDict extends AnonymousClass0T0 implements Parcelable, StoryPromptFailureTooltipDictIntf {
    public static final Parcelable.Creator CREATOR = new C376419Hx(32);
    public final String A00;
    public final String A01;

    public final StoryPromptFailureTooltipDict FAp() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryPromptFailureTooltipDict) {
                StoryPromptFailureTooltipDict storyPromptFailureTooltipDict = (StoryPromptFailureTooltipDict) obj;
                if (!0qQ.A0K(this.A00, storyPromptFailureTooltipDict.A00) || !0qQ.A0K(this.A01, storyPromptFailureTooltipDict.A01)) {
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final String B28() {
        return this.A00;
    }

    public final String B29() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryPromptFailureTooltipDict", C44420Cee.A00(this));
    }

    public StoryPromptFailureTooltipDict(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
