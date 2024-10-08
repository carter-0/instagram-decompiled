package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C44459CfH;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryThenAndNowStickerDict extends AnonymousClass0T0 implements Parcelable, StoryThenAndNowStickerDictIntf {
    public static final Parcelable.Creator CREATOR = new FK6(10);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final StoryThenAndNowStickerDict FBl() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryThenAndNowStickerDict) {
                StoryThenAndNowStickerDict storyThenAndNowStickerDict = (StoryThenAndNowStickerDict) obj;
                if (!0qQ.A0K(this.A01, storyThenAndNowStickerDict.A01) || !0qQ.A0K(this.A02, storyThenAndNowStickerDict.A02) || !0qQ.A0K(this.A03, storyThenAndNowStickerDict.A03) || !0qQ.A0K(this.A00, storyThenAndNowStickerDict.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A00) ? 1 : 0);
    }

    public final String AaI() {
        return this.A01;
    }

    public final String Afg() {
        return this.A02;
    }

    public final Boolean CPN() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryThenAndNowStickerDict", C44459CfH.A00(this));
    }

    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public StoryThenAndNowStickerDict(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = bool;
    }
}
